package setdemopkg;
import java.util.*;

import models.Book;
public class HashSetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();
		set.add("abcd");
		set.add("bdde");
		set.add("bdbf");
		set.add("bcef");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
