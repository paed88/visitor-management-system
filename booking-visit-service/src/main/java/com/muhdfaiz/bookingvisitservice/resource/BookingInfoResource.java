package com.muhdfaiz.bookingvisitservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muhdfaiz.bookingvisitservice.model.BookingDetail;
import com.muhdfaiz.bookingvisitservice.model.VisitorInformation;

@RestController
@RequestMapping("/bookingInfo")
public class BookingInfoResource {
	
	@Autowired
	BookingDetail bookingDetail;
	
	@Autowired
	VisitorInformation visitorInformation;
	
	@RequestMapping("/bookingId/{bookingId}")
	public BookingDetail getBookingInfo(@PathVariable("bookingId") int bookingId) {
		return bookingDetail.getBookingDetail(bookingId).get(0);
	}
	
	@RequestMapping("/visitorId/{visitorId}")
	public VisitorInformation getVisitorInfo(@PathVariable("visitorId") int visitorId) {
		return visitorInformation.getVisitorDetail(visitorId).get(0);
	}

}
