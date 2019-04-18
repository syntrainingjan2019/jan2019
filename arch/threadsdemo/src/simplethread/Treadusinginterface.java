package simplethread;

public class Treadusinginterface implements Runnable{
	int start;
	public Treadusinginterface(int start){
		this.start=start;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treadusinginterface m1=new Treadusinginterface(1);		
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m1);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=start;i<30;i++){
			try{
				if(this.start >1 && this.start <10){
					Thread.sleep(500);
				}
				else
				if (this.start >10 && this.start <20){
					Thread.sleep(300);
				}
				else
					if (this.start >20 && this.start <30){
						Thread.sleep(200);
					}				
				System.out.println(Thread.currentThread().getName()+" value is :"+i);
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		}
	}

}
