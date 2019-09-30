
package com.virtusa.view;


import java.util.List;
import java.util.Scanner;

import com.virtusa.controller.AdminController;
import com.virtusa.model.AdminModel;


public class AdminView {
	
		public void mainMenu() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("---------Admin Login---------");
		AdminView admiView=new AdminView();
		
		
		Scanner scanner1=new Scanner(System.in);
		
		
		System.out.print("Enter UserName:");
		String username=scanner1.next();
		
		System.out.print("Enter Password:");
		String password=scanner1.next();

		
	    AdminController admincontroller=new AdminController();
	    boolean success=admincontroller.userAuthentication(username,password);
		if(success) {
			System.out.println("1.Add Job Post");
			System.out.println("2.delete job post");
	
			
			
		}
		}


	}