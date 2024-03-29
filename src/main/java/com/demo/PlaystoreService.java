package com.demo;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

@Service
public class PlaystoreService implements IPlaystoreService {

    private final ArrayList<Playstore> playstore;
    private final ArrayList<Reviews> reviews;


    Connection connection = null;
    Statement stm = null;
    String url = "jdbc:mysql://localhost/projectsoa?user=root&&password=my-secret-pw";
    String user = "root";
    String password = "my-secret-pw";

    public PlaystoreService() {
        playstore = new ArrayList();
        reviews = new ArrayList();

    }

    @Override
    public ArrayList<Playstore> findAll() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select distinct * from googleplaystore";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
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
    public ArrayList<Playstore> findByAppname(String name) {
        String Name = name;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select distinct * from googleplaystore";

            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
                String Type = rs.getString("Type");
                int Price = rs.getInt("Price");
                String Content_Rating = rs.getString("Content Rating");
                String Genres = rs.getString("Genres");
                String Last_Updated = rs.getString("Last Updated");
                String Current_Ver = rs.getString("Current Ver");
                String Android_Ver = rs.getString("Android Ver");

                if (App.equals(Name)) {
                    playstore.add(new Playstore(App, Category, Rating, Reviews, Size, Installs, Type, Price, Content_Rating, Genres, Last_Updated, Current_Ver, Android_Ver));
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(PlaystoreController.class
                    .getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PlaystoreController.class
                    .getName()).log(Level.SEVERE, null, ex);
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
    public ArrayList<Playstore> findByInstallsFree() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/projectsoa?user=root&&password=my-secret-pw";
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore where Type = 'free' order by Installs desc limit 10  ";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
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
            Logger.getLogger(PlaystoreController.class
                    .getName()).log(Level.SEVERE, null, ex);
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
    public ArrayList<Playstore> findByInstallsPaid() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/projectsoa?user=root&&password=my-secret-pw";
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore where Type = 'paid' order by Installs desc limit 10  ";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
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
            Logger.getLogger(PlaystoreController.class
                    .getName()).log(Level.SEVERE, null, ex);
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
    public ArrayList<Playstore> find10Reviews() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/projectsoa?user=root&&password=my-secret-pw";
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select distinct * from googleplaystore order by Reviews desc limit 10  ";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
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
            Logger.getLogger(PlaystoreController.class
                    .getName()).log(Level.SEVERE, null, ex);
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
    public ArrayList<Playstore> findAll(String id) {
        String ID = id;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select distinct * from googleplaystore";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
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

                } else if (Type.equals(ID)) {
                    playstore.add(new Playstore(App, Category, Rating, Reviews, Size, Installs, Type, Price, Content_Rating, Genres, Last_Updated, Current_Ver, Android_Ver));

                } else {
                }

            }

        } catch (Exception ex) {
            Logger.getLogger(PlaystoreController.class
                    .getName()).log(Level.SEVERE, null, ex);
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
    public ArrayList<Playstore> findAllFree() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select distinct * from googleplaystore where type = 'free' ";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
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
            Logger.getLogger(PlaystoreController.class
                    .getName()).log(Level.SEVERE, null, ex);
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
    public ArrayList<Playstore> findAllPaid() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select distinct * from googleplaystore where type = 'paid' ";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
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
            Logger.getLogger(PlaystoreController.class
                    .getName()).log(Level.SEVERE, null, ex);
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
    public ArrayList<Playstore> findByTop10Free(String app) {

        String freeApp = app;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore where Type = 'free' order by Installs desc limit 10  ";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
                String Type = rs.getString("Type");
                int Price = rs.getInt("Price");
                String Content_Rating = rs.getString("Content Rating");
                String Genres = rs.getString("Genres");
                String Last_Updated = rs.getString("Last Updated");
                String Current_Ver = rs.getString("Current Ver");
                String Android_Ver = rs.getString("Android Ver");

                if (App.equals(freeApp)) {
                    playstore.add(new Playstore(App, Category, Rating, Reviews, Size, Installs, Type, Price, Content_Rating, Genres, Last_Updated, Current_Ver, Android_Ver));

                }

            }

        } catch (Exception ex) {
            Logger.getLogger(PlaystoreController.class
                    .getName()).log(Level.SEVERE, null, ex);
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
    public ArrayList<Playstore> findByRating5() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore where Rating = 5";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
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
    public ArrayList<Playstore> findByRating4() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore "
                    + "where Rating >= 4 "
                    + "order by Rating desc";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
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
    public ArrayList<Playstore> findByRating3() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore "
                    + "where Rating >= 3 "
                    + "order by Rating desc";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
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
    public ArrayList<Playstore> findByRating2() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore "
                    + "where Rating >= 2 "
                    + "order by Rating desc";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
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
    public ArrayList<Playstore> findByRating1() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore "
                    + "where Rating >= 1 "
                    + "order by Rating desc";
            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                double Rating = rs.getDouble("Rating");
                int Reviews = rs.getInt("Reviews");
                String Size = rs.getString("Size");
                int Installs = rs.getInt("Installs");
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
    public ArrayList<Reviews> findByReviewsAppname(String name) {
        String Name = name;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            stm = connection.createStatement();
            String sql = "select * from googleplaystore_user_reviews";

            ResultSet rs = stm.executeQuery(sql);
            playstore.clear();

            while (rs.next()) {

                String App = rs.getString("App");
                String Translate_Review = rs.getString("Translated_Review");
                String Sentiment = rs.getString("Sentiment");
                double Sentiment_Polarity = rs.getDouble("Sentiment_Polarity");
                double Sentiment_Subjectivity = rs.getDouble("Sentiment_Subjectivity");

                if (App.equals(Name)) {
                    reviews.add(new Reviews(App, Translate_Review, Sentiment, Sentiment_Polarity, Sentiment_Subjectivity));

                }

            }

        } catch (Exception ex) {
            Logger.getLogger(PlaystoreController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
                stm.close();

            } catch (Exception e) {

            }
        }

        return reviews;
    }

    

}
