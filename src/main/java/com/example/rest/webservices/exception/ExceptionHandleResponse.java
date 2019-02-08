package com.example.rest.webservices.exception;

import java.util.Date;

public class ExceptionHandleResponse {
	private Date timestamp;
	private String message;
	private String details;

	public ExceptionHandleResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "ExceptionHandler [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
	}

}
