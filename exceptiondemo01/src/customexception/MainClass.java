package customexception;

public class MainClass {

	static void validate(int age) throws InvalidAgeException{
		if(age<18){
			throw new InvalidAgeException("not valid age");
		}
		else{
			System.out.println("you are eligible to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			validate(13);
		}
		catch(Exception ex){
			System.out.println("Exception occurred :"+ex.getMessage());
		}
		System.out.println("rest code continues");
	}

}
