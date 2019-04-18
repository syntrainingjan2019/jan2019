package synchronizeddemo;

public class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t=t;
	}
	public void run(){
		this.t.printTable(10);
	}
}
