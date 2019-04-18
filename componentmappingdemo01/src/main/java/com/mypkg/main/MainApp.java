package com.mypkg.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mypkg.model.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e1=new Employee("one",new Address("gzb","india",2232323));
		Employee e2=new Employee("two",new Address("del","india",2232323));
		Employee e3=new Employee("three",new Address("mum","india",2232323));
		session.save(e1);
		session.save(e2);
		session.save(e3);
		t.commit();
		session.close();
		
		sessionFactory.close();
		System.out.println("success");
		System.exit(0);
	}

}
