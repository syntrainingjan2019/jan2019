package simplefiles;
import java.io.*;
public class writestring {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String filename="teststringout.txt";
		FileOutputStream fout=new FileOutputStream(filename);
		String s="welcome to java";
		byte b[]=s.getBytes();
		try {
			fout.write(b);
			fout.close();
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
