package services;


import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;


public class DelBookService extends BaseService {



    public static Response delete(String jsonName) {
        return delete(jsonName,null,setParams());
    }


    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base_url", BASE_URL.get());
        params.put("book_id",BOOK_ID.get());
        return params;
    }
}


