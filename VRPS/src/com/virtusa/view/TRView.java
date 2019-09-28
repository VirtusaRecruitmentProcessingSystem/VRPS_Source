package com.virtusa.view;

import java.util.Scanner;

public class TRView {

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

}
