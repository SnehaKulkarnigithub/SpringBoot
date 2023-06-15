package com.example.SpringBoot_01Project.Controller;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/")
	public String getMessage()
	{
		return "Welcome to Spring boot Application";
		
	}

}
