package genericsdemo;

public class genericsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> iObj=new Test<Integer>(15);
		System.out.println(iObj.getOject());
		Test<String> sObj=new Test<String>("hello java generics");
		System.out.println(sObj.getOject());
	}

}
