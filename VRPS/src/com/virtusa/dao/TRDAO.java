package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.JobseekerEntity;

public interface TRDAO {

	public List<JobseekerEntity> getAllJobSeekers()throws ClassNotFoundException, SQLException;
	
}
