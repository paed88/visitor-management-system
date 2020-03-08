package com.muhdfaiz.bookingvisitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.muhdfaiz.bookingvisitservice.model.BookingDetail;
import com.muhdfaiz.bookingvisitservice.model.VisitorInformation;

@SpringBootApplication
public class BookingVisitServiceApplication {
	
	@Bean
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

	public static void main(String[] args) {
		SpringApplication.run(BookingVisitServiceApplication.class, args);
	}

}
