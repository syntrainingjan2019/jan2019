package setdemopkg;

import java.util.ArrayList;
import java.util.Iterator;

public class Listdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("one");
		al1.add("two");
		al1.add("three");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("four");
		al2.add("five");
		al2.add("three");
		al1.retainAll(al2);
		Iterator itr=al1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
