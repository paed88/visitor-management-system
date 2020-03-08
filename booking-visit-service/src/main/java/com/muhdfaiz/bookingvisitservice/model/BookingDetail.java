package com.muhdfaiz.bookingvisitservice.model;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookingDetail {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
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
	
	// Get booking information from db
	public List<BookingDetail> getBookingDetail(int bookingId) {
		return jdbcTemplate.query(
			"SELECT bookingId, bookingBy, visitorId, reason FROM booking_detail WHERE bookingId = " + bookingId, 	
			new BeanPropertyRowMapper<BookingDetail>(BookingDetail.class));
	}
}
