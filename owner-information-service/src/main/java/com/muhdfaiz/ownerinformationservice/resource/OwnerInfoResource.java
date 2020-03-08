package com.muhdfaiz.ownerinformationservice.resource;

import com.muhdfaiz.ownerinformationservice.model.OwnerInfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ownerInfo")
public class OwnerInfoResource {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	OwnerInfo ownerInfo;
	
	@RequestMapping("/{ownerId}")
	public OwnerInfo getOwnerFullInfo(@PathVariable("ownerId") int ownerId) {
		return ownerInfo.getFullOwnerInfo(ownerId).get(0);
	}
	

}
