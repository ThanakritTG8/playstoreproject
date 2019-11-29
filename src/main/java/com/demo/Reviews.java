package com.demo;


public class Reviews {

private String App;
private String Translate_Reviews;
private String Sentiment;
private double Sentiment_Polarity;
private double Sentiment_Subjectivity;

    public Reviews(String App, String Translate_Reviews, String Sentiment, double Sentiment_Polarity, double Sentiment_Subjectivity) {
        this.App = App;
        this.Translate_Reviews = Translate_Reviews;
        this.Sentiment = Sentiment;
        this.Sentiment_Polarity = Sentiment_Polarity;
        this.Sentiment_Subjectivity = Sentiment_Subjectivity;
    }

    public String getApp() {
        return App;
    }

    public void setApp(String App) {
        this.App = App;
    }

    public String getTranslate_Reviews() {
        return Translate_Reviews;
    }

    public void setTranslate_Reviews(String Translate_Reviews) {
        this.Translate_Reviews = Translate_Reviews;
    }

    public String getSentiment() {
        return Sentiment;
    }

    public void setSentiment(String Sentiment) {
        this.Sentiment = Sentiment;
    }

    public double getSentiment_Polarity() {
        return Sentiment_Polarity;
    }

    public void setSentiment_Polarity(double Sentiment_Polarity) {
        this.Sentiment_Polarity = Sentiment_Polarity;
    }

    public double getSentiment_Subjectivity() {
        return Sentiment_Subjectivity;
    }

    public void setSentiment_Subjectivity(double Sentiment_Subjectivity) {
        this.Sentiment_Subjectivity = Sentiment_Subjectivity;
    }
    
    

}
