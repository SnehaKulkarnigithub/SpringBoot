package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Course;
import com.example.repository.CourseRepository;

@RestController
public class CourseController {

	@Autowired
	CourseRepository courseRepository;
	
	@PostMapping(path = "/addCourse")
	public void addCourse(@RequestBody Course course) {
		courseRepository.save(course);
	}
	
	@GetMapping(path = "/getAllCourse")
	public void getAllCourse() {
		courseRepository.jpql_namedQuery();
	}
	
	@GetMapping(path="/getCourseById")
	public void getCourseById() {
		courseRepository.jpql_native_with_named_parameter();
	}
	
}
