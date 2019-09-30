package com.virtusa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.virtusa.entities.JobEntity;

public class jobServiceImpl implements jobServices {

	
	@Override
	public void viewjobPosts() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addJobPost() {
		
		
		// TODO Auto-generated method stub
		
			int jobId;
			String description;
			String designation;
			double eligibiltyPer;
			List<String> skills;

			Scanner input=new Scanner(System.in);
			
			System.out.println("-------------------");
			System.out.println("  Adding Job Post  ");
			System.out.println("-------------------\n");
			System.out.println(" Enter Job ID:");
			jobId=input.nextInt();
			System.out.println(" Enter Job Role:");
			designation=input.next();
			
			System.out.println("\n1.Java\n2.SQL\n3.Data Science\n4.Testing\n5.Exit");
			
			skills=new ArrayList<String>();
			
			int choice;
			
			
			do {
			System.out.println(" Enter Required Skills:");
			choice=input.nextInt();
			
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
			System.out.println(" Enter Job Description:");
			description=input.next();
			
			System.out.println(" Enter Eligibility percentage:");
			eligibiltyPer=input.nextDouble();
			JobEntity newjob=new JobEntity(jobId,description,designation,eligibiltyPer,skills);
			
	}

}
