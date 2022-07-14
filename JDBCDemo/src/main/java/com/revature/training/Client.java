package com.revature.training;

import java.sql.*;

public class Client {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = DBConnection.getConnection();

        //3. Create the statement
        Statement stat = con.createStatement();

        //4. Executing the query
        ResultSet res = stat.executeQuery("select * from public.product");

        //5.  reading the results
       while(res.next()) {
           System.out.print(res.getString(1) + "  ");
           System.out.print(res.getString(2) + "  ");
           System.out.print(res.getString(3) + "  ");
           System.out.println(res.getString(4));
       }


        //6. close the connection
        stat.close();
       con.close();

    }
}
