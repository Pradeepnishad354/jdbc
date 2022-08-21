package com.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageLoad {
	
	public static void main(String[] args) {
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/jdbc";
			
			String username="root";
			String password="1234";
			
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			String q="insert into image(pic) values(?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			
			FileInputStream fis=new FileInputStream("D:\\error404.jpg");
			
			pstmt.setBinaryStream(1, fis,fis.available());
		pstmt.executeUpdate();
			
			System.out.println("done .......");
			
			
			
		}catch(Exception e) {
			
			System.out.println("error...");
			
			
		}
		
	}

}
