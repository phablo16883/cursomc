package com.nelioalves.cursomc.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.env.SystemEnvironmentPropertySourceEnvironmentPostProcessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;

import com.nelioalves.cursomc.services.exceptions.ObjecNotFoundException;

@RestControllerAdvice
public class ResouceExceptionHandler {
	
	
	@ExceptionHandler(ObjecNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFoundEntity(ObjecNotFoundException e, HttpServletRequest request){
		
		
	StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(),  e.getMessage() , System.currentTimeMillis());
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}

}
