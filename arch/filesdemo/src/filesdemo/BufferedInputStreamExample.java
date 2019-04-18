package filesdemo;
import java.io.*;
public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String filename="buferredoutput.txt";
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
