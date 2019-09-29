package com.virtusa.helper;

public enum RequestType {
FIRSTNAME("firstname"),MIDDLENAME("middlename"),LASTNAME("lastname");
	
	private String val;
	private RequestType(String val) {
		
		this.val=val;
	}
	
	public String getVal() {
		return val;
	}

}
