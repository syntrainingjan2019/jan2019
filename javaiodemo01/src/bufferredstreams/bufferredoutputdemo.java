package bufferredstreams;
import java.io.*;
public class bufferredoutputdemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String filename="testbuf.txt";
		String s="welcome to java files";
		FileOutputStream fout=new FileOutputStream(filename);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("file has been written");
		FileInputStream fin=new FileInputStream(filename);
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i=0;
		while((i=bin.read())!=-1){
			System.out.print((char)i);
		}
		bin.close();
		fin.close();
	}

}
