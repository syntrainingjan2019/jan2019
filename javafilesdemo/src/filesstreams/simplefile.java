package filesstreams;
import java.io.*;
public class simplefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="testfile.txt";
		try {
			FileOutputStream fout=new FileOutputStream(filename);
			String s="welcome to java files";
			byte[] b=s.getBytes();			
			fout.write(b);
			fout.close();
			FileInputStream fin=new FileInputStream(filename);
			int i=0;
			while((i=fin.read())!=-1){
				System.out.print((char)i);
			}			
			fin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
