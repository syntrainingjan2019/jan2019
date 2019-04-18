package threadcommunication;

public class Customer {
	int amount=10000;
	public synchronized void withdraw(int amount){
		System.out.println("going to withdraw an amount of "+amount);
		if(this.amount<amount){
			System.out.println("less balance please deposit money : waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.amount=this.amount-amount;
			System.out.println("withdrawl completed and current balance is "+this.amount);
		}
	}
	public synchronized void deposit(int amount){
		System.out.println("going to deposit");
		this.amount=this.amount+amount;
		System.out.println("desposit completed updated balance is :"+this.amount);
		notify();
	}
}
