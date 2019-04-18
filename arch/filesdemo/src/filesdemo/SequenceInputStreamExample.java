package filesdemo;
import java.io.*;
public class SequenceInputStreamExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String file1="testoutput.txt";
		String file2="buferredoutput.txt";
		FileInputStream inp1=new FileInputStream(file1);
		FileInputStream inp2=new FileInputStream(file2);
		FileOutputStream fout=new FileOutputStream("sequenceoutput.txt");
		SequenceInputStream inst=new SequenceInputStream(inp1,inp2);
		int i=0;
		while((i=inst.read())!=-1){
			System.out.print((char)i);
			fout.write(i);
		}
		inst.close();
		fout.close();
		inp1.close();
		inp2.close();
		System.out.println("success");
	}

}
