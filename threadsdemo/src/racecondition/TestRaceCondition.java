package racecondition;

public class TestRaceCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount();
		account.setBalance(100);
		Thread john=new Thread(account);
		Thread peter=new Thread(account);
		john.setName("John");
		peter.setName("Peter");
		john.start();
		peter.start();
	}

}
