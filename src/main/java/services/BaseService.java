package services;

import com.crowdar.api.rest.MethodsService;


public class BaseService extends MethodsService {

    public static final ThreadLocal<String> BASE_URL = new ThreadLocal<String>();
    public static final ThreadLocal<String> BOOK_TITLE = new ThreadLocal<String>();
    public static final ThreadLocal<String> BOOK_FORMAT = new ThreadLocal<String>();
    public static final ThreadLocal<String> BOOK_AUTHOR = new ThreadLocal<String>();
    public static final ThreadLocal<String> BOOK_LANGUAGE = new ThreadLocal<String>();
    public static final ThreadLocal<String> PUBLICATION_YEAR = new ThreadLocal<String>();
    public static final ThreadLocal<String> BOOK_DESCRIPTION = new ThreadLocal<String>();
    public static final ThreadLocal<String> BOOK_RATING = new ThreadLocal<>();
    public static final ThreadLocal<String> BOOK_FIELD = new ThreadLocal<String>();
    public static final ThreadLocal<String> BOOK_SORT = new ThreadLocal<String>();
    public static final ThreadLocal<String> BOOK_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> CONTENT_TYPE = new ThreadLocal<String>();



}