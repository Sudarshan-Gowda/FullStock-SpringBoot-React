package com.star.sud.restservices.basicauth;

public class BasicAuth {

	private String message;

	public BasicAuth() {
		super();
	}

	public BasicAuth(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "BasicAuth [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
