package queuesdemo;
import java.util.*;
public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque=new LinkedList<String>();
		deque.add("Element1 (Tail)");
		deque.addFirst("Element 2 (Head)");
		deque.addLast("Element 3 (Tail)");
		deque.push("Element 4 (Head)");
		deque.offer("Element 5 (Tail)");
		deque.offerFirst("Element 6 (Head)");
		deque.offerLast("Element 7 (Tail)");
		
		System.out.println("elements in queue : "+deque);
//		Iterator itr=deque.iterator();
//		while(itr.hasNext()){
//			System.out.print(itr.next()+"\t");
//		}
//		Iterator reverse=deque.descendingIterator();
//		System.out.println("reverse Iterator");
//		while(reverse.hasNext()){
//			System.out.print(reverse.next()+"\t");
//		}
//		System.out.println();
//		System.out.println("peek "+deque.peek());
//		System.out.println("After peek "+deque);
		System.out.println("Pop "+deque.pop());
		System.out.println("After pop : "+deque);
		System.out.println("Contains element 3 :"+deque.contains("Element 3 (Tail)"));
		deque.removeFirst();
		System.out.println("After remove first : "+deque);
		deque.removeLast();
		System.out.println("After remove last  : "+deque);
		
	}

}
