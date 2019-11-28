package com.demo;

import java.util.ArrayList;

public interface IPlaystoreService {
    
    public ArrayList<Playstore> findAll();
    
    public ArrayList<Playstore> findAll(String id);//Appname
    
    public ArrayList<Playstore> findAllFree();//
    
    public ArrayList<Playstore> findAllPaid();
    
    public ArrayList<Playstore> findByInstallsFree();
    
    public ArrayList<Playstore> findByInstallsPaid();
    
    public ArrayList<Playstore> findByAppname(String name);//ยังไม่เสร็จจ
    
    public ArrayList<Playstore> findByCategory();
    
    public ArrayList<Playstore> findByTop10Free(String app);
    
    public ArrayList<Playstore> findByRating(String rate);//ยังไม่เสร็จจจจจ
    
    public ArrayList<Playstore> findAllReviews();//ไม่เอาแล้ววววววว
    
    public ArrayList<Playstore> find10Reviews();
}
