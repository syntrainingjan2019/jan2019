package threadinterrupt;

public class TestThreadInterrupt extends Thread{

	public void run(){
		try{
			Thread.sleep(1000);
			System.out.println("task is still running");
		}
		catch(Exception ex){
		System.out.println(ex.getMessage());;
		}
		System.out.println("thread is running post sleep");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestThreadInterrupt t1=new TestThreadInterrupt();
		t1.start();
		Thread.sleep(500);
		t1.interrupt();
	}

}
