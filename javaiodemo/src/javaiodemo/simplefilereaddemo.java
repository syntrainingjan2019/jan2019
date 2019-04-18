package javaiodemo;
import java.io.*;
public class simplefilereaddemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String filename="test.txt";
		FileInputStream fin=new FileInputStream(filename);
		int i=0;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
		}
		fin.close();
	}

}
