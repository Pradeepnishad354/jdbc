package com.jdbc.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateJDBC {
	
	public static void main(String[] args) throws IOException, SQLException {
		
		
		
		Connection con=ConnectionProvider.getConnection();
		
		
		String q="update student set sName=?,sCity=? where sId=?";
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the name");
		String name=br.readLine();
		
		System.out.println("enter the city");
		String city=br.readLine();
		
		System.out.println("enter the id");
		int id=Integer.parseInt(br.readLine());
		
	PreparedStatement psmt=con.prepareStatement(q);
	
	
	psmt.setString(1,name);
	psmt.setString(2,city);
	psmt.setInt(3, id);
	
	psmt.executeUpdate();
	
	System.out.println("done....");
	
	
	
		
		
	}

}



