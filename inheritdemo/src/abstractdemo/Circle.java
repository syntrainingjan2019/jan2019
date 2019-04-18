package abstractdemo;

public class Circle extends Shape{
	int radius;
	public Circle(){
		this.radius=50;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("drawing cicle of radius :"+radius);
	}

}
