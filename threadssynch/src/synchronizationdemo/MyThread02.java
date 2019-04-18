package synchronizationdemo;

public class MyThread02 extends Thread{
	Table t;
	MyThread02(Table t){
		this.t=t;
	}
	public void run(){
		this.t.printTable(10);
	}
}
