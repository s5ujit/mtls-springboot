package com.plumstep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("server")
public class ServerController {
	@GetMapping("/api")
    ResponseEntity<?> getMessage() {
	return ResponseEntity.ok("Server successfully called!");
    }
}
