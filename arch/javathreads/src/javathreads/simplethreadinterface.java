package javathreads;

public class simplethreadinterface implements Runnable{
	char ch;
	public simplethreadinterface(char ch){
		this.ch=ch;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simplethreadinterface obj=new simplethreadinterface('*');
		Thread t1=new Thread(new simplethreadinterface('*'));
		Thread t2=new Thread(new simplethreadinterface('+'));
		Thread t3=new Thread(new simplethreadinterface('='));
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run(){
		System.out.println("i am inside the thread");
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(500);
				for(int j=0;j<i;j++){
					System.out.print(ch);
				}
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
			System.out.println();
		}
	}
}
