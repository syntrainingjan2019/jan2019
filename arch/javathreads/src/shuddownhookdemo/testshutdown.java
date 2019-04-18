package shuddownhookdemo;

public class testshutdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		System.out.println("Now sleeping press ctrl + c to exit");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
