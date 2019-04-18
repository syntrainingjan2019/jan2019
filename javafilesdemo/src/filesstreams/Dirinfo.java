package filesstreams;
import java.io.*;
public class Dirinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=null;
		String[] paths;
		try{
			f=new File("E:/workspace/oxygen/study/javafilesdemo/src/filesstreams");
			paths=f.list();
			for(String filename:paths)
			{
				System.out.println(filename);
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
