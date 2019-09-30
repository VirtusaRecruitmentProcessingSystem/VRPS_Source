package com.virtusa.view;

import java.util.List;
import java.util.Scanner;
import com.virtusa.controller.TRController;
import com.virtusa.model.JobseekerModel;
import com.virtusa.model.TrModel;

public class TRView 
{	
		public void showFirstName(JobseekerModel models)
		{
			
			//System.out.println("First Name:"+models.getJobseekerModel().getFirstName()+"\n");
		}
		
		public void showMiddleName(List<JobseekerModel> models) 
		{
			for(JobseekerModel model:models) 
			{
				System.out.println(model.getMname()+"\n");
			}
			
		}
		
		public void showLastName(List<JobseekerModel> models)
		{
			for(JobseekerModel model:models)
			{
				System.out.println(model.getMname()+"\n");
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

public void storeSuccessful(){
	
	System.out.println("login successful");

}

public int storeUnSuccessful()
{
	System.out.println("login unsuccessful");
	return 0;
}





}
