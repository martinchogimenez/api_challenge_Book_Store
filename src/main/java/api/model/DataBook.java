package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataBook {

    @JsonProperty("data")
    private Book data;

    public Book getData() {
        return data;
    }

    public void setData(Book data) {
        this.data = data;
    }


}
