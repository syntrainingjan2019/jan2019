package conditionsjava;

public class Nestedconditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=21;
		if(number >10){
			System.out.println("number is greater than 10");
			if(number >20){
				System.out.println("number is greater than 20");
			}
			
		}
		else{
			System.out.println("invalid number");
		}
	}

}
