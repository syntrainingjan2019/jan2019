
public class OuterClass {
private int data=45;
class InnerClass{
	void msg(){
		System.out.println("data is : "+data);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerobj=new OuterClass();
		OuterClass.InnerClass in=outerobj.new InnerClass();
		in.msg();
	}

}
