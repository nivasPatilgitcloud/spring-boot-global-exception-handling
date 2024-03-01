package com.java.global_exception.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleCustomException(ResourceNotFoundException e, WebRequest req){
		ExceptionResponse er = new ExceptionResponse(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(er, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleBookNotFound(BookNotFoundException e, WebRequest req){
		ExceptionResponse er = new ExceptionResponse(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(er, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(RecordEmptyException.class)
	public ResponseEntity<ExceptionResponse> handleEmptyRecordException(RecordEmptyException e, WebRequest req){
		ExceptionResponse er = new ExceptionResponse(LocalDateTime.now(),e.getMessage(),req.getDescription(false));
		return new ResponseEntity<>(er,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> handleAllOtherException(Exception e, WebRequest req){
		ExceptionResponse er = new ExceptionResponse(LocalDateTime.now(), e.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(er, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
