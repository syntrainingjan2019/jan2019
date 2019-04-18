package enumsdemo03;
enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class EnumTest {
	
	Day day;
	public EnumTest(Day day){
		this.day=day;
	}
	public void dayCount(){
		switch(day){
		case MONDAY:
			System.out.println("First day of week");
			break;
		case TUESDAY:
			System.out.println("Second day of week");
			break;
		case SATURDAY:
			System.out.println("Weekend starts ");
			break;
		case SUNDAY:
			System.out.println("Weekend is over");
			break;
			default :
				System.out.println("mid week days");
				break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SUNDAY";
		EnumTest t1=new EnumTest(Day.valueOf(str));
		t1.dayCount();
	}

}
