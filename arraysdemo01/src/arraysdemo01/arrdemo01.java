package arraysdemo01;

public class arrdemo01 {
	public static void disparr(int[] nums){
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			nums[i]=(i+1)*3;
		}
		disparr(nums);
	}

}
