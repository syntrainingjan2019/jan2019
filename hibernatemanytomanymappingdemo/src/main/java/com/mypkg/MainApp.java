package com.mypkg;
import java.util.*;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Set<Course> courses=new HashSet<Course>();
		courses.add(new Course("maths"));
		courses.add(new Course("physics"));
		Student s1=new Student("Stuone",courses);
		Student s2=new Student("Stutwo",courses);
		Transaction tx=session.beginTransaction();
		session.save(s1);
		session.save(s2);
		tx.commit();
		System.out.println("oen to many mapping completed");
		session.close();
		sessionFactory.close();
	}

}
