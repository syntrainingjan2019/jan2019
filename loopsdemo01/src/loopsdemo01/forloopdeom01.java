package loopsdemo01;

public class forloopdeom01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(i==0 || j==0 || i==j || i==7 || j==7 || j==(7-i)){
					System.out.print("*  ");
				}
				else{
					System.out.print("   ");
				}
				
				
			}
			System.out.println();			
		}
	}

}
