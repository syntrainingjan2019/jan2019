package interthreadcomuunication;

public class RenetrantExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Reentrant re=new Reentrant();
		Thread t1=new Thread(){
			public void run(){
				re.m();
			}
		};
		t1.start();
	}

}
