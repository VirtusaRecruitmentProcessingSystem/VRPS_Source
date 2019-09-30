package com.virtusa.view;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.virtusa.exception.ValidationException;
import com.virtusa.model.ApplicationModel;
import com.virtusa.model.JobseekerModel;
import com.virtusa.model.loginModel;
import com.virtusa.validation.JobseekerValidation;

public class JobseekerView {
//
static	Scanner scanner=new Scanner(System.in);
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
		JobseekerValidation validator=new JobseekerValidation(); 
		//Scanner scanner=new Scanner(System.in);
		boolean flag=true;
		//////////////////////
		System.out.print("First Name:");
		String firstName=scanner.next();
		
		boolean validfirstName=validator.validString(firstName);
		if(!validfirstName)
			try {
			throw new ValidationException("[!ERROR!:Invalid First Name]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				mainMenu();
			}
		////////////////////////////
		
		System.out.println("\nEnter middle name:");
		String mName=scanner.next();
		boolean validmiddleName=validator.validString(mName);
		if(!validmiddleName)
			try {
			throw new ValidationException("[!ERROR!:Invalid Middle Name]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				mainMenu();
			}
		////////////////////////////
		System.out.println("\nEnter last name:");
		String lName=scanner.next();
		
		boolean validlastName=validator.validString(lName);
		if(!validlastName)
			try {
			throw new ValidationException("[!ERROR!:Invalid Last Name]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				mainMenu();
			}
		////////////////////////////

		Date datex=null;		
		do {
		System.out.println("\nEnter DOB(dd-mm-yyyy):");
		String date=scanner.next();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");

		try {
			datex=dateFormat.parse(date);
			flag=false;
			}
		catch(ParseException e) {
			System.out.println("Enter valid Data in Specified Format");
		}
		}
		while(flag);
		////////
		System.out.println("Enter year of passing:");
		int passYear=scanner.nextInt();
		boolean validyearofPass=validator.validNumber(passYear);
		if(!validyearofPass) {
			try {
				throw new ValidationException("Input Format Error\nInvalid entry for year of pass");
			}
			catch(ValidationException e) {
				System.out.println(e.getMessage());
				
			}
			
		}
		//////
		System.out.println("Years of Experience:");
		int experience=scanner.nextInt();
		
		System.out.println("Enter Address:");
		String address=scanner.next();
		
		System.out.println("Enter qualification:");
		String qualification=scanner.next();

		System.out.println("Enter Skills:");
		List<String> skills=new ArrayList<String>();
		
		int choice;
		
		System.out.println("\n1.Java\n2.SQL\n3.Data Science\n4.Testing\n5.Exit");
		do {

		choice=scanner.nextInt();
		
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
		
		default:skills.add("c");
			}
		
		}while(choice!=5);
		
		System.out.println("Enter email:");
		String email=scanner.next();
		
		System.out.println("Enter Phone Number:");
		String phone=scanner.next();
		
		
		System.out.println("Enter graduation percentage:");
		float percentage=scanner.nextFloat();
		
		System.out.println("Enter username:");
		String uname=scanner.next();
		
		System.out.println("Enter password:");
		String password=scanner.next();
		
		
//		System.out.println("\n"+fname+"\n"+mname+"\n"+lname+"\n"+datex+"\n"+passYear+"\n"+experience+"\n"+address+"\n"+qualification);
//		skills.forEach(System.out::println);
//		System.out.println(email+"\n"+phone+"\n"+percentage+"\n"+uname+"\n"+password);
		JobseekerModel jmodel=new JobseekerModel(firstName,mName,lName,datex,passYear,experience,address,qualification,email,phone,percentage,uname,password);

		loginJobSeeker();
		}
	
	public void loginJobSeeker() {
		Scanner sc=new Scanner(System.in);		
		System.out.println("-----------------JobSeeker LOGIN--------------\n\n");
		
		System.out.println("Enter username:");
		String uname=sc.next();
		
		System.out.println("Enter password:");
		String password=sc.next();

		loginModel lmodel=new loginModel(uname,password);
		
		/*
		 * 
		 */
	}

	
	public void applyJob() {
		
		JobseekerValidation validator=new JobseekerValidation(); 
		
		boolean flag=true;
		//////////////////////
		System.out.print("First Name:");
		String firstName=scanner.next();
		
		boolean validfirstName=validator.validString(firstName);
		if(!validfirstName)
			try {
			throw new ValidationException("[!ERROR!:Invalid First Name]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				mainMenu();
			}
		////////////////////////////
		
		System.out.println("\nEnter middle name:");
		String mName=scanner.next();
		boolean validmiddleName=validator.validString(mName);
		if(!validmiddleName)
			try {
			throw new ValidationException("[!ERROR!:Invalid Middle Name]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				mainMenu();
			}
		////////////////////////////
		System.out.println("\nEnter last name:");
		String lName=scanner.next();
		
		boolean validlastName=validator.validString(lName);
		if(!validlastName)
			try {
			throw new ValidationException("[!ERROR!:Invalid Last Name]");
			}catch(ValidationException e) {
				System.out.println(e.getMessage());
				mainMenu();
			}
		////////////////////////////

		Date datex=null;		
		do {
		System.out.println("\nEnter DOB(dd-mm-yyyy):");
		String date=scanner.next();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");

		try {
			datex=dateFormat.parse(date);
			flag=false;
			}
		catch(ParseException e) {
			System.out.println("Enter valid Data in Specified Format");
		}
		}
		while(flag);
		////////
		System.out.println("Enter year of passing:");
		int passYear=scanner.nextInt();
		boolean validyearofPass=validator.validNumber(passYear);
		if(!validyearofPass) {
			try {
				throw new ValidationException("Input Format Error\nInvalid entry for year of pass");
			}
			catch(ValidationException e) {
				System.out.println(e.getMessage());
				
			}
			
		}
		//////
		System.out.println("Years of Experience:");
		int experience=scanner.nextInt();
		
		System.out.println("Enter Address:");
		String address=scanner.next();
		
		System.out.println("Enter qualification:");
		String qualification=scanner.next();

		System.out.println("Enter Skills:");
		List<String> skills=new ArrayList<String>();
		
		int choice;
		
		System.out.println("\n1.Java\n2.SQL\n3.Data Science\n4.Testing\n5.Exit");
		do {

		choice=scanner.nextInt();
		
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
		
		default:skills.add("c");
			}
		
		}while(choice!=5);
		
		System.out.println("Enter email:");
		String email=scanner.next();
		
		System.out.println("Enter Phone Number:");
		String phone=scanner.next();
		
		
		System.out.println("Enter graduation percentage:");
		float percentage=scanner.nextFloat();
		
		System.out.println("Enter username:");
		String uname=scanner.next();
		
		System.out.println("Enter password:");
		String password=scanner.next();
		
		System.out.println("Enter jobId:");
		int jobId=scanner.nextInt();
		

		ApplicationModel application=new ApplicationModel
				(firstName,mName,lName,datex,passYear,experience,address,qualification,email,phone,percentage,jobId,skills);
		
		
		
	}
	
	
	public void viewStatus() {
		
		System.out.println("Enter Reference ID:");
		int refId=scanner.nextInt();
		
		
	}
}
 