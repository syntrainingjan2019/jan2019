package dateandtime;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class futuredates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time1=LocalTime.now();
		Duration twohrs=Duration.ofHours(3);
		LocalTime time2=time1.plus(twohrs);
		System.out.println(time2);
		
		
		/*
		LocalDate date1=LocalDate.now();
		LocalDate dt1=LocalDate.parse("2018-08-31");
		LocalDate dt2=LocalDate.parse("1985-06-14");
		System.out.println(date1);
		LocalDate date2=date1.plus(1,ChronoUnit.MONTHS);
		System.out.println("Next Month :"+date2);
		Period period =Period.between(dt2,dt1);
		System.out.println("Period :"+period);
		*/
	}

}
