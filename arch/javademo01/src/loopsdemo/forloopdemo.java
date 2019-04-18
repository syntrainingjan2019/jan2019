package loopsdemo;

public class forloopdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days=31;
		int weeks=5;
		int day=1;
		int start=3;
		for(int i=1;i<=weeks;i++){
			for(int j=1;j<=7;j++){
				if((day<=days) &&(i==1 && j>=start) ){
				System.out.print(day+"\t");
				day++;
				}
				else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}

}
