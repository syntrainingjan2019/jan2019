package com.mypkg;
import org.hibernate.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Vendor v=new Vendor();
		v.setVendorId(100);
		v.setVendorName("vendor101");
		Customers c1=new Customers(101,"cust101",v);
		Customers c2=new Customers(102,"cust102",v);
		Customers c3=new Customers(103,"cust103",v);
		Transaction tx=session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.save(c3);
		tx.commit();
		System.out.println("oen to many mapping completed");
		session.close();
		sessionFactory.close();
	}

}
