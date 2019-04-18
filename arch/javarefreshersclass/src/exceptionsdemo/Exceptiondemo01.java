package exceptionsdemo;

public class Exceptiondemo01 {
	
	static void validate(int num)throws MyCustomException,Exception{
		if(num <0){
			throw new MyCustomException("not a valid number");
		}
		else{
			System.out.println("valid number");
		}
	}
	public static void main(String args[]){
		try{
			validate(30);
			validate(-30);
		}
		catch(Exception m){
			System.out.println(m);
		}
	}
}
