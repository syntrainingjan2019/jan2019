package com.mypkg.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.mypkg.model.Employee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session1 = sessionFactory.openSession();
		Employee emp1 = (Employee) session1.load(Employee.class, 1);
		printData(emp1,1);
		session1.close();
		try{
			Thread.sleep(10000);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		Session session2 = sessionFactory.openSession();
		Employee emp2 = (Employee) session2.load(Employee.class, 1);
		printData(emp2,2);
		session2.close();
		System.exit(0);
	}

	private static void printData(Employee emp, int count) {
		System.out.println(count + " : " + emp);
	}
}
