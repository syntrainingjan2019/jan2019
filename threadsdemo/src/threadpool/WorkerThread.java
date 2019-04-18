package threadpool;

public class WorkerThread implements Runnable{
	private String message;
	public WorkerThread(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" start message ="+message);
		processmessage();
		System.out.println(Thread.currentThread().getName()+" ends");
	}
	public void processmessage(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
