package com.virtusa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.JobseekerEntity;
import com.virtusa.integrate.ConectionManager;

public class HRDAOImp implements HRDAO 
{
	@Override
	public List<JobseekerEntity> getTRShortlistcandidates() throws ClassNotFoundException, SQLException {

		Connection connection=ConectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from jobseeker");
		
		List<JobseekerEntity> jobseekersList=new ArrayList<JobseekerEntity>();
		while(resultSet.next()) {
			JobseekerEntity jobseekersentity=new JobseekerEntity();
			jobseekersentity.setApplication_Id(resultSet.getString("application_id"));
			jobseekersentity.setFirst_name(resultSet.getString("first_name"));
			jobseekersentity.setLast_name(resultSet.getString("last_name"));
			jobseekersentity.setEmailid(resultSet.getString("email"));
			jobseekersentity.setPhoneNumber(resultSet.getString("phone_number"));
			jobseekersList.add(jobseekersentity);
		}
		ConectionManager.closeConnection();
		return jobseekersList;
	}	
}
