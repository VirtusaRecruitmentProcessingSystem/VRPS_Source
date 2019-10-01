package com.virtusa.services;

import com.virtusa.dao.JobseekerDAO;
import com.virtusa.model.JobseekerModel;

public class JobseekerServicesImpl implements JobseekerServices{

	@Override
	public void JobseekerRegistration(JobseekerModel model) {
		// TODO Auto-generated method stub
		JobseekerDAO jdao=new JobseekerDAO();
		jdao.addJobSeeker(model);
		
		//System.out.println("Added Succesfully");
	}

	@Override
	public void JobseekerLogin() {
		// TODO Auto-generated method stub
		
	}

	public void viewStatus(int refId) {
		
	}
	
}
