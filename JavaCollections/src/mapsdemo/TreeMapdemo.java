package mapsdemo;

import java.util.*;


public class TreeMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new  TreeMap<Integer,String>();
			map.put(100, "one");
			map.put(200, "two");
			map.put(300, "three");	
			
			for(Map.Entry m:map.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}
	}

}
