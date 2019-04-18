package arraysdemo;

import java.util.Random;

public class arrdemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums1=new int[10];
			int[] nums2={2,5,3,8,23,45,72};
			for(int i=0;i<nums1.length;i++){
				Random rand=new Random();
				int randomnumber=rand.nextInt(1000);
				nums1[i]=randomnumber;
			}
			for(int a:nums1){
				System.out.print(a +"\t");
			}
			System.out.println();
			for(int a:nums2){
				System.out.print(a +"\t");
			}
	}

}
