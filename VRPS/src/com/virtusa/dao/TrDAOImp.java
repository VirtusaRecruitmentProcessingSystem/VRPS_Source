package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.JobseekerEntity;
import com.virtusa.integrate.ConectionManager;

public class TrDAOImp  implements TRDAO
{
	

		@Override
		public List<JobseekerEntity> getAllJobSeekers() throws ClassNotFoundException,SQLException
		{
			// TODO Auto-generated method stub
			Connection connection=ConectionManager.openConnection();
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from jobseeker");
			
			List<JobseekerEntity> jobseekersList=new ArrayList<JobseekerEntity>();
			while(resultSet.next()) {
				JobseekerEntity jobseekersentity=new JobseekerEntity();
				jobseekersentity.setFirst_name(resultSet.getString("first_id"));
				jobseekersentity.setMiddle_name(resultSet.getString("middle_name"));
				jobseekersentity.setLast_name(resultSet.getString("last_name"));
				jobseekersentity.setEmailid(resultSet.getString("email"));
				jobseekersentity.setPhoneNumber(resultSet.getString("phone_number"));
				//jobseekersentity.setQualification(resultSet.getString("qualification"));
				//jobseekersentity.setDate_of_birth(resultSet.getLocaDate("dateofbirth"));
				jobseekersList.add(jobseekersentity);
			}
			ConectionManager.closeConnection();
			return jobseekersList;
		}

		@Override
		public JobseekerEntity getTRShortlistcandidates(String Firstname) throws ClassNotFoundException, SQLException {
			Connection connection=ConectionManager.openConnection();
			PreparedStatement statement=connection.prepareStatement("");
			statement.setString(1, Firstname);
			
			ResultSet resultSet=statement.executeQuery();
			JobseekerEntity jobseekerentity=new JobseekerEntity();
			while(resultSet.next()) {
				
				jobseekerentity.setFirst_name(resultSet.getString("Firstname"));
			}
			return jobseekerentity;
				/*Departments departments=new Departments();
				departments.setDepartmentName(resultSet.getString("department_name"));
				
				employees.setDepartments(departments);
				
			}
			return employees;
		}

		@Override
		public List<JobseekerEntity> getAllJobSeekers() throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			return null;
		}*/

	}

}
