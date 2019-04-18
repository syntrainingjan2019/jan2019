package synchronizationdemo;

public class Table {

		public  void printTable(int n){
			synchronized(this){
			for(int i=1;i<=5;i++){
				System.out.println(n+"  * "+i+" = "+n*i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		}
	
}
