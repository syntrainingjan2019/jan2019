package datastreamsdemo;
import java.io.*;
public class SequenceStreamDemo {
	public static void main(String args[])throws Exception{
		FileInputStream inp1=new FileInputStream("test1.txt");
		FileInputStream inp2=new FileInputStream("test2.txt");
		FileOutputStream fout=new FileOutputStream("testcombinedfile.txt");
		SequenceInputStream inst=new SequenceInputStream(inp1, inp2);
		int j=0;
		while((j=inst.read())!=-1){
			System.out.print((char)j);
			fout.write(j);
		}
		inst.close();
		fout.close();
		inp1.close();
		inp2.close();
	}
}
