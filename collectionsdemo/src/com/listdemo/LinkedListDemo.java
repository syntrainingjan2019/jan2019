package com.listdemo;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al1=new LinkedList<String>();
		al1.add("Ravi");
		al1.add("Vijay");
		al1.add("Ravi");
		al1.add("Ajay");	
		al1.add(3, "three");
		ListIterator<String> itr=al1.listIterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		while(itr.hasPrevious()){
			System.out.print(itr.previous()+" ");
		}
	}

}
