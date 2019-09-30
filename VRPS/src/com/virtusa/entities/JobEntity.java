package com.virtusa.entities;

import java.util.List;

public class JobEntity {

	private int jobId;
	private String description;
	private String designation;
	private double eligibiltyPer;
	List<String> skills;

	
	public JobEntity() {}
	
	public JobEntity(int jobId, String description, String designation, double eligibiltyPer, List<String> skills) 
	{
		this.jobId = jobId;
		this.description = description;
		this.designation = designation;
		this.eligibiltyPer = eligibiltyPer;
		this.skills = skills;
	}

	
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String desgination) {
		this.designation = desgination;
	}
	public double getEligibiltyPer() {
		return eligibiltyPer;
	}
	public void setEligibiltyPer(double eligibiltyPer) {
		this.eligibiltyPer = eligibiltyPer;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	
	

}
