package mapsdemo;

import java.util.*;

public class HashMapOperations {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	public void add(int key,String value){
		hm.put(key, value);
	}
	public void delete(int key){
		hm.remove(key);
	}
	public String get(int key){
		String  value=hm.get(key);
		return value;
	}
	public void displayall(){
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+ " : "+m.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapOperations obj=new HashMapOperations();
		obj.add(1, "aaa");
		obj.add(2, "bbb");
		obj.add(3, "abb");
		obj.add(4, "abc");
		
		//obj.displayall();
		System.out.println("the value of key 4 is "+obj.get(4));
		
	}

}
