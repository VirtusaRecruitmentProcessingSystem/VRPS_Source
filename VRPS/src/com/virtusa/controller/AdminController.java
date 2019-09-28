package com.virtusa.controller;

import com.virtusa.model.AdminModel;

public class AdminController {

	public void userAuthentication(String username, String password)
	
	{
		AdminModel adminModel=new AdminModel(username,password);
		try {
			String userType=
					userService.userAuthenticationService(userModel);
			
			if(userType.contentEquals("Employee")) {
				StudentView studentView=new StudentView();
				studentView.mainStudentView();
			}else if(userType.contentEquals("ADMIN")) {
				AdminView adminView=new AdminView();
				adminView.mainAdminView();
			}		
			}catch(UserException e) {
				ErrorView errorView=new ErrorView();
				errorView.authenticationError();
				
			}
			
		
		
		
	}

}
