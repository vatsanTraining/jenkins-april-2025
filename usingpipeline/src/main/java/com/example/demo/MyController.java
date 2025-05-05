package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	
	@GetMapping(path = "/")
	public String getMessage() {
		
		return  "Welcome to Spring Framework";
	}
	
	@GetMapping(path = "/greet")
	public String getWelcomeMessage() {
		
		return  "Welcome to Spring with jenkins";
	}
}
