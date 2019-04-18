package inherit;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(50);
		c.setName("circle");
		c.draw();
		rectangle r=new rectangle(30,20);
		r.setName("rectangle");
		r.draw();
		Shape s=new Circle();	
		s.draw();
		s=new rectangle();
		s.draw();
	}

}
