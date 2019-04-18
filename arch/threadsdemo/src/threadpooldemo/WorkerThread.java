package threadpooldemo;
import java.util.concurrent.*;
public class WorkerThread implements Runnable{
	private String message;
	public WorkerThread(String message){
		this.message=message;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Start message ="+message);
		processmessage();
		System.out.println(Thread.currentThread().getName()+" ends ");
	}
	public void processmessage(){
		try{
			Thread.sleep(2000);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
