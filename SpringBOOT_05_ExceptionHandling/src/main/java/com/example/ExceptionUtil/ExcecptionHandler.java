package com.example.ExceptionUtil;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcecptionHandler {

 /*	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity exception(EmployeeNotFoundException exception){
		return new ResponseEntity(exception.getErrorMessage(), HttpStatus.NOT_FOUND);	
	}
	*/
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity exception(ProductNotFoundException exception)
	{
		return new ResponseEntity(exception.getErrorMessage(), HttpStatus.NOT_FOUND);
	}
	
 
 	
	}

