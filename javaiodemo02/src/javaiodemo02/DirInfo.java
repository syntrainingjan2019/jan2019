package javaiodemo02;
import java.io.*;
public class DirInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=null;
		String[] paths;
		//String path="E:/workspace/oxygen/study/javaiodemo02/src/javaiodemo02";
		String path=".";
		try{
			f=new File(path);
			paths=f.list();
			for(String filename:paths){
				System.out.println(filename);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
