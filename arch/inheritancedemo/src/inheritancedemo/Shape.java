package inheritancedemo;

public abstract class Shape {
	String name;
	public Shape(){
		System.out.println("i have no name");
	}
	public Shape(String name){
		this.name=name;
		System.out.println("i am a "+name);
	}
	public abstract void setparentname(String name);
	
}
