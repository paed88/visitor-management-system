package com.muhdfaiz.visitormanagementservice.model;

public class OwnerInfo {
	
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
}
