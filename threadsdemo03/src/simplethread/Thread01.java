package simplethread;

public class Thread01 extends Thread{
	int start;
	Thread01(int start){
		this.start=start;
	}
	public void run(){
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread01 t1=new Thread01(10);
		t1.setName("First");
		Thread01 t2=new Thread01(20);
		t2.setName("Second");
		Thread01 t3=new Thread01(30);
		t3.setName("Third");
		Thread01 t4=new Thread01(40);
		t4.setName("Fourth");
		t1.start();
		try{
			t1.join();
		}
		catch(Exception ex){}
		t2.start();
		try{
			t2.join();
		}
		catch(Exception ex){}
		t3.start();
		try{
			t3.join();
		}
		catch(Exception ex){}
		t4.start();
	}

}
