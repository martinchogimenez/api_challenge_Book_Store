package ar.validator;

import api.model.Book;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
public class PostValidator {




    public static void Validate() {
        Book response = (Book) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response.getId(),"The new book has not been stored");
    }
}
