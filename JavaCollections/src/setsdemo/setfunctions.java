package setsdemo;
import java.util.*;
public class setfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> al=new TreeSet<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		System.out.println(al);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("size of the set is : "+al.size());
		System.out.println("first of the set is : "+al.first());
		System.out.println("last of the set is : "+al.last());
	}

}
