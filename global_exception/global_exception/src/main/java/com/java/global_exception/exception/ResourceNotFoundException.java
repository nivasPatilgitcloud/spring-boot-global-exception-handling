package com.java.global_exception.exception;


public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String message){
		super(message);
	}
}
