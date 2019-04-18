
public class customeexceptiondemo {
	static void validate(int num) throws Customexception,Exception{
		if (num <0){
			throw new Customexception(num +" is not a valid number");
		}
		else{
			System.out.println(num + " is a valid number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			validate(30);
			validate(-12);
		}
		catch(Exception m){
			System.out.println(m);
		}
	}

}
