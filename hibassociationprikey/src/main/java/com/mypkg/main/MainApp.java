package com.mypkg.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mypkg.model.Passport;
import com.mypkg.model.Person;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		Person p=new Person();
		p.setPersonName("john king");
		Passport passport=new Passport();
		passport.setPassportNumber(645784);
		passport.setExpiryDate(new Date());
		passport.setIssueDate(new Date());
		passport.setPerson(p);
		
		session.save(passport);
		t.commit();
		session.close();		
		sessionFactory.close();
		System.out.println("success");
		System.exit(0);
	}

}
