package com.virtusa.services;

import com.virtusa.model.AdminModel;
import com.virtusa.dao.AdminDAO;

public class AdminServices {
	
	AdminDAO adminDAO=new AdminDAO();

	public String userAuthenticationService(AdminModel adminModel) {
		// TODO Auto-generated method stub
		
		boolean adminValid=
				adminDAO.adminAuth(adminModel.getUsername(), adminModel.getPassword());
		
		
		
		if(adminValid) {
			String user="valid";
			


		return user;
	}
		

		return null;
		
		
		
		
	}

	

}
