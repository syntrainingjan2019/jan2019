package arraysdemo;

public class callbyvalueref {
	int a,b;
	public void swap(callbyvalueref as){		
		int temp=as.a;
		as.a=as.b;
		as.b=temp;
		System.out.println("inside swap function a:"+as.a+" b:"+as.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		callbyvalueref as=new callbyvalueref();
		as.a=10;
		as.b=20;
		as.swap(as);
		System.out.println("the values in main program are a:"+as.a+" b:"+as.b);
	}

}
