package com.mapdemo;

import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		hm.put(3, null);
		hm.put(6, null);
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}

}
