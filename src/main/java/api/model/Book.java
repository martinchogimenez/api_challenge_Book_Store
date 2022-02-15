package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Book {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("format")
    private String format;
    @JsonProperty("author")
    private String author;
    @JsonProperty("language")
    private String language;
    @JsonProperty("pubYear")
    private String pubYear;
    @JsonProperty("description")
    private String description;
    @JsonProperty("rating")
    private Integer rating;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPubYear() { return pubYear; }

    public void setPubYear(String pubYear) {
        this.pubYear = pubYear;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRating() { return rating; }

    public void setRating(Integer rating) {
        this.rating = rating;
    }


}
