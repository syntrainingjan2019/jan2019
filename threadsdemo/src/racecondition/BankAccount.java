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
		makeWithdrawl(75);
		if(balance <0){
			System.out.println("money overdrawn balance is :"+balance);
		}
	}
	private synchronized void makeWithdrawl(int amount){
		if(balance>=amount){
			System.out.println(Thread.currentThread().getName()+" is going to withdraw an amount of "+amount);
			balance=balance-amount;
			System.out.println(Thread.currentThread().getName()+" has withdrawn an amount of "+amount+" and the balance is "+balance);
		
		}
		else{
			System.out.println("not enough balance for "+Thread.currentThread().getName()+" because the balance is "+balance);
		}
	}
}
