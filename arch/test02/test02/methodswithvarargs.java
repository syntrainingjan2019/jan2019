package test02;

public class methodswithvarargs {

	public static void sumofnumbers(int... list){
		int sum=0;
		for(int a:list){
			System.out.println("sum ="+sum+" will be incremented by a= "+a);
			sum=sum+a;			
		}
		System.out.println("the sum of numbers is "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumofnumbers(2,3,4,5,6);
		
	}

}
