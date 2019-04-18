package com.main;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.models.HelloWorld;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring-Module.xml");
		HelloWorld objA=(HelloWorld)context.getBean("helloBean");
		objA.printHello();
		try {
			Thread.sleep(3000);
			context.registerShutdownHook();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("program terminated");
	}

}
