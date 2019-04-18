package com.mypkg;
import org.hibernate.*;
import org.hibernate.stat.Statistics;

import java.util.*;
public class MainApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Statistics stats=sessionFactory.getStatistics();
		Session session=sessionFactory.openSession();		
		Employee emp=(Employee)session.load(Employee.class, 1);
		System.out.println(emp);
//		session.evict(emp);
//		Thread.sleep(2000);
		Session session2=sessionFactory.openSession();		
		Employee emp2=(Employee)session2.load(Employee.class, 1);
		System.out.println(emp2);
		System.out.println("Fetch count :"+stats.getEntityFetchCount());
		System.out.println("Fetch count :"+stats.getSecondLevelCacheHitCount());
		session2.close();
		System.exit(0);
		
	}

}
