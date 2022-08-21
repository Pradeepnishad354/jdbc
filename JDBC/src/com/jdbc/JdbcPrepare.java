package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcPrepare {
	
public static void main(String[] args) {
		
		try {
		//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		// create connection
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="1234";
			
		Connection conn=DriverManager.getConnection(url,username,password);
			
			
		//create query
		
		String q="insert into student(sName,sCity) values(?,?)";
		
		//get the prepareStatement object
		
		PreparedStatement pstmt=conn.prepareStatement(q);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the name");
		String name=br.readLine();
		
		System.out.println("enter the city");
		
		String city=br.readLine();
		
		pstmt.setString(1,name);
		pstmt.setString(2,city);
		
		pstmt.executeUpdate();
		
		System.out.println("inserted...");
		
		conn.close();
			
			
			
		}catch(Exception e) {
			
			
			
		}
		
		
	}


}
