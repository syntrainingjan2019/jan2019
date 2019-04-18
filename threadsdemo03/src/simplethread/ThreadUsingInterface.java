package simplethread;

public class ThreadUsingInterface implements Runnable{
	int start;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadUsingInterface th1=new ThreadUsingInterface(1);
		Thread t1=new Thread(th1);
		t1.start();
		th1=new ThreadUsingInterface(100);
		Thread t2=new Thread(th1);
		t2.start();
	}
	public ThreadUsingInterface(int start){
		this.start=start;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=start;i<start+10;i++){
			try{
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+" - "+i);
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		}
	}

}
