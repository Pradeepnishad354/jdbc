package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCFirst {
	
	public static void main(String[] args) {
		
		try {
		//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		// create connection
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="1234";
			
		Connection conn=DriverManager.getConnection(url,username,password);
			
			if(conn.isClosed()) {
				
				System.out.println("connection is closed");
			}else {
				
				System.out.println("connection is created");
			}
			
			
			
			
			
		}catch(Exception e) {
			
			
			
		}
		
		
	}

}
