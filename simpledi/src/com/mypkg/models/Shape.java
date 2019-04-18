package com.mypkg.models;

public class Shape {
	Circle c;
	Rectangle r;
	public void draw(Circle c){
		this.c=c;
		c.draw();
	}
	public void draw(Rectangle r){
		this.r=r;
		r.draw();
	}
}
