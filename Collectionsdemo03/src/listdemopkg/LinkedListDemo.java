package listdemopkg;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new LinkedList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		al.add(4,"one");	
		display(al);
		System.out.println(al.indexOf("five"));
	}
	public static void display(List al){
		Iterator<String> i=al.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		System.out.println();
	}

}
