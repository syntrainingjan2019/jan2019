package simpleexception;

public class exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			try{
				System.out.println("going to divide");
				int b=12/0;				
			}
			catch(ArithmeticException ae){
				System.out.println(ae.getMessage());
			}
			try{
				int a[]=new int[5];
				a[5]=4;				
			}
			catch(ArrayIndexOutOfBoundsException aib)
			{
				System.out.println(aib.getMessage()+"got array index error");
			}
			System.out.println("program continues");
		}
		catch(Exception ex)
		{
			System.out.println("normal flow..");
		}
		finally{
			System.out.println("progem executed without errors");
		}
		
	}

}
