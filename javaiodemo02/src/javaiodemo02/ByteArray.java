package javaiodemo02;
import java.io.*;
public class ByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] buf={65,66,67,68};
		ByteArrayInputStream byt=new ByteArrayInputStream(buf);
		int k=0;
		while((k=byt.read())!=-1){
			char ch=(char)k;
			System.out.println("Ascii value of "+k +" is : "+ch);
		}
	}

}
