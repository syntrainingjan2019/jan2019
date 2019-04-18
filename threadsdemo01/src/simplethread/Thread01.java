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
					System.out.println(i);
				}
				catch(Exception ex){
					System.out.println(ex.getMessage());
				}
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread01 t1=new Thread01(100);
		Thread01 t2=new Thread01(200);
		Thread01 t3=new Thread01(300);
		Thread01 t4=new Thread01(400);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
