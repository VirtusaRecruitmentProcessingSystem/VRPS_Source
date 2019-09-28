package com.virtusa.validation;

import java.util.ArrayList;
import java.util.List;

public class JobseekerValidation {

public boolean validString(String val) {
		
		boolean result=false;
		char chars[]=val.toCharArray();
		List<Character> alphabets=new ArrayList<>();
		for(int i=97;i<=122;i++) {
			alphabets.add((char)i);
		}
		
		for(char ch:chars) {
			if(alphabets.contains(ch)) {
				result=true;
			}else {
				return false;
			}
		}
		return result;
	}

	public boolean validNumber(int number) {
		boolean result=false;
		String data=String.valueOf(number);
		if(data.matches(".*[0-9]")) {
			result=true;
		}
		return result;
	}
	
	public boolean validSalary(double salary) {
		boolean result=false;
		String salaryVal=String.valueOf((int)salary);
		if(salary>0 && salaryVal.length()<=5) {
			result=true;
		}
		return result;
}
	
	public boolean validEmail(String email) {
		boolean result=false;
		if(email.matches("^(.+)@(.+)$")) {
			result=true;
		}
		return result;
	}
	
	
}
