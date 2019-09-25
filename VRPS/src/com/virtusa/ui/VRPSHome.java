package com.virtusa.ui;
import java.util.Scanner;

import com.virtusa.view.EmployeeView;
import com.virtusa.view.JobseekerView;

public class VRPSHome {


		public static void main(String[] args) {
			
	int  i,j=0;
		Scanner s=new Scanner(System.in);
	System.out.println("\n1.JobSeeker\n2.Employee");
	i=s.nextInt();
	if(i==1)
	{
		JobseekerView js_viewobj=new JobseekerView();
		js_viewobj.mainMenu();
	}
	else if(i==2)
	{
		EmployeeView e_viewobj=new EmployeeView();
		e_viewobj.mainMenu();
	}
	}
	}
