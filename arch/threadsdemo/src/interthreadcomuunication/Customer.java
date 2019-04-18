package interthreadcomuunication;

public class Customer {
	int amount=10000;
	public synchronized void withdraw(int amount){
		System.out.println("going to withdraw an amount of : "+amount);
		if(this.amount<amount){
			System.out.println("less balance please deposit more money");
			try{
				wait();
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
			this.amount=this.amount-amount;
			System.out.println("withdrawl completed current balance is :"+this.amount);
		}
	}
	public synchronized void deposit(int amount){		
		System.out.println("going to deposit");
		this.amount=this.amount+amount;
		System.out.println("deposit completed current balance is :"+this.amount);
		notify();
	}
}
