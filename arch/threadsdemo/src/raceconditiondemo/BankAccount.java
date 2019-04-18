package raceconditiondemo;

public class BankAccount implements Runnable
{
	private int balance;
	public void setBalance(int balance){
		this.balance=balance;
	}
	public void run(){
		
		makeWithdrawl(75);
		if(balance<0){
			System.out.println("Money overdrawn balance is "+balance);
		}
	}
	private void makeWithdrawl(int amount){
		if(balance >=amount){
			System.out.println(Thread.currentThread().getName() +"is going to withdraw... amount of "+amount);
			balance=balance - amount;
			System.out.println(Thread.currentThread().getName() +" has withdrawn amount of "+amount +" balance is "+balance);
		}
		else{
			System.out.println("not enough balance for "+Thread.currentThread().getName()+ "balance is "+balance);
		}
	}
}
