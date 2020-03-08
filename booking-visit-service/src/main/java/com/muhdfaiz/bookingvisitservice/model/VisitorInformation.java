package com.muhdfaiz.bookingvisitservice.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class VisitorInformation {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private int visitorId;
	private String visitorName;
	private String plateNumber;
	private int ownerId;
	
	public VisitorInformation() {
		
	}

	public int getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
	// Get booking information from db
	public List<VisitorInformation> getVisitorDetail(int visitorId) {
		return jdbcTemplate.query(
			"SELECT visitorId, visitorName, plateNumber, ownerId FROM visitor_information WHERE visitorId = " + visitorId, 	
			new BeanPropertyRowMapper<VisitorInformation>(VisitorInformation.class));
	}
}
