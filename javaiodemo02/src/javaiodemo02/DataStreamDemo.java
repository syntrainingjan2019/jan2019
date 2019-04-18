package javaiodemo02;
import java.io.*;
public class DataStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream("testdataoutput.txt");
		DataOutputStream data=new DataOutputStream(file);
		data.writeInt(65);
		data.flush();
		data.close();
		System.out.println("success");
	}

}
