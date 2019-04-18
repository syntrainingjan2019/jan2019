package buferredoutput;


import java.io.*;

public class bufferedinputstream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filename="outputbuffer.txt";
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
