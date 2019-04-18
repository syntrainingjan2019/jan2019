package com.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.models.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring-module.xml");
		Shape s=(Shape)context.getBean("shape3");
		s.draw();
		Shape s2=(Shape)context.getBean("shape4");
		s2.draw();
		Shape s3=(Shape)context.getBean("shape5");
		s3.draw();
	}

}
