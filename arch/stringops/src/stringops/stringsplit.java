package stringops;
import java.io.*;
public class stringsplit {

	public static void concat1(String s1){
		s1=s1+"java";
	}
	public static void concat2(StringBuilder s2){
		s2.append("java");
	}
	public static void concat3(StringBuffer s3){
		s3.append("java");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s1="hello";
	concat1(s1);
	System.out.println("String s1 ="+s1);
	StringBuilder s2=new StringBuilder("hello");
	concat2(s2);
	System.out.println("String s2 ="+s2);
	StringBuffer s3=new StringBuffer("hello");
	concat3(s3);
	System.out.println("String s3 ="+s3);
	}

}
