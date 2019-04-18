package arraysdemo01;

public class largestelemet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={34,56,73,86,48,38,27};
		int smallest=nums[0];
		int largest=nums[0];
		for(int i=0;i<nums.length;i++){
			if(nums[i] >largest){
				largest=nums[i];
			}
			if(nums[i] <smallest){
				smallest=nums[i];
			}
		}
		System.out.println("smallest element is : "+smallest);
		System.out.println("largest element is : "+largest);
	}

}
