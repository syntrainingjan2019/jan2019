package interthreadcomuunication;

public class Reentrant {
	public synchronized void m() {
		n();
		System.out.println("this is inside m() mthod");
	}
	public synchronized void n(){		
		System.out.println("this is inside n() method");
	}
}
