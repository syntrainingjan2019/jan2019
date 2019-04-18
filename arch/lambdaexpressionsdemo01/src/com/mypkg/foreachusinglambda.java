package com.mypkg;
import java.util.*;
public class foreachusinglambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.forEach(
			(n)->System.out.println(n)	
				);
	}

}
