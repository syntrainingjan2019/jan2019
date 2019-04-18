package setsdemo;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String>  al=new LinkedHashSet<>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
