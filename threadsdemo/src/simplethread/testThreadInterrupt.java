package simplethread;

public class testThreadInterrupt extends Thread{
	public void run(){
		try{
			Thread.sleep(1000);
			System.out.println("task is still running");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("thread is runing post sleep");
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		testThreadInterrupt t1=new testThreadInterrupt();
		t1.start();
		Thread.sleep(500);
		t1.interrupt();
	}

}
