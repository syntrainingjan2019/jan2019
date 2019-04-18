package com.mypkg.main;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mypkg.model.Question;
public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("java is a programing language");
		list1.add("java is a platform");
		Question q1=new Question();
		q1.setQname("what is java ?");
		q1.setAnswers(list1);
		session.save(q1);
		t.commit();
		sessionFactory.close();

	}

}
