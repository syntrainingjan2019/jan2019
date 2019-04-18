package filesdemo;
import java.io.*;
public class BufferredOutputStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String filename="buferredoutput.txt";
		FileOutputStream fout=new FileOutputStream(filename);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="welcome to java bufered stream example";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");
	}

}
