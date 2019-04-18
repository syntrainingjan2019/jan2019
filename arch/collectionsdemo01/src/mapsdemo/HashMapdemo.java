package mapsdemo;
import java.util.*;
public class HashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		hm.put(null, null);
		System.out.println(hm);
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}

}
