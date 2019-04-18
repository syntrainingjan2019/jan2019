package com.models;

public class Triangles {
	int height,base,hypotenuse;
	void draw(){
		System.out.println("drawing triangle with height :"+height+" base :"+base+" hypotenuse :"+hypotenuse);
	}
	public Triangles(){
		
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHypotenuse() {
		return hypotenuse;
	}
	public void setHypotenuse(int hypotenuse) {
		this.hypotenuse = hypotenuse;
	}
	
}
