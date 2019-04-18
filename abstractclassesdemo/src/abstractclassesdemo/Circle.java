package abstractclassesdemo;

public class Circle extends Shape{
	int radius;
	Circle(int a){
		this.radius=a;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("my name is : "+name);
		System.out.println("i can draw a circle with radius :"+radius);
	}

}
