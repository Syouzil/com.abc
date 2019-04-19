package com.abc.main;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


import com.abc.Helper.DbHelper;



public class MainApplication {

	public static void main(String[] args) throws Exception {

		Connection c = DbHelper.getConnection();

		// select query
		Statement stmt = c.createStatement();

		String sql_r = "select * from user_info";
		ResultSet rs = stmt.executeQuery(sql_r);

		while (rs.next()) {
			//select all and use cmd+shf+F to arrange all the data in format
			// passing db colum data to the string
			String name = rs.getString("name");
			String email = rs.getString("email");
			String address = rs.getString("address");
			String  phone = rs.getString("phone");

			System.out.println(" Name : " + name + ",  Email : " + email + "address : " + address + " phone :" + phone);
		}

	}

}
