package synchronizationdemo;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj=new Table();
		MyThread01 t1=new MyThread01(obj);
		MyThread02 t2=new MyThread02(obj);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}
