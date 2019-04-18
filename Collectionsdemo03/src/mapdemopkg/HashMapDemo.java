package mapdemopkg;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6,null);	
		map.put(7,null);	
		display(map);
	}
	public static void display (Map<Integer,String> map){
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
}
