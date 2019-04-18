package genericsdemo03;

public class TestGenerics {
	public static <T> void display(T[] arr){
		System.out.println("display the elements");
		for(T element:arr){
			System.out.print(element+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] nums={34,56,78,25,57};
		Double[] doublearr={2.5,4.6,6.7,8.3,4.6};
		Character[] chararr={'h','e','l','l','o'};
		display(nums);
		display(doublearr);
		display(chararr);
	}

}
