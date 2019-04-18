package filesdemo;
import java.io.*;
public class DataOutputStreamExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream("datastreamouptu.txt");
		DataOutputStream data=new DataOutputStream(file);
		data.writeInt(65);
		data.flush();
		data.close();
		System.out.println("success");
	}

}
