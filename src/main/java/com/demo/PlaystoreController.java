package com.demo;

import java.sql.*;
import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaystoreController {

    @Autowired
    private IPlaystoreService playstoreService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Playstore> listplaystore() {

        return playstoreService.findAll();
    }

    
    @RequestMapping(value = "/appName", method = RequestMethod.GET)
    public List<Playstore> appname(){
        
        return playstoreService.findByAppname();
    }
    
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public List<Playstore> category(){
        
        return playstoreService.findByCategory();
    }
    
    @RequestMapping(value = "/rating", method = RequestMethod.GET)
    public List<Playstore> rating(){
        
        return playstoreService.findByRating();
    }
    
    @RequestMapping(value = "/type", method = RequestMethod.GET)
    public List<Playstore> type(){
        
        return playstoreService.findByType();
    }
}
