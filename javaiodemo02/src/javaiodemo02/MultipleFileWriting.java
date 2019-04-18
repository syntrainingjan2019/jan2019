package javaiodemo02;
import java.io.*;
public class MultipleFileWriting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fout1=new FileOutputStream("testoutput1.txt");
		FileOutputStream fout2=new FileOutputStream("testoutput2.txt");
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.flush();
		bout.close();
		System.out.println("success");
	}

}
