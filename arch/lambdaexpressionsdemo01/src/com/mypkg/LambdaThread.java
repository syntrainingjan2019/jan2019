package com.mypkg;

public class LambdaThread {
	public static void main(String args[]){
		Runnable r1=new Runnable(){
			public void run(){
				System.out.println("Thread is running");
			}
		};
		Thread t1=new Thread (r1);
		t1.start();
		Runnable r2=()->{
			System.out.println("Thread with lambda expression is running");
		};
		Thread t2=new Thread(r2);
		t2.start();
	}
}
