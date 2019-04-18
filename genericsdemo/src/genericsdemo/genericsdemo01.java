package genericsdemo;

public class genericsdemo01 {

	public static <E> void printArray(E[] inputArray){
		for(E element : inputArray){
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray={2,4,5,6,3,7,8};
		Double[] doubleArray={2.4,5.6,4.3,6.5,7.6};
		Character[] charArray={'h','e','l','l','o'};
		System.out.println("printing the integer array :");
		printArray(intArray);
		System.out.println("printing the double array :");
		printArray(doubleArray);
		System.out.println("printing the character array :");
		printArray(charArray);
	}

}
