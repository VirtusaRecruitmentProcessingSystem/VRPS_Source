package com.virtusa.dao;

import java.util.List;

import com.virtusa.entities.AdminEntity;
import com.virtusa.repository.*;

public class AdminDAO {
private List<AdminEntity> List=null;
AdminEntity admin=new AdminEntity();
	
	public AdminDAO() {
		
		this.List=EmployeeRepository.getAdminRepository();
	}

	public boolean adminAuth(String username, String password) {
		// TODO Auto-generated method stub		
          boolean result=false;			
		for(Admin admin:List) {
			
			if(admin.getUsername().equals(username)) {
				
				if(admin.getPassword().equals(password)) {
					result= true;
										
				}
				
			}
			
			
		}
		
		return result;
	
		
		
		return true;
	}

	

}
