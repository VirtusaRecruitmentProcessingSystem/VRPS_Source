package com.virtusa.repository;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Admin;

public class AdminRepository {
	
	
	private static List<Admin> EmployeeRepository=
			new ArrayList<Admin>();
	static{
		
		
		Admin admin=new Admin();
		admin.setUserName("admin");
		admin.setPassword("admin");
		admin.setFirstName("ADMIN");
		admin.setLastName("ADMIN");
		admin.setAdminId("A001");
		
		adminRepository.add(admin);
				
	}
	public static List<Admin> getUserRepository() {
		return userRepository;
	}
	
	

}
