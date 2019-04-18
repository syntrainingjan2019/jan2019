package datedemo;
import java.util.*;
import java.text.SimpleDateFormat;
public class dateformattest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("E yyyy/MM/dd hh:mm:ss z");
		String strDate=formatter.format(date);
		System.out.println("Current date is "+strDate);
	}

}
