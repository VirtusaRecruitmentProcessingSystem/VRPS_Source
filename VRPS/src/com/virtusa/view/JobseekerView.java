package com.virtusa.view;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.virtusa.model.JobseekerModel;

public class JobseekerView {


	public void mainMenu() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("\n1.JobSeeker Registration\n2.JobSeeker Login");
		int option=s.nextInt();
		
		JobseekerView js_view=new JobseekerView();
		if(option==1) {
			js_view.registerJobSeeker();
		}
		else if(option==2)
		{
			js_view.loginJobSeeker();
		}
	}
	
	public void registerJobSeeker() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter first name:");
		String fname=sc.next();
		
		System.out.println("\nEnter middle name:");
		String mname=sc.next();
		
		System.out.println("\nEnter last name:");
		String lname=sc.next();
		
		System.out.println("\nEnter DOB(dd-mm-yyyy):");
		String date=sc.next();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
		Date datex=null;
		try {
			datex=dateFormat.parse(date);
			}
		catch(ParseException e) {
			System.out.println("Enter valid Data in Specified Format");
		}
		
		System.out.println("Enter year of passing:");
		int passYear=sc.nextInt();
		
		System.out.println("Years of Experience:");
		int experience=sc.nextInt();
		
		System.out.println("Enter Address:");
		String address=sc.next();
		
		System.out.println("Enter qualification:");
		String qualification=sc.next();

		System.out.println("Enter Skills:");
		List<String> skills=new ArrayList<String>();
		
		int choice;
		
		System.out.println("\n1.Java\n2.SQL\n3.Data Science\n4.Testing\n5.Exit");
		do {

		choice=sc.nextInt();
		
		switch(choice) {
		case 1:skills.add("java");
				break;
		case 2:skills.add("sql");
				break;
		case 3:skills.add("data science");
				break;
		case 4:skills.add("testing");
				break;
		case 5: break;
		
		default:skills.add("Buffon");
			}
		
		}while(choice!=5);
		
		System.out.println("Enter email:");
		String email=sc.next();
		
		System.out.println("Enter Phone Number:");
		String phone=sc.next();
		
		System.out.println("Enter graduation percentage:");
		float percentage=sc.nextFloat();
		
		System.out.println("Enter username:");
		String uname=sc.next();
		
		System.out.println("Enter password:");
		String password=sc.next();
		
		
//		System.out.println("\n"+fname+"\n"+mname+"\n"+lname+"\n"+datex+"\n"+passYear+"\n"+experience+"\n"+address+"\n"+qualification);
//		skills.forEach(System.out::println);
//		System.out.println(email+"\n"+phone+"\n"+percentage+"\n"+uname+"\n"+password);
		JobseekerModel jmodel=new JobseekerModel(fname,mname,lname,datex,passYear,experience,address,qualification,email,phone,percentage,uname,password);
		
		loginJobSeeker();
		}
	
	public void loginJobSeeker() {
		
	}
}
