package takeinput;

import java.util.*;
import java.io.*;

public class testinputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll no :");
		int rollno = sc.nextInt();
		System.out.println("Enter the year of  registration :");
		int year = sc.nextInt();
		System.out.println("Enter the Name  :");
		String name= sc.next();
		System.out.println("Roll no :"+rollno+" year :"+year+" name :"+name);
	}

}
