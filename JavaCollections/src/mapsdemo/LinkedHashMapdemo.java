package mapsdemo;
import java.util.*;
public class LinkedHashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashMap<Integer,String> map=new  LinkedHashMap<Integer,String>();
		map.put(100, "one");
		map.put(200, "two");
		map.put(300, "three");	
		map.put(null, "four");
		map.put(null, "four");
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
