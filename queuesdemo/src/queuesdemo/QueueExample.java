package queuesdemo;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated  method stub
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<5;i++){
			q.add(i);
		}
		System.out.println("elemnts of queue : "+q);
		int removedel=q.remove();
		System.out.println("element removed is : "+removedel);
		System.out.println("elemnts of queue : "+q);
		int head=q.peek();
		System.out.println("the head element is : "+head);
		int size=q.size();
		System.out.println("size of the queue is :"+size);
	}

}
