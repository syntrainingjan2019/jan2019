package enumsdemo;

public class switchcasewithenums {
enum Day{ sunday,monday,tuesday,wednesday,thursday,friday,saturday}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day=Day.monday;
		switch(day){
		case sunday:
			System.out.println("Sunday");
			break;
		case monday:
			System.out.println("Monday");
			break;
		default:
			System.out.println("other day");
		}
	}

}
