package com.revature.training;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallingProcedure_Transfer {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DBConnection.getConnection();
		//CS is used to call stored procedure from java
		CallableStatement stat = connection.prepareCall("call public.transfer(?,?,?)");
		stat.setInt(1, 1);
		stat.setInt(2, 2);
		stat.setInt(3, 7000);
		
		stat.execute();
		
		System.out.println("Done");
		
	}
}