package inheritancedemo;

public class Circle extends Shape{
	private int radius;
	public Circle(){
		super("circle");
		this.radius=20;		
	}
	public Circle(int radius){
		super ("circle");
		this.radius=radius;		
	}
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void getarea(){
		
		double area=2.14*radius*radius;
		System.out.println("Area of the circle is :"+area);
	}
	@Override
	public void setparentname(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
}
