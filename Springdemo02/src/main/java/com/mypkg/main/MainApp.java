package com.mypkg.main;
import com.mypkg.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj1=(HelloWorld)context.getBean("helloWorld1");
		obj1.getMessage();
		HelloWorld obj2=(HelloWorld)context.getBean("helloWorld2");
		obj2.getMessage();
	}

}
