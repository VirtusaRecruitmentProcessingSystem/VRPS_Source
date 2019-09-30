package com.virtusa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.virtusa.entities.JobEntity;

public class JobDAO {

	public void addJobPost(JobEntity jentity) throws Exception 
	{
		
		 int jobId=jentity.getJobId();
		 String descriptionString=jentity.getDescription();
		 String designation=jentity.getDesignation();
		 double eligibiltyPer=jentity.getEligibiltyPer();
		List<String> skills=jentity.getSkills();

		

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		}
		catch(Exception e) {}
		
		
		try(Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");)
		{
			PreparedStatement st=conn.prepareStatement("insert into student_info values(IDSEQ.nextval,?)");
	}
	
  }
}