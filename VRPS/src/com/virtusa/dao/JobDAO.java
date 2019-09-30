package com.virtusa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/*
 * JOB_ID                NOT NULL NUMBER(10)   
DESIGNATION           NOT NULL VARCHAR2(40) 
REQUIRED_EXPERIENCE            NUMBER(2)    
REQUIRED_SKILLS                VARCHAR2(40) 
ELIGIBILITYPERCENTAGE          NUMBER(2,2) 
 */

import com.virtusa.entities.JobEntity;

public class JobDAO {

	String skillSet="";
	public void addJobPost(JobEntity jentity)
	{
		
		 int jobId=jentity.getJobId();

		 String designation=jentity.getDesignation();
		 double eligibiltyPer=jentity.geteligibilityPercentage();
		List<String> skills=jentity.getSkills();
		
		skills.forEach((o)->{
			skillSet+=o+" ";
		});

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		}
		catch(Exception e) {}
		
		
		try(Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");)
		{
			PreparedStatement st=conn.prepareStatement("insert into job_description(job_id,designation,eligibilityPercentage,required_experience,required_skills ) values(?,?,?,?,?)");
			st.setInt(1, jobId);
			st.setString(2, descriptionString);
			st.setString(3,designation);
			st.setDouble(4, eligibiltyPer);
			st.setString(5, skillSet);
			
			int x=st.executeUpdate();
			if(x>0)
				System.out.println("--JobPOst added Succesfully");
			else
				System.out.println("--JobPOst was not added");
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	
  }

	public void viewallJobs() {
		
		
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		}
		catch(Exception e) {}
		
		
		try(Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");)
		{
			PreparedStatement st=conn.prepareStatement("select * from job_description");
			ResultSet rs=st.executeQuery();
			System.out.println("==================");
			while(rs.next()) {
				int jobId=rs.getInt("job_id");
				String description=rs.getString(columnIndex);
				String designation;
				double eligibiltyPer;
				String skills;
				
				
				System.out.println(rs.);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}