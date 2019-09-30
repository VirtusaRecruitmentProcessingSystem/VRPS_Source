package com.virtusa.controller;

import java.util.List;

import com.virtusa.helper.FactoryHrHelper;
import com.virtusa.helper.FactoryTrHelper;
import com.virtusa.helper.RequestType;
import com.virtusa.model.JobseekerModel;
import com.virtusa.services.TRServices;
import com.virtusa.ui.VRPSHome;
import com.virtusa.view.EmployeeView;
import com.virtusa.view.JobseekerView;

public class TRController
{
		private TRServices trServices;
	
	
		public TRController() 
		{
			this.trServices=FactoryTrHelper.createTRService();
		}
		
		public void handleRetrieveJobseeker(RequestType request) {
			
			JobseekerView jobseekerView=new JobseekerView();
			List<JobseekerModel> models=trServices.retrieveJobseekers();
			VRPSHome vrpshome=new VRPSHome();
	
			
		}
		
			public void userAuthentication(String userName, String password) {
			// TODO Auto-generated method stub
			
			
			
		}
		

}
