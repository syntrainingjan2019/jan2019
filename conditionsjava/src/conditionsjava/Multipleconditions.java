package conditionsjava;

public class Multipleconditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=95;
		if(marks>=40 && marks <=50){
			System.out.println("you have passed with C grade");
		}
		else
			if(marks>50 && marks <=70){
				System.out.println("you have passed with B grade");
			}
			else
				if(marks>70 && marks <=100){
					System.out.println("you have passed with A grade");
				}
		else{
			System.out.println("you have failed");
		}
	}

}
