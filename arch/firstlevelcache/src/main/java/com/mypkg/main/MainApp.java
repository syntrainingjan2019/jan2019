package com.mypkg.main;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mypkg.model.Employee;
public class MainApp {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();		
		Employee emp=(Employee)session.load(Employee.class, 1);
		printData(emp, 1);
		session.close();
		Session session2=sessionFactory.openSession();
		Employee emp02=(Employee)session2.load(Employee.class, 1);
		printData(emp02, 2);
		session2.close();
		System.exit(0);
	}
	public static void printData(Employee emp,int count){
		System.out.println(count+" : "+emp);
	}
}
