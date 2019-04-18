package dateandtime;
import java.time.*;

import javafx.scene.shape.CullFace;
public class Java8testdate01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime currentTime=LocalDateTime.now();
		System.out.println("Current date and time is : "+currentTime);
		Month month=currentTime.getMonth();
		int day=currentTime.getDayOfMonth();
		int seconds=currentTime.getSecond();
		System.out.println("Month :"+month+" day:"+day+" seconds:"+seconds);
		LocalDateTime date2=currentTime.withDayOfMonth(10).withYear(2012);
		System.out.println("prev date :"+date2);
	}

}
