package com.mypkg.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mypkg.model.Employee;
public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Employee emp=(Employee)session.load(Employee.class, 1);	
		printData(emp, 1);
		session.close();
		try{
			Thread.sleep(10000);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		Session session2=sessionFactory.openSession();
		Employee emp02=(Employee)session2.load(Employee.class, 1);
		printData(emp02, 2);
		session2.close();
		sessionFactory.close();

	}
public static void printData(Employee emp,int count){
	System.out.println(count+" : "+emp);
}
}
