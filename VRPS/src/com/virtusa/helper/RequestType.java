package com.virtusa.helper;

public enum RequestType {
APPLICATION_ID("applicationid"),FIRSTNAME("firstname"),LASTNAME("lastname"),EMAIL("email");
	
	private String val;
	private RequestType(String val) {
		
		this.val=val;
	}
	
	public String getVal() {
		return val;
	}

}
