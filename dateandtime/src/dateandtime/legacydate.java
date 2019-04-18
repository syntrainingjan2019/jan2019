package dateandtime;
import java.util.*;
import java.time.*;
public class legacydate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentDate=new Date();
		System.out.println("current date :"+currentDate);
		Instant now=currentDate.toInstant();
		ZoneId currentZone=ZoneId.systemDefault();
		LocalDateTime localDateTime=LocalDateTime.ofInstant(now, currentZone);
		System.out.println("Local Date :"+localDateTime);
		ZonedDateTime zonedDateTime=ZonedDateTime.ofInstant(now, currentZone);
		System.out.println("Zoned Date :"+zonedDateTime);
	}

}
