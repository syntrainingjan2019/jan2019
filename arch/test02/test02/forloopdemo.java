package test02;

public class forloopdemo {
	static void varargsOverload(boolean b, String... list){
		   System.out.println("\nInside varargsOverload with varargs ...");
		   System.out.println("list.length: " + list.length);
		}	
	public static void main(String args[]) {
		for(int i=1;i<10;i++){
			for(int j=1;j<=(10-i);j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		varargsOverload(true, "one","two","three","four");	
	}
}
