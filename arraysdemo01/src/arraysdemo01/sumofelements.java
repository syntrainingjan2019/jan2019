package arraysdemo01;

import javax.xml.ws.Dispatch;

public class sumofelements {
	public static void disparr(int nums[][]){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][]=new int[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				nums[i][j]=(i*10)+(j+1);
			}
		}
		for(int i=0;i<10;i++){
			int sum=0;
			for(int j=0;j<10;j++){
				sum=sum+nums[i][j];
			}
			System.out.println("sum is : "+sum);
		}
	}

}
