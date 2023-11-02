package com.plumstep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("client")
public class ClientController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/api")
	ResponseEntity<?> getMessage() {
		
		
		
		ResponseEntity<String> res=restTemplate.getForEntity("https://localhost:8111/server/api",String.class);
		System.out.println(res.getStatusCodeValue());
		return ResponseEntity.ok("Client successfully called!");
	}
}
