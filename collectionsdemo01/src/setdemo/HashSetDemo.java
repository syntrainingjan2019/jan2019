package setdemo;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("two");
		System.out.println(set);
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
