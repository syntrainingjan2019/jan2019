package com.mypkg;
import java.util.*;
public class foreachlambdademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.forEach(
				(n)->System.out.println(n)
				);
		
	}

}
