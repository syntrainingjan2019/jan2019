package propertydemo;
import java.io.*;
import java.util.*;
public class WriteProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		OutputStream output=null;
		try{
			output=new FileOutputStream("config.properties");
			prop.setProperty("database", "localhost");
			prop.setProperty("username", "dev");
			prop.setProperty("pasword", "password");
			prop.store(output, "db connect info");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
