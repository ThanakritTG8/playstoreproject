package com.demo;

public class Playstore {

    private String App;
    private String Category;
    private double Rating;
    private int Reviews;
    private String Size;
    private int Installs;
    private String Type;
    private double Price;
    private String Content_Rating;
    private String Genres;
    private String Last_Updated;
    private String Current_Ver;
    private String Android_Ver;

//    private String app;
//    private String Translate_Review;
//    private String Sentiment;
//    private double Sentiment_Polarity;
//    private double Sentiment_Subjectivity;

    public Playstore(String App, String Category, double Rating, int Reviews,
            String Size, int Installs, String Type, double Price,
            String Content_Rating, String Genres, String Last_Updated,
            String Current_Ver, String Android_Ver) {

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

//    public Playstore(String App, String Category, double Rating, int Reviews, String Size, int Installs,
//            String Type, double Price, String Content_Rating, String Genres, String Last_Updated, String Current_Ver, String Android_Ver,
//            String app, String Translate_Review, String Sentiment, double Sentiment_Polarity, double Sentiment_Subjectivity) {
//        this.App = App;
//        this.Category = Category;
//        this.Rating = Rating;
//        this.Reviews = Reviews;
//        this.Size = Size;
//        this.Installs = Installs;
//        this.Type = Type;
//        this.Price = Price;
//        this.Content_Rating = Content_Rating;
//        this.Genres = Genres;
//        this.Last_Updated = Last_Updated;
//        this.Current_Ver = Current_Ver;
//        this.Android_Ver = Android_Ver;
//        this.app = app;
//        this.Translate_Review = Translate_Review;
//        this.Sentiment = Sentiment;
//        this.Sentiment_Polarity = Sentiment_Polarity;
//        this.Sentiment_Subjectivity = Sentiment_Subjectivity;
//    }

    public Playstore(String Category) {
        this.Category = Category;
    }

    public String getApp() {
        return App;
    }

    public void setApp(String App) {
        this.App = App;
    }

//    public String getapp() {
//        return app;
//    }
//
//    public void setapp() {
//        this.app = app;
//    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double Rating) {
        this.Rating = Rating;
    }

    public int getReviews() {
        return Reviews;
    }

    public void setReviews(int Reviews) {
        this.Reviews = Reviews;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public int getInstalls() {
        return Installs;
    }

    public void setInstalls(int Installs) {
        this.Installs = Installs;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
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

//    public String getTranslate_Review() {
//        return Translate_Review;
//    }
//
//    public void setTranslate_Review(String Translate_Review) {
//        this.Translate_Review = Translate_Review;
//    }
//
//    public String getSentiment() {
//        return Sentiment;
//    }
//
//    public void setSentiment(String Sentiment) {
//        this.Sentiment = Sentiment;
//    }
//
//    public double getSentiment_Polarity() {
//        return Sentiment_Polarity;
//    }
//
//    public void setSentiment_Polarity(double Sentiment_Polarity) {
//        this.Sentiment_Polarity = Sentiment_Polarity;
//    }
//
//    public double getSentiment_Subjectivity() {
//        return Sentiment_Subjectivity;
//    }
//
//    public void setSentiment_Subjectivity(double Sentiment_Subjectivity) {
//        this.Sentiment_Subjectivity = Sentiment_Subjectivity;
//    }

}
