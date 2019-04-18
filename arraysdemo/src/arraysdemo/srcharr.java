package arraysdemo;

public class srcharr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={23,45,67,24,89,26};
		int srchitem=89;
		boolean found=false;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==srchitem){
				System.out.println("the value is found at : "+i);
				found=true;
			}
		}
		if(found==false){
			System.out.println("element not found");
		}
	}

}
