package com.springmvcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sm", "admin", "admin"); 
		Statement statement = con.createStatement();
		
		ResultSet rs = statement.executeQuery("Select * from users");
		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("email"));
		}
		
		con.close();
		
		
	}
}
