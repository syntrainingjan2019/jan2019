package propertydemo;
import java.util.*;
import java.io.*;
public class ReadProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File file=new File("config.properties");
			FileInputStream fileinput=new FileInputStream(file);
			Properties properties=new Properties();
			properties.load(fileinput);
			fileinput.close();
			Enumeration enumkeys=properties.keys();
			while(enumkeys.hasMoreElements()){
				String key=(String)enumkeys.nextElement();
				String value=properties.getProperty(key);
				System.out.println(key +" : "+value);
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
