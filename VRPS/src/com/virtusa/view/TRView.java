package com.virtusa.view;

import java.util.Scanner;

<<<<<<< HEAD
=======

import com.virtusa.controller.TRController;
import com.virtusa.model.TrModel;

>>>>>>> branch 'master' of https://github.com/VirtusaRecruitmentProcessingSystem/VRPS_Source
public class TRView {

<<<<<<< HEAD
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public void login()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("UserName");
		String userName=sc.nextLine();
		System.out.println("Password");
		String password=sc.nextLine();
		HrModel hrmodel=new HrModel();
		hrmodel.setuserid(userName);
		hrmodel.setpassword(password);
		
	//}

=======
	
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
	
>>>>>>> branch 'master' of https://github.com/VirtusaRecruitmentProcessingSystem/VRPS_Source
}
