package com.virtusa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.List;

import com.virtusa.model.JobseekerModel;

public class JobseekerDAO {

public void showStatus(int refId) {
	
}

public void addJobSeeker(JobseekerModel model) {
	 String fname=model.getFname();
	 String mname=model.getMname();
	 String lname=model.getLname();
	 Date datex=model.getDatex();
	 int passYear=model.getPassYear();
	 int experience=model.getExperience();
	 String address=model.getAddress();
	 String qualification=model.getQualification();
	 String email=model.getEmail();
	 String phone=model.getPhone();
	 double percentage=model.getPercentage();
	 int jobId;
	 List<String> skills=model.getSkills();
	 
	 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		}
		catch(Exception e) {}
		
		
		try(Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");)
		{
			PreparedStatement st=conn.prepareStatement("insert into jobseeker values(?,?,?,TO_DATE(?,'dd-mm-yyyy'),?,?,?,?,empidseq.nextval);
			st.setString(1, fname);
			st.setString(2, );
	 
	 
	 
}
}
