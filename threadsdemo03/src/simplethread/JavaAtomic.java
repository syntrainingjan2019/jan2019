package simplethread;

public class JavaAtomic {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ProcessingThread pt=new ProcessingThread();
		Thread t1=new Thread(pt,"t1");
		Thread t2=new Thread(pt,"t2");
		Thread t3=new Thread(pt,"t3");
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		t3.start();
	}

}
