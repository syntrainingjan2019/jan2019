package dateandtimedemo;

import java.text.SimpleDateFormat;
import java.util.*;
public class datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Date Class -----");
		Date currentDate=new Date();
		System.out.println("current date : "+currentDate);
		System.out.println("current time : "+currentDate.getTime());
		String patterndate="yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(patterndate);
		String date=simpleDateFormat.format(currentDate);
		System.out.println("current date is :"+date);
		String patterntime="HH:mm:ss";
		SimpleDateFormat simpleTimeFormat=new SimpleDateFormat(patterntime);
		String time=simpleTimeFormat.format(currentDate);
		System.out.println("current date is :"+time);
		
	}

}
