package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StudentResponse {
	private String studname;
	private String city;
	
	public StudentResponse() {
		
	}

	public StudentResponse(String studname, String city) {
		super();
		this.studname = studname;
		this.city = city;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
