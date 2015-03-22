package com.my.app.web.common.exception;

public class CommonException extends RuntimeException {

	private static final long serialVersionUID = 8167828998937350991L;
	
	private String errorCode;
	
	private String errorMessage;
	
	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
