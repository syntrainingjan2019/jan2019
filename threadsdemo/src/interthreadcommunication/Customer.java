package interthreadcommunication;

public class Customer {
	int amount=10000;
	public synchronized void withdraw(int amount){
		System.out.println("going to withdraw an amount of : "+amount);
		if(this.amount<amount){
			System.out.println("less balance please deposit more money : Waiting for deposit");
			try{
				wait();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			this.amount=this.amount-amount;
			System.out.println("Withdrawl completed and current balance is "+this.amount);
		}
	}
	public synchronized void deposit(int amount){
		System.out.println("going to deposit");
		this.amount=this.amount+amount;
		System.out.println("deposit completed current balance is : "+this.amount);
		notify();
	}
}
