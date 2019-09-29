package com.virtusa.controller;

import java.util.List;

import com.virtusa.helper.FactoryHrHelper;
import com.virtusa.helper.FactoryTrHelper;
import com.virtusa.helper.RequestType;
import com.virtusa.model.JobseekerModel;
import com.virtusa.services.TRServices;
import com.virtusa.view.EmployeeView;

public class TRController
{
		private TRServices trServices;
	
	
		public TRController() 
		{
			this.trServices=FactoryTrHelper.createTRService();
		}
		
		public void handleRetrieveJobseeker(RequestType request) {
			
			EmployeeView employeeView=new EmployeeView();
			List<JobseekerModel> models=trServices.retrieveJobseekers();
			MainView mainView=new MainView();
			switch(request) {
			
			case FIRSTNAME: employeeView.showjobseekerfirstname(models);
			           mainView.viewEmployeeMenu();
				       break;
			case MIDDLENAME:employeeView.showJobseekermiddlename(models);
			           mainView.viewEmployeeMenu();
				       break;
			case LASTNAME:employeeView.showJobseekerlastname(models);
		               mainView.viewEmployeeMenu();
				       break;
				
			default:
				      break;
			
			}
			
			
		}
		
		public void handleRetrieveDepartmentName(int employeeId) {
			EmployeesModel employees=employeeService.retrieveDepartmentName(employeeId);
			EmployeeView employeeView=new EmployeeView();
			employeeView.showDepartmentName(employees);
		}

	}

		public void userAuthentication(String userName, String password) {
			// TODO Auto-generated method stub
			
			
			
		}
		

}
