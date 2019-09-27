package com.virtusa.view;

import java.util.Scanner;


import com.virtusa.controller.TRController;
import com.virtusa.model.TrModel;

public class TRView {

	
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
