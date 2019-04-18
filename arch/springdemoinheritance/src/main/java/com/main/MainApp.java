package com.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.models.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Module.xml");
		HelloWorld objA=(HelloWorld)context.getBean("helloWorld");
		objA.getMessage1();
		objA.getMessage2();
		HelloIndia objB=(HelloIndia)context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
	}

}
