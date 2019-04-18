package filesdemo;
import java.io.*;
public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("testoutput.txt");
		String s="welcome to java";
		byte[] b=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("success");
	}

}
