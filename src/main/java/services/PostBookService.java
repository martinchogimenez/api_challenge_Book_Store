package services;


import api.model.Book;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;


public class PostBookService extends BaseService {




    public static Response post(String jsonName) {
        return post(jsonName, Book.class,setParams());
    }



    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();

        params.put("base_url", BASE_URL.get());
        params.put("book_title", BOOK_TITLE.get());
        params.put("book_format", BOOK_FORMAT.get());
        params.put("book_author", BOOK_AUTHOR.get());
        params.put("book_language", BOOK_LANGUAGE.get());
        params.put("publication_year", PUBLICATION_YEAR.get());
        params.put("book_description", BOOK_DESCRIPTION.get());
        params.put("book_rating", BOOK_RATING.get());

        return params;
    }
}


