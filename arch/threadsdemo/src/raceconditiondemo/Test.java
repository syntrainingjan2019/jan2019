package raceconditiondemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount();
		account.setBalance(100);
		Thread john=new Thread(account);
		Thread anita=new Thread(account);
		john.setName("John");
		anita.setName("anita");
		john.start();
		anita.start();
	}

}
