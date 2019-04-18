package com.mypkg.main;

public class Rectangle implements Shape,ShapeArea{
	String name;
	
Rectangle(){
	this.name="Rectangle";
}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void getname() {
		// TODO Auto-generated method stub
		System.out.println("my name is :"+name);
	}
	@Override
	public void getarea() {
		// TODO Auto-generated method stub
		System.out.println("I will get area of the rectangle");
	}

}
