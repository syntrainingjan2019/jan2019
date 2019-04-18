package dateandtime;
import java.util.*;
import java.text.*;
public class simpledatedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat format=new SimpleDateFormat("E,yyyy-MM-dd HH:mm:ss zzzz");
		String strDate=format.format(d);
		System.out.println("formatted date is : "+strDate);
	}

}
