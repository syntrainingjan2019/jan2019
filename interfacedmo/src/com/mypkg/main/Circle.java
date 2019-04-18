package com.mypkg.main;

public class Circle implements Shape,ShapeArea{
	String name;
	Circle(){
		this.name="circle";
	}
	@Override
	public void getname() {
		// TODO Auto-generated method stub
		System.out.println("my name is :"+this.name);
	}
	@Override
	public void getarea() {
		// TODO Auto-generated method stub
		System.out.println("I will get area of the circle");
	}
}
