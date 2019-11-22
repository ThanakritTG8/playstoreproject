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

    @RequestMapping(value = "/All", method = RequestMethod.GET)
    public List<Playstore> listplaystore() {

        return playstoreService.findAll();
    }

    
    @RequestMapping(value = "/AppName", method = RequestMethod.GET)
    public List<Playstore> appname(){
        
        return playstoreService.findByAppname();
    }
}
