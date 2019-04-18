package com.mypkg.main;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
	private static SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	static{
		try{
			sessionFactory=new Configuration().configure().buildSessionFactory();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}