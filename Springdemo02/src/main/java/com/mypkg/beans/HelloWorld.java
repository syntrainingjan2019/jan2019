package com.mypkg.beans;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Message from external xml is :"+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	
}
