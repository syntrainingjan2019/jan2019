package com.mypkg.beans;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("your message is : "+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
