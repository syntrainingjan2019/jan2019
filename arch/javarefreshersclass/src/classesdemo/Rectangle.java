package classesdemo;

public class Rectangle implements Shapeinterface{
	int length,breadth;

	public Rectangle(int length, int breadth) {
		super();
		System.out.println("my name is : "+name);
		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void draw(){
		System.out.println();
		System.out.printf("drawing a rectangle with length=%d breadth =%d :",length,breadth);
	}
}
