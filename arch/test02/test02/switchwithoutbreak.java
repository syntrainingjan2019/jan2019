package test02;

public class switchwithoutbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=11;
		switch(i){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("i is less than 5");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("i is less than 10");
			break;
			default:
				System.out.println("i is greater than 10");
		
		}
	}

}
