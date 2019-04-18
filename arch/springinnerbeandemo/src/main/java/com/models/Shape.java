package com.models;

public class Shape {
	Circle c;
	public Shape(){
		
	}	
	
	public Circle getC() {
		return c;
	}

	public void setC(Circle c) {
		this.c = c;
	}

	public void draw(){
		c.draw();
	}
}
