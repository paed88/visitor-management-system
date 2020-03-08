package com.muhdfaiz.ownerinformationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.muhdfaiz.ownerinformationservice.model.OwnerInfo;

@SpringBootApplication
public class OwnerInformationServiceApplication {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public OwnerInfo getOwnerInfoBean() {
		return new OwnerInfo();
	}

	public static void main(String[] args) {
		SpringApplication.run(OwnerInformationServiceApplication.class, args);
	}

}
