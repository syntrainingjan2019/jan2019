package com.setsdemo;
import java.util.*;
public class treesetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new LinkedHashSet<String>();
		set.add("one");
		set.add("abs");
		set.add("dbf");
		set.add("erss");
		set.add("avfr");
		set.add("afc");
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
