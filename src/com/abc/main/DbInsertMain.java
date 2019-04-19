package com.abc.main;

import java.sql.Connection;
import java.sql.Statement;

import com.abc.Helper.DbHelper;

public class DbInsertMain {
	
	public static void main(String[] args) throws Exception {
		
		Connection c = DbHelper.getConnection();
		Statement stmt = c.createStatement();
		
		String insert_q="Insert into user_info( id, name,email,address,phone)values('5','datafromjava5','email5@email.com','address55','555');";
		 stmt.executeUpdate(insert_q);
		 System.out.println("data inserted");
		 
		 
		 
		
	}
}
