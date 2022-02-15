package ar.validator;

import api.model.Book;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import services.BaseService;

public class PutValidator {


        public static void validate(){
            Book response = (Book) APIManager.getLastResponse().getResponse();
            Integer UpdatedRating = response.getRating();

            Assert.assertEquals(UpdatedRating, BaseService.BOOK_RATING.get());
        }
    }


