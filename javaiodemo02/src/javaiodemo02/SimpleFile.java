package javaiodemo02;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class SimpleFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="testfile01.txt";
		try{
			FileOutputStream fout=new FileOutputStream(filename);
			String s="welcome to java files";
			byte[] b=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("data written to file");
			FileInputStream fin=new FileInputStream(filename);
			int i=0;
			while((i=fin.read())!=-1){
				System.out.print((char)i);
			}
			fin.close();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
