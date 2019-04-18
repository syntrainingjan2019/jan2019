package com.mapdemo;
import java.util.*;
public class LinkedHashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(3, "threenum");
		hm.put(null, null);
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}

}
