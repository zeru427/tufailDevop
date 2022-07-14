package com.revature.training;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    public static Connection getConnection(){
        Connection con = null;
        //1.load the driver
        try {
            FileReader reader = new FileReader("d:\\revaturedb.properties");
            Properties properties = new Properties();
            properties.load(reader);
            Class.forName(properties.getProperty("driver"));
            //2. Create the connection
             con = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return con;
    }
}
