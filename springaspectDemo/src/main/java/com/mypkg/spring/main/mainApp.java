package com.mypkg.spring.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypkg.spring.service.EmployeeService;
public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService=ctx.getBean("employeeService",EmployeeService.class);
		System.out.println(employeeService.getEmployee().getName());
		employeeService.getEmployee().setName("dummy employee");
		employeeService.getEmployee().throwException();
		ctx.close();
	}

}
