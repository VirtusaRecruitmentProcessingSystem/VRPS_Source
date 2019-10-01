package com.virtusa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
	 SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
	 String strDate = formatter.format(datex);  
	 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		}
		catch(Exception e) {e.printStackTrace();}
	
		/*
		 * jobseeker(

FIRST_NAME       VARCHAR2(40) NOT NULL, 
MIDDLE_NAME      VARCHAR2(40) NOT NULL,
LAST_NAME        VARCHAR2(40) NOT NULL, 
DATE_OF_BIRTH    DATE NOT NULL ,         
PHONE_NUMBER             VARCHAR2(40), 
QUALIFICATION    VARCHAR2(40) NOT NULL,
EMAIL_ID         VARCHAR(40) NOT NULL,
YEAR_OF_PASSING  NUMBER(4) NOT NULL,
JOB_ID number
gradpercentage number (2,2)
EXPERIENCE               NUMBER(2)
		 */
	// boolean i=true;
	 ResultSet rs;
	 int id=0;
		try(Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");)
		{
			
			String query1="insert into jobseeker values(?,?,?,TO_DATE(?,'dd-mm-yyyy'),?,?,?,?,emp_id.nextval,?,?)";
			PreparedStatement st=conn.prepareStatement(query1);
			st.setString(1, fname);
			st.setString(2,mname );
			st.setString(3, lname );
			st.setString(4,strDate);
			st.setString(5, phone);
			st.setString(6, qualification);
			st.setString(7, email);
			st.setInt(8,passYear);
			st.setDouble(9,percentage );
			st.setInt(10, experience);
			//int in;
			int i=st.executeUpdate();
		        if (i>0) {
		            System.out.println(" Jobseeker profile created succesfully");
		            String q="select emp_id.currval from  dual";
		             st=conn.prepareStatement(q);
		            rs=st.executeQuery();
		            while(rs.next())
		            id=rs.getInt("currval");
		            System.out.println("JobSeeker ID:"+id);
		            
		        } else {
		            System.out.println("stuck somewhere");
		        }
	 
		}catch(SQLException s) {
			System.out.println(":-:-:-:-:-:-Error at backend Workstation:\n");
			s.printStackTrace();
		}
}


}