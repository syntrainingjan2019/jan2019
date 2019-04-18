package nested;

public class Car {
	String brandname;
	public Car(String brandname){
		this.brandname=brandname;
	}
	public class tyre{
		String tyrecompanyname;
		public tyre(String tyrecompanyname){
			this.tyrecompanyname=tyrecompanyname;
		}
		public void dispcarinfo(){
			System.out.println("the car :"+brandname +" uses tyre of :"+tyrecompanyname);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("Hyundai");
		Car.tyre t1=c1.new tyre("ceat");
		t1.dispcarinfo();
		
	}

}
