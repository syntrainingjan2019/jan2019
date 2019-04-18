package withoutlambda;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius=15;
		Drawable d=new Drawable(){
			public void Draw(){
				System.out.println("Drawing circle with radius "+radius);
			}
		};
		d.Draw();
	}

}
