package services;


import api.model.Book;
import api.model.DataBook;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;


public class GetBookService extends BaseService {


    public static Response get(String jsonName) {return get(jsonName, DataBook[].class,setParams());}



    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        return params;
    }
}


