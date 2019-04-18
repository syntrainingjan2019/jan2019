package simplethread;
import java.util.concurrent.atomic.AtomicInteger;
public class ProcessingThread implements Runnable{
	
	private AtomicInteger count=new AtomicInteger();
	
	public void run(){
		for(int i=1;i<5;i++){
			processSomething(i);
			System.out.println(Thread.currentThread().getName()+ " Thread running "+getCount());
			count.incrementAndGet();
		}
	}
	public int getCount(){
		return this.count.get();
	}
public void processSomething(int i){
	try{
		Thread.sleep(i*500);
	}
	catch(Exception ex){
		System.out.println(ex.getMessage());
	}
}
}
