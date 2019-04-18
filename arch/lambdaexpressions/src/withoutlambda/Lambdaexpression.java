package withoutlambda;

public class Lambdaexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius=15;
		Drawable d1=()->{
			System.out.println("Drawing circle with radius "+radius);
		};
		d1.Draw();
	}

}
