package javathreads;

public class simplethread extends Thread {
	char ch;

	public simplethread(char ch) {
		this.ch = ch;
	}

	public void run() {
		System.out.println("i am inside the thread"+Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				for (int j = 0; j < i; j++) {
					System.out.print(ch);
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simplethread t1 = new simplethread('*');
		t1.setName("thread1");
		simplethread t2 = new simplethread('+');
		t1.setName("thread2");
		simplethread t3 = new simplethread('=');
		t1.setName("thread3");
		t1.start();
		try {
			t1.join();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		t2.start();
		try {
			t2.join();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		t3.start();
		try {
			t3.join();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
