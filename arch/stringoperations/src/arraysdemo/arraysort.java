package arraysdemo;

public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={34,65,24,37,48,94,56,26,89,35};
		System.out.println("before sorting");
		for(int a:nums){
			System.out.print(a+"\t");
		}
		int n=nums.length;
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=1;j<(n-i);j++){
				if(nums[j-1]<nums[j]){
					temp=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println("\nafter sorting");
		for(int a:nums){
			System.out.print(a+"\t");
		}
	}

}
