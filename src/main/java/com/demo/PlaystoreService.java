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

    public PlaystoreService() {
        playstore = new ArrayList();
    }

    @Override
    public ArrayList<Playstore> findAll() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/projectsoa?user=root&&password=my-secret-pw";
            connection = DriverManager.getConnection(url, "root", "my-secret-pw");
            stm = connection.createStatement();
            String sql = "select * from googleplaystore";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                String App = rs.getString("App");
                String Category = rs.getString("Category");
                String Rating = rs.getString("Rating");
                String Reviews = rs.getString("Reviews");
                String Size = rs.getString("Size");
                String Installs = rs.getString("Installs");
                String Type = rs.getString("Type");
                String Price = rs.getString("Price");
                String Content_Rating = rs.getString("Content_Rating");
                String Genres = rs.getString("Genres");
                String Last_Updated = rs.getString("Last_Updated");
                String Current_Ver = rs.getString("Current_Ver");
                String Android_Ver = rs.getString("Android_Ver");

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

}
