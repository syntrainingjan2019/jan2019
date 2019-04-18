package javaiodemo;
import java.io.*;
public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filename="testbuff.txt";
		FileOutputStream fout=new FileOutputStream(filename);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Welcome to java bufferred output demo";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("file has been created");
	}

}
