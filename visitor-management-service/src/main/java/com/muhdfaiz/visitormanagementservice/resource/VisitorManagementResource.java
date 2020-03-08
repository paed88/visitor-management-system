package com.muhdfaiz.visitormanagementservice.resource;

import com.muhdfaiz.visitormanagementservice.model.BookingDetail;
import com.muhdfaiz.visitormanagementservice.model.OwnerInfo;
import com.muhdfaiz.visitormanagementservice.model.VisitorInformation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/visitor")
public class VisitorManagementResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	BookingDetail bookingDetail;
	
	@Autowired
	VisitorInformation visitorInformation;
	
	@Autowired
	OwnerInfo OwnerInfo;
	
	// Function use to get booking Id when the visitor came in
	@RequestMapping("/{bookingId}")
	public Map<String, Object> getVisitorBookingInfo(@PathVariable("bookingId") int bookingId) {
		
		// Create response object
		Map<String, Object> jsonResponse = new HashMap<String, Object>();
		
		// Get booking information from booking-visit-service
		BookingDetail bookingDetail = restTemplate.getForObject("http://booking-visit-service/bookingInfo/bookingId/" + bookingId, BookingDetail.class);
		jsonResponse.put("bookingDetail", bookingDetail);
		
		// Get visitor information from booking-visit-service
		VisitorInformation visitorInformation = restTemplate.getForObject("http://booking-visit-service/bookingInfo/visitorId/" + bookingDetail.getVisitorId(), VisitorInformation.class);   
		jsonResponse.put("visitorDetail", visitorInformation);
		
		// Get owner information from booking-visit-service
		OwnerInfo OwnerInfo = restTemplate.getForObject("http://owner-information-service/ownerInfo/" + visitorInformation.getOwnerId(), OwnerInfo.class);   
		jsonResponse.put("ownerDetail", OwnerInfo);
		
		return jsonResponse;
	}
	
	// Function to add new visitor into db
	@RequestMapping()
	public void addNewVisitor() {
		
	}
	

}
