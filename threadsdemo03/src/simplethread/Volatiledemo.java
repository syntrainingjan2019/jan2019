package simplethread;
import java.util.concurrent.TimeUnit;
public class Volatiledemo {
	public static volatile boolean stop;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new Thread(new Runnable(){
			public void run(){
				while(!stop){
					System.out.println("in the while loop");
				}
				System.out.println("program stopped");
			}
		}).start();
		TimeUnit.SECONDS.sleep(1);
		stop=true;
	}

}
