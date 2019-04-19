package com.abc.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.abc.Helper.DbHelper;

public class DbUpdateMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection c= DbHelper.getConnection();
		Statement stmt=c.createStatement();
		//update 
		String sqlUpdate ="update user_info set email='email2@email.com' where id=2 ";
		stmt.executeUpdate(sqlUpdate);
		
		//delete
		/*
		 * String sqldelete="delete from  uset_info where id=5 limit 1";
		 * stmt.executeUpdate(sqldelete);
		 */

	}

}
