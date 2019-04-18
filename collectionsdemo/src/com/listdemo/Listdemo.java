package com.listdemo;
import java.util.*;
public class Listdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Ravi");
		al1.add("Vijay");
		al1.add("Ajay");		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hari");		
		al1.retainAll(al2);
		Iterator<String> itr=al1.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}

}
