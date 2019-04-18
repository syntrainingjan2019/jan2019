package simplethread;

public class Threadusinginterface implements Runnable{
	int start;
	public Threadusinginterface(int start){
		this.start=start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadusinginterface th1=new Threadusinginterface(1);
		Thread t1=new Thread(th1);
		t1.start();
		th1=new Threadusinginterface(100);
		Thread t2=new Thread(th1);
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=start;i<start+30;i++){
			try{
				Thread.sleep(500);
				System.out.println(i);
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		}
	}

}
