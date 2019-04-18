package listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		al.add("two");
		System.out.println(al);
//		Iterator<String> itr=al.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		for(String a:al){
			System.out.println(a);
		}
	}

}
