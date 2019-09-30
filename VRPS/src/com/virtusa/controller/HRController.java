package com.virtusa.controller;

import java.util.List;

import com.virtusa.helper.FactoryHrHelper;
import com.virtusa.helper.RequestType;
import com.virtusa.model.JobseekerModel;
import com.virtusa.services.HRServices;
import com.virtusa.ui.VRPSHome;
import com.virtusa.view.JobseekerView;

public class HRController
{
		private HRServices hrServices;
	
	
		public HRController() 
		{
			this.hrServices=FactoryHrHelper.createHRService();
		}
		
		public void handleRetrieveJobseeker(RequestType request) {
			
			JobseekerView jobseekerView=new JobseekerView();
			List<JobseekerModel> models=hrServices.retrieveJobseekers();
			VRPSHome vrpshome=new VRPSHome();
			switch(request) {
			
			case APPLICATION_ID: jobseekerView.showjobseekerapplicationid(models);
				vrpshome.viewJobseeker();
	           			break;
			
			case FIRSTNAME: jobseekerView.showjobseekerfirstname(models);
				vrpshome.viewJobseeker();
				       break;
			
			case LASTNAME:jobseekerView.showJobseekerlastname(models);
				vrpshome.viewJobseeker();
				       break;
			case EMAIL:jobseekerView.showJobseekeremail(models);
				vrpshome.viewJobseeker();
				break;
				       
			default:
				      break;
			
			}
			
			
		}
		
			public void userAuthentication(String userName, String password) {
			// TODO Auto-generated method stub
			
			
			
		}
		

}

