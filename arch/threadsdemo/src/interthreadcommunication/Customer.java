package interthreadcommunication;

public class Customer {
	int amount=10000;
	public synchronized void withdraw(int amount){
		System.out.println("going to withdraw an amount of :"+amount);
		if(this.amount<amount){
			System.out.println("less balance please deposit more money: waiting for deposit");
			try{
				wait();
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
			this.amount=this.amount-amount;
			System.out.println("wiithrawl completed current balance is "+this.amount);
		}
	}
	synchronized void deposit(int amount){
		System.out.println("going to deposit");
		this.amount=this.amount+amount;
		System.out.println("deposit completed current balance is "+this.amount);
		notify();
	}
}
