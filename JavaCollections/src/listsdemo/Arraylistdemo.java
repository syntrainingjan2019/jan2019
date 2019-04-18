package listsdemo;
import java.util.*;
public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1=new ArrayList<>();
		al1.add("one");
		al1.add("two");
		al1.add("three");
		al1.add("four");
		
		ListIterator<String> itr=al1.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
