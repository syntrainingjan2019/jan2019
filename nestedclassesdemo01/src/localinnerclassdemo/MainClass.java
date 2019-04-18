package localinnerclassdemo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerObject=new OuterClass();
		OuterClass.InnerClass innerObject=outerObject.new InnerClass();
		innerObject.display();
	}

}
