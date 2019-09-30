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

public class TrDAOImp implements TRDAO
{
	Connection connection=ConectionManager.openConnection();

		@Override
		public void getAllJobSeekers() throws ClassNotFoundException,SQLException
		{
			// TODO Auto-generated method stub
			//Connection connection=ConectionManager.openConnection();
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery
					("select applicationId,firstName,email from jobseeker j join application_details a  on(j.application_id=a.application_id) where first_round_status='selected' ");;
			
			while(resultSet.next()) {
				JobseekerEntity jobseekersentity=new JobseekerEntity();
				 String ApplicationId =resultSet.getString(1);
				 String firstName=resultSet.getString(2);
				 String email=resultSet.getString(3);
				
			}
		
		
		}
		public void  updateJobseekerStatus() throws ClassNotFoundException,SQLException
		{
			 String sql="update table application_details set tr_round_status=? where applicationId=?";
			PreparedStatement preparestatement=connection.prepareStatement(sql);
			int rowsAffected=preparestatement.executeUpdate();
			//ResultSet resultSet=statement.executeQuery
					//("update table application_details set tr_round_status="" where applicationId=?"); 
		}
		
ConectionManager.closeConnection();
	}



