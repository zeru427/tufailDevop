package com.revature.training;

import java.sql.*;
import java.util.Scanner;

public class InsertClient_UsingPS {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner scanner = new Scanner(System.in);
        //taking input from keyboard
        System.out.println("Please enter product id "); int productId = scanner.nextInt();
        System.out.println("Please enter product name "); String productName = scanner.next();
        System.out.println("Please enter product feedback "); String productFeedback = scanner.next();
        System.out.println("Please enter product price "); int price = scanner.nextInt();
        System.out.println("Please enter product qoh "); int qoh = scanner.nextInt();
        System.out.println("Please enter product review "); String review = scanner.next();

        Connection con = DBConnection.getConnection();

       //3. creating the prepared statement - pre
        //Precompiled SQL statement
        //Reduce execution time for repetitious SQL statements
        //Parameterized inputs using ‘?’ placeholders
        PreparedStatement statement = con.prepareStatement("insert into public.product values(?,?,?,?,?,?)");
        statement.setInt(1,productId);
        statement.setString(2,productName);
        statement.setString(3,productFeedback);
        statement.setInt(4,qoh);
        statement.setInt(5,price);
        statement.setString(6,review);

        //4. executing the statement and returning the result
        int res = statement.executeUpdate();
        //printing the result
        System.out.println(res + " row(s) updated");

        //5. close the statement and connection
        statement.close();
        con.close();
    }
}
