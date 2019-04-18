package com.models;

public class HelloWorld {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void printHello(){
		System.out.println("say hello to "+name);
	}
	public void init(){
		System.out.println("Bean is going through init");
	}
	public void destroy(){
		System.out.println("Bean will destroy now ");
	}
}
