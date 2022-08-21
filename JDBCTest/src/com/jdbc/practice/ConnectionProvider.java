package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	public static Connection con;
	
	public static Connection getConnection() {

	try {
		
		if(con==null) {
			
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="1234";
		
	 con=DriverManager.getConnection(url,username,password);
		}
	
	
		
		
	}catch(Exception e) {
		e.printStackTrace();
		
		
	}
	return con;
	}
}

