package com.virtusa.entities;

/*
 * FIRST_NAME       VARCHAR2(40) NOT NULL, 
MIDDLE_NAME      VARCHAR2(40) NOT NULL,
LAST_NAME        VARCHAR2(40) NOT NULL, 
DATE_OF_BIRTH    DATE NOT NULL ,         
PHONE_NUMBER             VARCHAR2(40), 
QUALIFICATION    VARCHAR2(40) NOT NULL,
EMAIL_ID         VARCHAR(40) NOT NULL,
YEAR_OF_PASSING  NUMBER(4) NOT NULL,
SKILLS VARCHAR2(40),
JS_ID VARCHAR2(40), 
 */


public class JobseekerEntity {

	private String first_name;
	private String middle_name;
	private String last_name;
	private LocalDate date_of_birth;
	private String phoneNumber;
	private List<String> qualification;
	
	
	
}
