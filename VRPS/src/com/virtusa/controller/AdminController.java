package com.virtusa.controller;
import com.virtusa.model.AdminModel;
import com.virtusa.services.AdminServices;

public class AdminController {

	public void userAuthentication(String username, String password)
	{
		
		
		AdminServices adminService=new AdminServices();

		 String password1=password;
	      String username1=username;
		AdminModel adminModel=new AdminModel(username1,password1);
			String userType= adminService.userAuthenticationService(adminModel);
				
			
			
		
		
		
	

}}
