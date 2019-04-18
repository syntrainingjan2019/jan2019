package filesdemo;
import java.io.*;
public class Dirdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=null;
		String[] paths;
		try{
			f=new File("e:/test");
			paths=f.list();
			for(String filename:paths){
				System.out.println(filename);
			}
		}
		catch(Exception ex){
			
		}
	}

}
