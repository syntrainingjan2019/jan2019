package datastreamsdemo;
import java.io.*;
public class DirInfo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f=null;
		String[] paths;
		f=new File("E:/workspace/oxygen/study/javaiodemo01");
		paths=f.list();
		for(String filename:paths){
			System.out.println(filename);
		}
	}

}
