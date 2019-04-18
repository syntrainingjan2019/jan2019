package threadgroup;

public class TestDeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String resource1="one";
		final String resource2="two";
		Thread t1=new Thread(){
			public void run(){
				synchronized (resource1){
					System.out.println("resource1 is locked by Thread 1");
				}
				try{Thread.sleep(1000);}catch(Exception Ex){}
				synchronized (resource2){
					System.out.println("resource2 is locked by Thread 1");
				}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				synchronized (resource2){
					System.out.println("resource2 is locked by Thread 2");
				}
				try{Thread.sleep(1000);}catch(Exception Ex){}
				synchronized (resource1){
					System.out.println("resource1 is locked by Thread 2");
				}
			}
		};
		t1.start();
		t2.start();
	}

}
