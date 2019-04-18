package genericsdemo03;

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> iObj=new Test<Integer>(15);
		System.out.println(iObj.getObject());
		Test<String> sObj=new Test<String>("hello welcome to java generics");
		System.out.println(sObj.getObject());
	}

}
