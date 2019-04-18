package arraysdemo;

public class findelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={23,24,25,56,66,76,86,96};
		int srchitem=66;
		int start=0;
		int pos=0;
		int end=numbers.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			System.out.println("start :"+start+" end :"+end +" mid :"+mid + " mid value "+numbers[mid]);
			
			if(srchitem==numbers[mid]){
				pos=mid;
			}
			if(srchitem<numbers[mid]){
				end=mid-1;
			}
			else{
				start=mid+1;
			}
			
		}
		System.out.println("element found at :"+pos);
	}

}
