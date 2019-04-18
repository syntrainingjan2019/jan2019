package javaiodemo02;
import java.io.*;
public class BufferredOutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="testbuffer.txt";
		try {
			FileOutputStream fout=new FileOutputStream(filename);
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="welcome to java files";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("finished writing to files");
			FileInputStream fin=new FileInputStream(filename);
			BufferedInputStream bin=new BufferedInputStream(fin);
			int i=0;
			while((i=bin.read())!=-1){
				System.out.print((char)i);
			}
			fin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
