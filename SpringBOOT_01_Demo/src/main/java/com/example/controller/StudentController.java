package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.beans.Student;
import com.example.model.StudentResponse;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping(value = "/getStudent")
	public String getStudent() {
		return "Hello Student";
	}
	
	@GetMapping("/getStudentById")
	public List<String> getStudentById(@RequestParam("studid") String studid) {
		System.out.println(studid);
		List<String> list = new ArrayList<>();
		list.add("abcd");
		list.add("pqr");
		list.add("xyz");
		return list;
	}
	
	@GetMapping("/getStudentByName/{studname}")
	public List<String> getEmployeeByName(@PathVariable("studname") String studname) {
		System.out.println(studname);
		List<String> list = new ArrayList<>();
		list.add("abcd");
		list.add("pqr");
		list.add("xyz");
		return list;
	}

	
	@GetMapping("/getStudent1")
	public ResponseEntity<StudentResponse> getStudent(@RequestBody Student stud)
	{
		StudentResponse st= new StudentResponse(stud.getStudname(),stud.getCity());
		return new ResponseEntity<StudentResponse>(st, HttpStatus.CREATED);
	}
	
	 @GetMapping("/getEmptyStudent")
	    public Optional<Student> getEmptyStudent() {
	    
	        Student student = new Student();
	        return Optional.of(student);

	    }
	
}

	       