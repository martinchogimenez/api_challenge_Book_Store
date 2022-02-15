package ar.steps;

import api.model.Book;
import ar.validator.GetValidator;
import ar.validator.PostValidator;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import services.BaseService;

public class NCommonSteps extends PageSteps {


    @And("expected response is obtained.")
    public void expectedResponseIsObtained() {
        PostValidator.Validate();

    }

    @And("a field to do the sort")
    public void aFieldToDoTheSort() {
        BaseService.BOOK_FIELD.set("title");
        
    }

    @And("a sort order")
    public void aSortOrder() {
        BaseService.BOOK_SORT.set("asc");
    }

    @And("a book format")
    public void aBookFormat() {
        BaseService.BOOK_FORMAT.set("Paperback");
        
    }

    @And("a book author")
    public void aBookAuthor() {
        BaseService.BOOK_AUTHOR.set("J.K.Rowling");
    }

    @And("a book language")
    public void aBookLanguage() {
        BaseService.BOOK_LANGUAGE.set("English");
    }

    @And("a book publication year")
    public void aBookPublicationYear() {
        BaseService.PUBLICATION_YEAR.set("1998");
    }

    @And("a book description")
    public void aBookDescription() {
        BaseService.BOOK_DESCRIPTION.set("It is a book about a ring and his power");
        
    }

    @And("a book rating")
    public void aBookRating() {
        BaseService.BASE_URL.set("http://localhost:3001");
        BaseService.BOOK_RATING.set("4");
    }

    @And("a book field")
    public void aBookField() {
        BaseService.BOOK_FIELD.set("rating");
        
    }

    @And("the new value to the field")
    public void theNewValueToTheField() {
        BaseService.BOOK_RATING.set("5");

    }



    @And("the expected response is obtained")
    public void theExpectedResponseIsObtained() {
        GetValidator.BookValidator();
    }


    @And("i store the book id.")
    public void iStoreTheBookId() {
        Book response = (Book) APIManager.getLastResponse().getResponse();
        String Id = response.getId();
        BaseService.BOOK_ID.set(Id);
    }

    @Given("a filter sort")
    public void aFilterSort() {
        BaseService.BASE_URL.set("http://localhost:3001");
    }
}
