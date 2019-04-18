package classesdemo;

public class Circle implements Shapeinterface{
	int radius;
	Circle(){
		radius=20;
	}
	Circle(int radius){
		System.out.println("my name is : "+name);
		this.radius=radius;
	}
	public void draw(){
		System.out.println("drawing a circle with radius :"+radius);
	}
}
