package arraysdemo;

import java.util.Arrays;
import java.util.Random;

public class arrdemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=new int[10];
		for(int i=0;i<10;i++){
			Random rand=new Random();
			int num=rand.nextInt(100);
			nums[i]=num;
		}
		int temp;
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]<nums[j]){
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println("printing isn ascending order :");
		for(int a :nums){
			System.out.print(a+"\t");
		}
	}

}
