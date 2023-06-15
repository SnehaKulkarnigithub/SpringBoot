package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomer() {
		return "Able to access get customer Request";
	}
	
	@RequestMapping(value="/product", method = RequestMethod.GET)
	public List<String> getProduct(){
		return Arrays.asList("T-shirts","shoes");
		
	}
}

