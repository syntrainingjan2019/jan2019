package buferredoutput;
import java.io.*;
public class Bufferredoutputdemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filename="outputbuffer.txt";
		FileOutputStream fout=new FileOutputStream(filename);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="welcome to java";
		byte[] b=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		System.out.println("success");
	}

}
