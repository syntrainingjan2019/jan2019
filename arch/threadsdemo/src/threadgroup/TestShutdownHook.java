package threadgroup;

public class TestShutdownHook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		System.out.println("Now main program is sleeping press ctrl + c to exit");
		try{
			Thread.sleep(3000);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
