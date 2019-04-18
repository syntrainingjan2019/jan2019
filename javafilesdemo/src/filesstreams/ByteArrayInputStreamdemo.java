package filesstreams;
import java.io.*;
public class ByteArrayInputStreamdemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		byte[] buf={35,56,65,38};
		ByteArrayInputStream byt=new ByteArrayInputStream(buf);
		int k=0;
		while((k=byt.read())!=-1){
			char ch=(char)k;
			System.out.println("Ascii value if :"+k +" is : "+ch);
		}
	}

}
