package simplethread;

public class thread01 extends Thread{
	int start;
	thread01(int start){
		this.start=start;
	}
	public void run(){
		for(int i=start;i<start+10;i++){
			try{
				Thread.sleep(500);
				System.out.println(i);
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread01 t1=new thread01(100);
		thread01 t2=new thread01(200);
		thread01 t3=new thread01(300);
		thread01 t4=new thread01(400);
		t1.start();
		try{
			t1.join();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		t2.start();
	}

}
