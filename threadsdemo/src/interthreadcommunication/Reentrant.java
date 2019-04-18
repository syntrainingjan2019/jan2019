package interthreadcommunication;

public class Reentrant {
	public synchronized void m(){
		n();
		System.out.println("this is inside m() method");
	}
	public synchronized void n(){
		System.out.println("this is inside n() method");
	}
}
