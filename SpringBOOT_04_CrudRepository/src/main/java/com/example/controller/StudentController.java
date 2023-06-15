package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping(value="/getAllStudent")
	public List<Student> getAllStudent()
	{
		return service.getAllStudent();
	}
	
	@PostMapping(value="/createStudent" , consumes= MediaType.APPLICATION_JSON_VALUE)
	public void createStudent(@RequestBody Student student) {
		service.saveStudent(student);
	}
	
	@GetMapping(value="/getStudent/{id}")
	public Optional<Student> getStudentById(@PathVariable("id") Integer id)
	{
		return service.findStudentById(id);
	}
	
	@DeleteMapping(value="/deleteStudent/{id}")
	public void deleteStudentById(@PathVariable("id") Integer id)
	{
		service.deleteStudentById(id);
	}
	
	@PutMapping(value="/updateStudent")
	public void updateStudent(@RequestBody Student student)
	{
		service.updateStudent(student);
	}

}
