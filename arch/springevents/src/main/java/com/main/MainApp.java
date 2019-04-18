package com.main;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.models.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("Spring-module.xml");	
		
		Student st=(Student)context.getBean("student");
		System.out.println(st);
		 CustomEventPublisher cvp = 
		         (CustomEventPublisher) context.getBean("customEventPublisher");
		 cvp.pulish();
		
	}

}
