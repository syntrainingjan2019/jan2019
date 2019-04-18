package test02;

public class ifelsedemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=11;
		String season;
		if(month ==12 || month==1 || month==2)
			season="winter";
		else if (month==3 | month==4 || month==5)
			season="Spring";
		else if(month==6 || month==7 || month==8)
			season="summer";
		else if(month==9 || month==10 || month==11)
			season="Autumn";
		else
			season="Bogus Month";
		System.out.println("The season for the month is "+season);
	}

}
