package com.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.models.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring-module.xml");
		JavaCollections jc=(JavaCollections)context.getBean("javaCollections");
		System.out.println("list elements are :"+jc.getAddressList());
		System.out.println("set elements are :"+jc.getAddressSet());
		System.out.println("map elements are :"+jc.getAddressMap());
		System.out.println("prop elements are :"+jc.getAddressProp());
	}

}
