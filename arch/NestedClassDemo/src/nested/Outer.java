package nested;

public class Outer {
private int data=45;
class Inner{
	public void disp(){
		System.out.println("data is :"+data);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj=new Outer();
		Outer.Inner in=obj.new Inner();
		in.disp();
	}

}
