package mapdemo;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(3, "three");
		map.put(4, "three");
		map.put(1, "one");
		map.put(2, "two");		
		map.put(5, null);
		for(Map.Entry  m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
