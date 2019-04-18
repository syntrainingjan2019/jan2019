package dateandtime;
import java.time.*;
import java.time.ZoneId;
public class timnezonedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZoneId id =ZoneId.of("Europe/Paris");
		System.out.println(id);
		ZoneId currentZone=ZoneId.systemDefault();
		System.out.println(currentZone);
	}

}
