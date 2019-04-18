package setdemopkg;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new HashSet();
		display(set1);
		Set<String> set2=new LinkedHashSet();
		display(set2);
		Set<String> set3=new TreeSet();
		display(set3);
	}
	public static void display(Set set){		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("one");		
		Iterator<String> i=set.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		System.out.println();
	}
}
