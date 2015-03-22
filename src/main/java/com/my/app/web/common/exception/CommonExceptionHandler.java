package com.my.app.web.common.exception;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {

	@ExceptionHandler(Exception.class)
	public String handleException(Exception e) {
		if (e instanceof BindException) {
			BindException be = (BindException) e;
			
			for (FieldError fe : be.getFieldErrors()) {
				System.out.println(fe.getObjectName() + ", " + fe.getField() + ", " + fe.getRejectedValue());
			}
		}
		
		return "date/date";
	}
	
}
