package com.krish.basic.authentication.spring.security.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/hello-world")
	public String getWelcome() {
		return "Hello World!";
	}
	
}
