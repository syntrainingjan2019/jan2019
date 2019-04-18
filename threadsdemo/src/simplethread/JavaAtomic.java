package simplethread;

public class JavaAtomic {
	public static void main(String args[])throws Exception{
		ProcessingThread pt=new ProcessingThread();
		Thread t1=new Thread(pt,"t1");
		t1.start();
		Thread t2=new Thread(pt,"t2");
		t2.start();
		Thread t3=new Thread(pt,"t3");
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("processing count ="+pt.getCount());
	}
}
