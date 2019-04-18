package com.mypkg.spring.jdbc.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mypkg.spring.jdbc.model.*;
import com.mypkg.spring.jdbc.service.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
CustomerManager customerManager=ctx.getBean("customerManager",CustomerManagerImpl.class);
Customer cust=createDummyCustomer();
customerManager.createCustomer(cust);
ctx.close();
	}
public static Customer createDummyCustomer(){
	Customer customer=new Customer();
	customer.setId(2);
	customer.setName("twocust");
	Address address=new Address();
	address.setId(2);
	address.setAddress("delhi");
	address.setCountry("india");
	customer.setAddress(address);
	return customer;
}
}
