package ar.validator;

import api.model.Book;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;


public class GetValidator {



    public static void BookValidator() {


        Book[] response = (Book[]) APIManager.getLastResponse().getResponse();
        for (Book Book: response) {
            String id = Book.getId();
            Assert.assertNotNull(id, "Post request has not been done");
        }




    }
}
