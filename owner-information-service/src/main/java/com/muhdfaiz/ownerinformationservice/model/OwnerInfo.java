package com.muhdfaiz.ownerinformationservice.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class OwnerInfo {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private int ownerId;
	private int cardId;
	private String ownerName;
	private String unit;
	private String status;
	
	public OwnerInfo() {
		
	}
	
	public OwnerInfo(int ownerId, int cardId, String ownerName, String unit, String status) {
		super();
		this.ownerId = ownerId;
		this.cardId = cardId;
		this.ownerName = ownerName;
		this.unit = unit;
		this.status = status;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	// Get Owner Information
	public List<OwnerInfo> getFullOwnerInfo(int ownerId) {
		return jdbcTemplate.query(
			"SELECT ownerId, cardId, ownerName, unit, status FROM owner_info WHERE ownerId = " + ownerId, 
			new BeanPropertyRowMapper<OwnerInfo>(OwnerInfo.class));
	}
}
