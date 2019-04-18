package javaiodemo;
import java.io.*;
public class Dirinfo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f=null;
		String[] paths;
		f=new File("J:/test");
		paths=f.list();
		for(String filename:paths){
			System.out.println(filename);
		}
	}

}
