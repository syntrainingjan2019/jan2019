package simplefiles;
import java.io.*;
public class inputstreamdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="teststringout.txt";
		try {
			FileInputStream fin=new FileInputStream(filename);
			int i=0;
			while((i=fin.read())!=-1){
				System.out.print((char)i);
			}
			fin.close();
			System.out.println();
			System.out.println("program terminated");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
