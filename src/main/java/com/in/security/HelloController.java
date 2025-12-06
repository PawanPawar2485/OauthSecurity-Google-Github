package com.in.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/login")
	public String Greeting() {
		return"Welcome to Security test";
		
	}

}
