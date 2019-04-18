package abstractdemo02;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b=new SBI();
		System.out.println("Rate  of Interest for SBI is :"+b.getRateOfInterest());
		b=new PNB();
		System.out.println("Rate of Interest for PNB is : "+b.getRateOfInterest());
	}

}
