package javaiodemo;

import java.io.*;

public class DataStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filename = "testdatastream.txt";
		FileOutputStream file = new FileOutputStream(filename);
		DataOutputStream data=new DataOutputStream(file);
		data.writeInt(65);
		data.writeChars("welcome to java");
		data.flush();
		data.close();
		System.out.println("data has been weritten");
	}

}
