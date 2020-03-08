package com.muhdfaiz.visitormanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.muhdfaiz.visitormanagementservice.model.BookingDetail;
import com.muhdfaiz.visitormanagementservice.model.OwnerInfo;
import com.muhdfaiz.visitormanagementservice.model.VisitorInformation;

@SpringBootApplication
public class VisitorManagementServiceApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public BookingDetail getBookingDetail() {
		return new BookingDetail();
	}
	
	@Bean
	public VisitorInformation getVisitorInformation() {
		return new VisitorInformation();
	}
	
	@Bean
	public OwnerInfo getOwnerInfo() {
		return new OwnerInfo();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VisitorManagementServiceApplication.class, args);
	}

}
