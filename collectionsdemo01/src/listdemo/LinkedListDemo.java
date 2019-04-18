package listdemo;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();
		al.add("one");
		al.add("two");		
		al.addFirst("first");		
		al.addLast("last");		
		ListIterator<String> itr=al.listIterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}
		System.out.println("\nreverse----------------");
		while(itr.hasPrevious()){
			System.out.print(itr.previous()+"\t");
		}
	}

}
