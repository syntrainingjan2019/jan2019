package com.setsdemo;
import java.util.*;
public class setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={34,22,23,10,60};
		Set<Integer> set=new HashSet<Integer>();
		try{
			for(int i=0;i<nums.length;i++){
				set.add(nums[i]);
			}
		
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
