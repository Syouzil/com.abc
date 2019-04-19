package com.abc.Helper;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbHelper {
	
	
	public static Connection getConnection() {
		
		Connection conn= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		}catch(Exception e) {
			System.out.println("Can't find the driver");
		}
		
		try {
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/com.abc.main", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	

}
