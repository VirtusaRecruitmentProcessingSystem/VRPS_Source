package com.virtusa.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Authentication {
	
	
	public boolean Verification(String username,String password,String usertype) {

		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	     } catch(ClassNotFoundException e) {
	        System.out.println("Class not found "+ e);
	     }
		

	      try {
	         Connection con = DriverManager.getConnection(
	        		 "jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");   
	         Statement stmt = con.createStatement();
	      }catch(SQLException e)
	      {
		         System.out.println("SQL exception occured" + e);
  
	     	  
	      }
		
		if(usertype.equals("jobseeker"))
		{
			
			
			
			
			
		}
		
		return true;
	}

}
