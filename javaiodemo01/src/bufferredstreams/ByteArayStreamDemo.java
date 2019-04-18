package bufferredstreams;
import java.io.*;
public class ByteArayStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] buf={65,68,69,70};
		ByteArrayInputStream byt=new ByteArrayInputStream(buf);
		int k=0;
		while((k=byt.read())!=-1){
			char ch=(char)k;
			System.out.println("Ascii value of "+k +" is "+ch);
		}
	}

}
