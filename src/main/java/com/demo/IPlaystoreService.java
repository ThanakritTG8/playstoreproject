package com.demo;

import com.demo.Playstore;
import java.util.ArrayList;

public interface IPlaystoreService {
    
    public ArrayList<Playstore> findAll();
    
    public ArrayList<Playstore> findAll(String id);
    
    public ArrayList<Playstore> findByAppname();
    
    public ArrayList<Playstore> findByCategory();
    
    public ArrayList<Playstore> findByRating(double rate);
    
    public ArrayList<Playstore> findByType();
    
    public ArrayList<Playstore> findByInstalls();
    
    public ArrayList<Playstore> findAllReviews();
    
    public ArrayList<Playstore> find10Reviews();
}
