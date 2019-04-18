package javaiodemo;
import java.io.*;
public class dataInputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filename = "testdatastream.txt";
		InputStream input=new FileInputStream(filename);
		DataInputStream inst=new DataInputStream(input);
		int count=input.available();
		byte[] ary=new byte[count];
		inst.read(ary);
		for(int i=0;i<count;i++){
			char c=(char)ary[i];
			System.out.print(c);
		}
	}

}
