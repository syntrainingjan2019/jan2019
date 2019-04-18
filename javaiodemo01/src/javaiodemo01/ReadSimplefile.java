package javaiodemo01;
import java.io.*;
public class ReadSimplefile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String filename="testfile.txt";
		FileInputStream fin=new FileInputStream(filename);
		int i=0;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
		}
		fin.close();
	}

}
