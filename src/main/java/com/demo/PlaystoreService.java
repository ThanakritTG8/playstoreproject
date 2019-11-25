package com.demo;

import com.demo.Playstore;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PlaystoreService implements IPlaystoreService {

    private final ArrayList<Playstore> playstore;

    Connection connection = null;
    Statement stm = null;
    String url = "jdbc:mysql://localhost/projectsoa?user=root&&password=my-secret-pw";
    String user = "root";
    String password = "my-secret-pw";

    public PlaystoreService() {
        playstore = new ArrayList();
    }

    @Override
    public ArrayList<Playstore> findAll() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                String Installs = rs.getString("Installs");
                String Type = rs.getString("Type");
                int Price = rs.getInt("Price");
                String Content_Rating = rs.getString("Content Rating");
                String Genres = rs.getString("Genres");
                String Last_Updated = rs.getString("Last Updated");
                String Current_Ver = rs.getString("Current Ver");
                String Android_Ver = rs.getString("Android Ver");

                playstore.add(new Playstore(App, Category, Rating, Reviews, Size, Installs, Type, Price, Content_Rating, Genres, Last_Updated, Current_Ver, Android_Ver));

            }

        } catch (Exception ex) {
            Logger.getLogger(PlaystoreController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
                stm.close();

            } catch (Exception e) {

            }
        }

        return playstore;

    }

    @Override
    public ArrayList<Playstore> findByAppname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Playstore> findByCategory() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select  distinct Category from googleplaystore";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {

                String Category = rs.getString("Category");

                playstore.add(new Playstore(Category));

            }

        } catch (Exception ex) {
            Logger.getLogger(PlaystoreController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
                stm.close();

            } catch (Exception e) {

            }
        }

        return playstore;
    }

    @Override
    public ArrayList<Playstore> findByRating(double rate) {//  ยังแก้ไม่ได้ที

        double Rate = rate;
        Rate = 0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                String Installs = rs.getString("Installs");
                String Type = rs.getString("Type");
                int Price = rs.getInt("Price");
                String Content_Rating = rs.getString("Content Rating");
                String Genres = rs.getString("Genres");
                String Last_Updated = rs.getString("Last Updated");
                String Current_Ver = rs.getString("Current Ver");
                String Android_Ver = rs.getString("Android Ver");

                if (Rating == Rate) {
                    playstore.add(new Playstore(App, Category, Rating, Reviews, Size, Installs, Type, Price, Content_Rating, Genres, Last_Updated, Current_Ver, Android_Ver));

                } else {
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(PlaystoreController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
                stm.close();

            } catch (Exception e) {

            }
        }

        return playstore;

    }

    @Override
    public ArrayList<Playstore> findByType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Playstore> findByInstalls() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/projectsoa?user=root&&password=my-secret-pw";
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore";
            ResultSet rs = stm.executeQuery(sql);

        } catch (Exception ex) {
            Logger.getLogger(PlaystoreController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
                stm.close();
            } catch (Exception e) {

            }
        }

        return playstore;
    }

    @Override
    public ArrayList<Playstore> findAllReviews() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Playstore> find10Reviews() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Playstore> findAll(String id) {
        String ID = id;
        try {

//            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                String Installs = rs.getString("Installs");
                String Type = rs.getString("Type");
                int Price = rs.getInt("Price");
                String Content_Rating = rs.getString("Content Rating");
                String Genres = rs.getString("Genres");
                String Last_Updated = rs.getString("Last Updated");
                String Current_Ver = rs.getString("Current Ver");
                String Android_Ver = rs.getString("Android Ver");

                if (App.equals(ID)) {
                    playstore.add(new Playstore(App, Category, Rating, Reviews, Size, Installs, Type, Price, Content_Rating, Genres, Last_Updated, Current_Ver, Android_Ver));

                } else if (Category.equals(ID)) {
                    playstore.add(new Playstore(App, Category, Rating, Reviews, Size, Installs, Type, Price, Content_Rating, Genres, Last_Updated, Current_Ver, Android_Ver));

                } else {
                }

            }

        } catch (Exception ex) {
            Logger.getLogger(PlaystoreController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
                stm.close();
            } catch (Exception e) {

            }
        }

        return playstore;
    }

}
