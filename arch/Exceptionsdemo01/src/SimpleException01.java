
public class SimpleException01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a=20;
			int[] b={4,5,10,8,9,6,3};
			for(int i=0;i<7;i++){
				try{
				System.out.println(i+" "+a+"/"+b[i]+" = "+a/b[i]);
				}
				catch(ArithmeticException ae){
					System.out.println(ae.getMessage()+"error handled at "+i);
				}
			}			
		}		
		catch(ArrayIndexOutOfBoundsException abe){
			System.out.println(abe.getMessage());
		}
		finally{
			System.out.println("Finally all is well");
		}
			
	}

}
