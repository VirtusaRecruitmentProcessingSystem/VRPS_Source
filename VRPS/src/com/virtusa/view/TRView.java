package com.virtusa.view;

import java.util.List;
import java.util.Scanner;
import com.virtusa.controller.TRController;
import com.virtusa.model.JobseekerModel;
import com.virtusa.model.TrModel;

public class TRView 
{
	public class EmployeeView {
		
		public void showFirstName(JobseekerModel models) {
			
			System.out.println("First Name:"+models.getJobseekerModel().getFirstName()+"\n");
		}
		
		public void showEmployeeName(List<JobseekerModel> models) {
			for(JobseekerModel model:models) {
				System.out.println(model.getFname()+"\n");
			}
			
		}
		
		public void showEmployeeContact(List<JobseekerModel> models) {
			for(JobseekerModel model:models) {
				System.out.println(model.getMname()+"\n");
			}
			
		}
		
		public void showEmployeeSalary(List<JobseekerModel> models) {
			for(JobseekerModel model:models) {
				System.out.println(model.getLname()+"\n");
			}
			
		}

	}


	public static void main(String[] args) 
	{
		
		TRView trView = new TRView();
	    trView.trLogin();
		
	}	
		public void trLogin() 
		{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter UserName");
		String  userName=scanner.next();
		
		System.out.println("Enter password");
		String  password=scanner.next();

		TrModel trModel=new TrModel();
		trModel.setUserName(userName);
		trModel.setPassword(password);
	TRController trcontroller=new TRController();
	trcontroller.userAuthentication(userName,password);
	
	}
}
