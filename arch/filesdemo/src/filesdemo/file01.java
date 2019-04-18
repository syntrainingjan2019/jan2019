package filesdemo;
import java.util.Scanner;
public class file01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Enter your name :");
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			System.out.println("your name is :"+name);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
