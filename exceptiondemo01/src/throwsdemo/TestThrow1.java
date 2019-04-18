package throwsdemo;

public class TestThrow1 {
	static void validate(int age){
		if(age<18){
			throw new ArithmeticException("not valid");	
		}
		else{
			System.out.println("welcome to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		validate(13);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("rest of code...");
	}

}
