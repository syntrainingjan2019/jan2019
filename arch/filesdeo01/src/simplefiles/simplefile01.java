package simplefiles;

import java.io.IOException;

public class simplefile01 {
	
	public static void main(String args[]){
		System.out.println("i am output stream");
		System.err.println("i am err stream");
		int i=0;
		try {
			i = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println((char)i);
	}

}
