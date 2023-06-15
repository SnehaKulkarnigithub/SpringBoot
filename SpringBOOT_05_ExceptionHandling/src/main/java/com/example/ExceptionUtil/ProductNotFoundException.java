package com.example.ExceptionUtil;

public class ProductNotFoundException extends RuntimeException{
	
String errorMessage;
	
	public ProductNotFoundException(String ErrorMsg) {
		super();
		this.errorMessage=ErrorMsg;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
