package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.beans.Student;
import com.example.dao.StudentDAO;

@Service
public class StudentService {
	
	@Autowired
	private StudentDAO studentDAO;
	
	// to get all students from database we use findALL() from JpaRepository Interface
	
	public List<Student> getAllStudent()
	{
		return studentDAO.findAll();
	}
	
	//to insert the student data into database we use save() method from JpaRepository Interface
	
	public void saveStudent(Student student)
	{
		studentDAO.save(student);
	}
	
	//to search the student data using id we use findById() method
	
	public Optional<Student> findStudentById(Integer Id)
	{
		return studentDAO.findById(Id);
	}
	
	//to update data to database we use save() method
	
	public void updateStudent(Student student)
	{
		studentDAO.save(student);
	}
	
	//to delete student data from database we use delete() method of StudentDAO interface
	
	public void deleteStudentById(Integer Id)
	{
		studentDAO.deleteById(Id);
	}
	
}
