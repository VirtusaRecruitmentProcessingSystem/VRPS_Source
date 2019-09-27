package com.virtusa.model;

public class TrModel {

	private String UserName;
	private String  password;
	
	public void trModel(String UserName, String password) {
		this.UserName=UserName;
    	this.password=password;
	}
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}

}
