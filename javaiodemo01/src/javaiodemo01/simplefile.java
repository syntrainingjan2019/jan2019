package javaiodemo01;
import java.io.*;
public class simplefile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String filename="testfile.txt";
		String s="welcome to java files";
		byte[] b=s.getBytes();
		FileOutputStream fout=new FileOutputStream(filename);
		fout.write(b);
		fout.close();
		System.out.println("file has been created");
	}

}
