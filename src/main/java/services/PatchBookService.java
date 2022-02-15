package services;


import api.model.Book;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;


public class PatchBookService extends BaseService {




    public static Response patch(String jsonName) {
        return patch(jsonName, Book.class,setParams());
    }




    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base_url", BASE_URL.get());
        params.put("book_id",BOOK_ID.get());
        params.put("book_field",BOOK_FIELD.get());
        params.put("book_rating",BOOK_RATING.get());
        return params;
    }
}


