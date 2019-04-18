package setsdemo;
import java.util.*;

public class Setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={34,35,67,83,59,64,34,35,67};
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			set.add(nums[i]);
		}
		System.out.println(set);
		TreeSet sortedset=new TreeSet<Integer>(set);
		System.out.println("the sorted set is :");
		System.out.println(sortedset);
		
	}

}
