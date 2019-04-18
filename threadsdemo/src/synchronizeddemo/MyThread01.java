package synchronizeddemo;

public class MyThread01 extends Thread{
	Table t;
	MyThread01(Table t){
		this.t=t;
	}
	public void run(){
		this.t.printTable(5);
	}
}
