package com.example.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Student {
	@JsonIgnore
	private int studid;
	@JsonInclude(value=Include.NON_NULL)
	private String studname;
	@JsonInclude(value=Include.NON_NULL)
	private String city;
	
	public Student()
	{
		
	}

	public Student(int studid, String studname, String city) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.city = city;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
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
