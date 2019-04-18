package filesstreams;
import java.io.*;

public class DataStreamdemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream("testdataoutput.txt");
		DataOutputStream data=new DataOutputStream(file);
		data.writeInt(65);
		data.flush();
		data.close();
		System.out.println("success");
	}

}
