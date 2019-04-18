package javaiodemo;
import java.io.*;
public class simplefilewritedemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String filename="test.txt";
		FileOutputStream fout=new FileOutputStream(filename);
		String s="welcome to java";
		byte[] b=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("File has been created");
	}

}
