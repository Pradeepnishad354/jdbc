package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJdbc {
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="1234";
			
		Connection con=	DriverManager.getConnection(url,username,password);
			
		//create a query
		
		String q="create table Student(sId int(20) primary key auto_increment,sName varchar(20),sCity varchar(20))";
		
		// create statement
		
		Statement stmt=con.createStatement();
		
		stmt.executeUpdate(q);
		
		System.out.println("table created in database");
		con.close();
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
