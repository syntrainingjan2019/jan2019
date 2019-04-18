package classesdemo;

public class Triangle implements Shapeinterface{
	int height,base,hypotenuse;

	public Triangle(int height, int base, int hypotenuse) {
		super();
		System.out.println("my name is : "+name);
		
		this.height = height;
		this.base = base;
		this.hypotenuse = hypotenuse;
	}

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void draw(){
		System.out.println();
		System.out.printf("drawing a triangle with height=%d base =%d hypotenuse=%d",height,base,hypotenuse);
	}
}
