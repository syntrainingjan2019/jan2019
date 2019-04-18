package filesstreams;
import java.io.*;
public class bufferedoutputdemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filename="testfile.txt";
		FileOutputStream fout=new FileOutputStream(filename);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="welcome to java files";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("finished writing to file success");
		FileInputStream fin=new FileInputStream(filename);
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!=-1){
			System.out.print((char)i);
		}
		bin.close();
		fin.close();
	}

}
