package filesstreams;
import java.io.*;
public class SequenceStremdemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream input1=new FileInputStream("test1.txt");
		FileInputStream input2=new FileInputStream("test2.txt");
		FileOutputStream fout=new FileOutputStream("testcombined.txt");
		SequenceInputStream inst=new SequenceInputStream(input1, input2);
		int j;
		while((j=inst.read())!=-1){
			System.out.print((char)j);
			fout.write(j);
		}
		inst.close();
		fout.close();
		input1.close();
		input2.close();
	}

}
