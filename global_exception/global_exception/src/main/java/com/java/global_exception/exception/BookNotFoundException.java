package com.java.global_exception.exception;

public class BookNotFoundException extends RuntimeException{

	public BookNotFoundException(String message) {
		super(message);
	}
}
