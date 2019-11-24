package com.demo;


public class Playstore {
    
    private String App;
    private String Category;
    private String Rating;
    private String Reviews ;
    private String Size;
    private String Installs;
    private String Type;
    private String Price;
    private String Content_Rating;
    private String Genres;
    private String Last_Updated;
    private String Current_Ver;
    private String Android_Ver;
    
    public Playstore(String App, String Category, String Rating, String Reviews,
            String Size, String Installs, String Type, String Price,
            String Content_Rating, String Genres, String Last_Updated,
            String Current_Ver, String Android_Ver){
    
        this.App = App;
        this.Category = Category;
        this.Rating = Rating;
        this.Reviews = Reviews;
        this.Android_Ver = Android_Ver;
        this.Content_Rating = Content_Rating;
        this.Current_Ver = Current_Ver;
        this.Genres = Genres;
        this.Installs = Installs;
        this.Price = Price;
        this.Size = Size;
        this.Type = Type;
        this.Last_Updated = Last_Updated;
    }
    
    public Playstore(String Category){
    this.Category = Category;
    }

    public String getApp() {
        return App;
    }

    public void setApp(String App) {
        this.App = App;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public String getReviews() {
        return Reviews;
    }

    public void setReviews(String Reviews) {
        this.Reviews = Reviews;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getInstalls() {
        return Installs;
    }

    public void setInstalls(String Installs) {
        this.Installs = Installs;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getContent_Rating() {
        return Content_Rating;
    }

    public void setContent_Rating(String Content_Rating) {
        this.Content_Rating = Content_Rating;
    }

    public String getGenres() {
        return Genres;
    }

    public void setGenres(String Genres) {
        this.Genres = Genres;
    }

    public String getLast_Updated() {
        return Last_Updated;
    }

    public void setLast_Updated(String Last_Updated) {
        this.Last_Updated = Last_Updated;
    }

    public String getCurrent_Ver() {
        return Current_Ver;
    }

    public void setCurrent_Ver(String Current_Ver) {
        this.Current_Ver = Current_Ver;
    }

    public String getAndroid_Ver() {
        return Android_Ver;
    }

    public void setAndroid_Ver(String Android_Ver) {
        this.Android_Ver = Android_Ver;
    }
    
}