package racecondition;

public class BankAccount implements Runnable{
	private int balance;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		makewithdrawl(75);
		if(balance<0){
			System.out.println("money overdrawn balance is "+balance);
		}
	}
	public synchronized void makewithdrawl(int amount){
		if(balance>=amount){
			System.out.println(Thread.currentThread().getName()+" is going to withdraw an amount of "+amount);
			balance=balance-amount;
			System.out.println(Thread.currentThread().getName()+" has withdrawn an amount of "+amount+ "balance is :"+balance);
		}
		else{
			System.out.println("not enough balnce for "+Thread.currentThread().getName() +"because the balance is "+balance);
		}
	}
}
