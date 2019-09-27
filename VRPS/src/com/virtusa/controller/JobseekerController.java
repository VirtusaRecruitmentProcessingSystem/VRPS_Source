package com.virtusa.controller;

import com.virtusa.model.JobseekerModel;
import com.virtusa.services.JobseekerServicesImpl;

public class JobseekerController {

public void registerJobSeeker(JobseekerModel model) {
	
	JobseekerServicesImpl register=new JobseekerServicesImpl();
 	register.JobseekerRegistration(model);
 	
}

}
