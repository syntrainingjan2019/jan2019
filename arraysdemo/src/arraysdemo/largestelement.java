package arraysdemo;

public class largestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={23,45,67,24,89,26};
		int largest=nums[0];
		int smallest=nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i]<smallest){
				smallest=nums[i];
			}
		}
		System.out.println("the largest element is : "+smallest);
	}

}
