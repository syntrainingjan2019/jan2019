package com.models;

public class Circle {
	int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw(){
		System.out.println("i can draw a circle with radius of "+radius);
	}
}
