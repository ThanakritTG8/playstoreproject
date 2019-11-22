package com.demo;


public class Reviews {

private String Translate_Reviews;
private String Sentiment;
private String Sentiment_Polarity;
private String Sentiment_Subjectivity;

    public Reviews(String Translate_Reviews, String Sentiment, String Sentiment_Polarity, String Sentiment_Subjectivity) {
        this.Translate_Reviews = Translate_Reviews;
        this.Sentiment = Sentiment;
        this.Sentiment_Polarity = Sentiment_Polarity;
        this.Sentiment_Subjectivity = Sentiment_Subjectivity;
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

    public String getSentiment_Polarity() {
        return Sentiment_Polarity;
    }

    public void setSentiment_Polarity(String Sentiment_Polarity) {
        this.Sentiment_Polarity = Sentiment_Polarity;
    }

    public String getSentiment_Subjectivity() {
        return Sentiment_Subjectivity;
    }

    public void setSentiment_Subjectivity(String Sentiment_Subjectivity) {
        this.Sentiment_Subjectivity = Sentiment_Subjectivity;
    }
    
    

}
