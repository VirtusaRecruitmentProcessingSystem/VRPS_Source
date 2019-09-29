package com.virtusa.model;

public class loginModel {
String username;
String password;

	public loginModel(String username,String password) {
		this.username=username;
		this.password=password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
}
