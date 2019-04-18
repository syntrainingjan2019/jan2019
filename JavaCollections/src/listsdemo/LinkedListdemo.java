package listsdemo;
import java.util.*;
public class LinkedListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al1=new LinkedList<String>();
		al1.add("one");
		al1.add("two");
		al1.add("three");
		al1.add("four");
		
		Iterator<String> itr=al1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
