package com.virtusa.model;

import java.util.Date;

public class ApplicationModel {

	private String fname;
	private String mname;
	private String lname;
	private Date datex;
	private int passYear;
	private int experience;
	private String address;
	private String qualification;
	private String email;
	private String phone;
	private double percentage;

	public ApplicationModel(String fname, String mname, String lname, Date datex, int passYear, int experience,
			String address, String qualification, String email, String phone, float percentage) {
		// TODO Auto-generated constructor stub
		this.fname=fname;
		this.mname=mname;
		this.address=address;
		this.datex=datex;
		this.email=email;
		this.experience=experience;
		this.lname=lname;
	
		this.phone=phone;
		this.qualification=qualification;
		
	}

	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDatex() {
		return datex;
	}
	public void setDatex(Date datex) {
		this.datex = datex;
	}
	public int getPassYear() {
		return passYear;
	}
	public void setPassYear(int passYear) {
		this.passYear = passYear;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	
}
