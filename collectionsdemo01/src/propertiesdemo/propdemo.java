package propertiesdemo;
import java.util.*;
import java.io.*;
public class propdemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("db.properties");
		Properties p=new Properties();
		p.load(reader);
		System.out.println("user : "+p.getProperty("user"));
		System.out.println("password : "+p.getProperty("password"));
	}

}
