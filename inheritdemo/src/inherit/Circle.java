package inherit;

public class Circle extends Shape{
	int radius;

	public Circle(int radius) {
		super();
		this.name="Circle";
		this.radius = radius;
	}

	public Circle() {
		super();
		this.radius=30;
		// TODO Auto-generated constructor stub
	}
	public void draw(){
		System.out.println("my name is :"+name);
		System.out.println("Drawig a circle with radius :"+radius);
	}
	
}
