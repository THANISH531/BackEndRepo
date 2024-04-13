package com.example.product.exceptions;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException {
	String message;
	public ResourceNotFoundException(String message) {
		this.message = message;
	}
	public String toString() {
		return message;
	}

}
