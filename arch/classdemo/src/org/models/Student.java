package org.models;

public class Student {
	int stuid;
	String name;
	int age;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", name=" + name + ", age=" + age + "]";
	}
	public Student(int stuid, String name, int age) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
