package com.revature.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertClient {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = DBConnection.getConnection();

        //3. creating the statement
        Statement statement = con.createStatement();
        //4. executing the statement and returning the result
        int res = statement.executeUpdate("insert into public.product values(4,'Speaker','Good',19,229,'Good')");
        //printing the result
        System.out.println(res + " row(s) updated");

        //5. close the statement and connection
        statement.close();
        con.close();
    }
}
