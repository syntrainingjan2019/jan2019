package abstractdemo;

public class Rectangle extends Circle{
	int length, breadth;

	public Rectangle() {
		this.length = 30;
		this.breadth = 20;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("drawing rectangle with length :"+length+"  breadth :"+breadth);
	}
	
}
