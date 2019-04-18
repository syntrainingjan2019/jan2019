package dateandtime;
import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
public class weekfuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1=LocalDate.now();
		System.out.println(date1);
		LocalDate nextTuesday=date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("next tuesday is on :"+nextTuesday);
		LocalDate firstInYear=LocalDate.of(date1.getYear(), date1.getMonth(), 1);
		LocalDate secondSaturday=firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("second saturday on :"+secondSaturday);
	}

}
