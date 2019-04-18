package com.mypkg.main;
import com.mypkg.beans.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
		CustomEventPublisher cvp=(CustomEventPublisher)context.getBean("customEventPublisher");
		cvp.publish();
	}

}
