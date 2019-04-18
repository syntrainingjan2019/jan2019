package arraysdemo;

import java.util.Random;

public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums=new int[4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				Random rand=new Random();
				int randomnumber=rand.nextInt(1000);
				nums[i][j]=randomnumber;
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){				
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
