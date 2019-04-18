package abstractdemo;

public abstract class Shape {
	String name;

	public Shape() {
		super();
		this.name="no name";
		// TODO Auto-generated constructor stub
	}
	public void draw(){
		System.out.println("drawing a shape");
	}
}
