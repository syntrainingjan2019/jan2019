package simplethread;

import java.util.concurrent.atomic.AtomicInteger;

public class ProcessingThread implements Runnable{
	private AtomicInteger count=new AtomicInteger();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<5;i++){
			processSomething(i);
			System.out.println("thread runing" +getCount());
			count.incrementAndGet();
		}
	}
	public int getCount(){
		return this.count.get();
	}
	public void processSomething(int i){
		try{
			Thread.sleep(i*1000);
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}
