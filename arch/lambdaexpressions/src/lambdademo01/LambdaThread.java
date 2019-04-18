package lambdademo01;

public class LambdaThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable t1=new Runnable(){
			public void run(){
				System.out.println("Thread 1 is running");
			}
		};
		Thread th1=new Thread(t1);
		th1.start();
		Runnable t2=()->{
			System.out.println("Thread 2 is running");
		};
		Thread th2=new Thread(t2);
		th2.start();
	}

}
