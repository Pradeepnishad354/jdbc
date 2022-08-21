package com.jdbc.practice;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		
		try {
			
			Connection con=ConnectionProvider.getConnection();
			
			String q="insert into image(pic) values(?)";
			
			PreparedStatement pstmt=con.prepareStatement(q);
			
			// for choose file as dialog ox
			
			JFileChooser jfc=new JFileChooser();
			
			jfc.showOpenDialog(null);
		File file=	jfc.getSelectedFile();
		
		//choose file and pass reference of this jfilechooser 
		FileInputStream fis=new FileInputStream(file);
		
		pstmt.setBinaryStream(1, fis,fis.available());
		
		pstmt.executeUpdate();
		
		
		System.out.println("done.....");
		
		JOptionPane.showMessageDialog(null,"success");
			
			
		}catch(Exception e) {
   e.printStackTrace();			
			
			
		}
		
		
		
		
	}

}
