package com.mypkg.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mypkg.model.Book;
import com.mypkg.model.*;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		Book newBook=new Book();
		newBook.setTitle("Harry porter");
		newBook.setDescription("fantasy story");
		newBook.setPublishedDate(new Date());
		newBook.setAuthor(new Author("JK Rowling","jk@gmail.com"));
		Long bookid=(Long)session.save(newBook);
		
		t.commit();
		session.close();		
		sessionFactory.close();
		System.out.println("success");
		System.exit(0);
	}

}
