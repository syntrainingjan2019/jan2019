package com.listdemo;
import java.util.*;
public class addarraylist {
	public static void display(ArrayList<String> al){
		System.out.println();
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		String[] stra1={"one","two","three","four","five"};
		String[] stra2={"five","six","seven","eight","nine","ten"};
		ArrayList<String> a1=new ArrayList<String>(Arrays.asList(stra1));
		ArrayList<String> a2=new ArrayList<String>(Arrays.asList(stra2));
		
		a1.retainAll(a2);
		display(a1);
	}

}
