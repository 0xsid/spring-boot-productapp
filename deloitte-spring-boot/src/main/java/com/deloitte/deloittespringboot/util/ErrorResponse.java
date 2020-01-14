package com.deloitte.deloittespringboot.util;

import java.util.Date;

public class ErrorResponse {
 
	Date timestamp;
	String message;
	String description;
	
	public ErrorResponse() {
		
	}

	public ErrorResponse(Date timestamp, String message, String description) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}
	
	
	
}
