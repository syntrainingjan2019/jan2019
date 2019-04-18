package localinnerclass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerObject=new OuterClass();
		OuterClass.InnerClass innerObect=outerObject.new InnerClass();
		innerObect.display();
		
	}

}
