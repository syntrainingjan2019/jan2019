package singletondemo;

public class Singletondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		
		System.out.println("string from x is :"+x.s);
		y.s=(y.s).toUpperCase();
		System.out.println("string from y is :"+y.s);
		z.s=(z.s).toLowerCase();
		System.out.println("string from z is :"+z.s);
	}

}
