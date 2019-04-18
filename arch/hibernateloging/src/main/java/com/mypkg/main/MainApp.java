package com.mypkg.main;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.mypkg.model.Employee;
import java.util.List;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class MainApp {

	static{
		System.out.println("before log4j configuration :");
		DOMConfigurator.configure("log4j.xml");
		System.out.println("after log4j configuration :");
	}
	private static Logger logger=Logger.getLogger(MainApp.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Query q=session.createQuery("from Employee");
		List list=q.list();
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			Employee emp=(Employee)itr.next();
			System.out.println(emp);
			logger.info("List of employess :"+emp.getId()+" "+emp.getName()+" "+emp.getSalary());
		}
		tx.commit();
		sessionFactory.close();
		logger.info("DONE");
		System.exit(0);
	}

}
