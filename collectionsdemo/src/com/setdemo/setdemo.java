package com.setdemo;
import java.util.*;
public class setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(45);
		set.add(56);
		set.add(78);
		set.add(45);
		set.add(78);
		set.add(36);		
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}

}
