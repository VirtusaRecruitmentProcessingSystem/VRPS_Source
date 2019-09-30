package com.vrps.authentication;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;




public class UserAuthentication {
	
	
	public static void main(String[] args) {
		
		String username=null;
		  String password=null;
		
		System.out.println();
		Scanner scanner1=new Scanner(System.in);
		
		
		System.out.println("Enter UserName:");
		String username1=scanner1.next();
		
		System.out.print("Enter Password:");
		String password1=scanner1.next();
		
		  
	      try {
	         Connection con = DriverManager.getConnection(
	        		 "jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
	         
	         Statement stmt = con.createStatement();
	         ResultSet rs =  stmt.executeQuery("SELECT * FROM user1");
	         
	         
	         while (rs.next()) {
	          
	             username = rs.getString(1);
	            password = rs.getString(2);	            
	         }
	         	 System.out.println(username+"  "+password+"  -----");
	         
	         
	         
	      } catch(SQLException e) {
	         System.out.println("SQL exception occured" + e);}
	         
	         
	         
	         if((username1.equals(username))&&(password1.equals(password)))
	         {
		         System.out.println("User Authentication Successfull ");

	        	 
	         }
	         else
		         System.out.println("not a valid user ");

	         
	         
	         
	         
	      }
	   }
	
	

	

