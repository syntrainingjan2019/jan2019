package classesdemo;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapeinterface si=new Circle(45);
		si.draw();
		si=new Triangle(3,5,6);
		si.draw();
		si=new Rectangle(3,6);
		si.draw();
	}

}
