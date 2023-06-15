package com.example.SpringBoot_01Project.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_01Project.pojo.Student;

@RestController
public class StudentController {
		
		 @GetMapping("/getStudent")
		 public List<Student> getStudent()
		 {
			 List<Student> studlist=new ArrayList<Student>();
			 studlist.add(new Student(675l,"Ajit","pune"));
			 studlist.add(new Student(90l,"Sneha","Mumbai")); 
			 return studlist;
		 }
		 
		
	}

