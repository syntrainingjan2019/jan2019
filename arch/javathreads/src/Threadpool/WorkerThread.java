package Threadpool;
import java.util.concurrent.*;
public class WorkerThread implements Runnable{
	public String message;
	public WorkerThread(String s){
		this.message=s;
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+" message starts:"+message);
		processmessage();
		System.out.println(Thread.currentThread().getName()+" message ends:"+message);
	}
	private void processmessage(){
		try{
			Thread.sleep(2000);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
