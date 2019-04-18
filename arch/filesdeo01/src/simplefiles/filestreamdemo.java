package simplefiles;

import java.io.FileOutputStream;

public class filestreamdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String filename="testout.txt";
			FileOutputStream fout=new FileOutputStream(filename);
			fout.write(65);
			fout.close();
			System.out.println("success");
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
