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
		Address address=new Address();
		address.setId(1);
		address.setAddress("delhi");
		address.setCountry("india");
		customer.setId(1);
		customer.setName("one");
		customer.setAddress(address);
		return customer;
	}

}
