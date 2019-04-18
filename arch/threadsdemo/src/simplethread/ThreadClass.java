package simplethread;

public class ThreadClass extends Thread{
	int start;
	
	public ThreadClass(int start) {
		super();
		this.start = start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass t1=new ThreadClass(100);
		ThreadClass t2=new ThreadClass(200);
		ThreadClass t3=new ThreadClass(300);
		ThreadClass t4=new ThreadClass(400);
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().isDaemon()){
			System.out.println(Thread.currentThread().getName()+ " is a daemon thread working ");
		}
		else{
			System.out.println(Thread.currentThread().getName()+ "this is a normal thread");
		}
		for(int i=start;i<start+5;i++){
			try{
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+" value is :"+i);
			}
			catch(Exception ex){
				
			}
		}
	}
}
