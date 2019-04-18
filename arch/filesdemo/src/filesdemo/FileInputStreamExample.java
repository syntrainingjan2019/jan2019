package filesdemo;
import java.io.*;
public class FileInputStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("testoutput.txt");
		int i=0;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
		}		
		fin.close();
	}

}
