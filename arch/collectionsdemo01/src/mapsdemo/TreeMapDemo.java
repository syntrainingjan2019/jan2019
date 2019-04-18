package mapsdemo;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> obj=new TreeMap<Integer,String>();
		obj.put(1, "aaa");
		obj.put(2, "bbb");
		obj.put(3, "abb");
		obj.put(4, "abc");
		obj.put(null,null);
		for(Map.Entry m:obj.entrySet()){
			System.out.println(m.getKey()+ " : "+m.getValue());
		}
	}

}
