package com.virtusa.controller;

import com.virtusa.model.ApplicationModel;
import com.virtusa.model.JobseekerModel;
import com.virtusa.services.JobServiceImpl;
import com.virtusa.services.JobseekerServicesImpl;

public class JobseekerController {

public void registerJobSeeker(JobseekerModel model) {
	
	JobseekerServicesImpl register=new JobseekerServicesImpl();
 	register.JobseekerRegistration(model);
 	
}


public void loginJobseeker(JobseekerModel model) {
	
	
	
}
public void jobApplication(ApplicationModel applicationModel) {
	JobServiceImpl jobobj=new JobServiceImpl(); 
	


}

public void viewStatus(int refId) {
	JobServiceImpl statusobj=new JobServiceImpl(); 
	
}

}
