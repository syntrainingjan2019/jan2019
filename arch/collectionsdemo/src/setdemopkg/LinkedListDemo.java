package setdemopkg;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		System.out.println(al.indexOf("three"));
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
