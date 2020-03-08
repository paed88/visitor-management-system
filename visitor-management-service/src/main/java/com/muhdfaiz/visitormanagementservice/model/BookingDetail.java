package com.muhdfaiz.visitormanagementservice.model;

public class BookingDetail {
	
	private int bookingId;
	private String bookingBy;
	private int visitorId;
	private String reason;
	
	public BookingDetail() {
		
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingBy() {
		return bookingBy;
	}

	public void setBookingBy(String bookingBy) {
		this.bookingBy = bookingBy;
	}

	public int getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
