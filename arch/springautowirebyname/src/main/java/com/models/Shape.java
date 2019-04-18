package com.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Shape {
	@Autowired 
	@Qualifier("dummytriangle")
	Triangles rttriangle;
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shape(Triangles rttriangle,String name){
		this.rttriangle=rttriangle;
		this.name=name;
	}

	public Triangles getRttriangle() {
		return rttriangle;
	}

	public void setRttriangle(Triangles rttriangle) {
		this.rttriangle = rttriangle;
	}	
	public void draw(){
		this.rttriangle.draw();
	}
	
}
