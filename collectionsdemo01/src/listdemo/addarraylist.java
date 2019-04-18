package listdemo;
import java.util.*;
public class addarraylist {
	public static void display(ArrayList<Integer> al){
		System.out.println("contents of the array list :");
		for(Integer i:al){
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(23);
		al1.add(45);
		al1.add(65);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(13);
		al2.add(23);
		al2.add(33);	
		al2.add(45);		
		System.out.println("ading all elements from al2 to al1");
		al1.retainAll(al2);
		display(al1);
	}

}
