package com.mypkg.main;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mypkg.hibernate.util.HibernateUtil;
import com.mypkg.model.Certificate;
import com.mypkg.model.Employee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		HashSet set1=new HashSet();
		set1.add(new Certificate("MCA"));
		set1.add(new Certificate("MBA"));
		set1.add(new Certificate("PMP"));
		Integer employeeID=null;
		Employee employee=new Employee("fone","lone",4000);
		employee.setCertificates(set1);
		employeeID=(Integer)session.save(employee);
		
	tx.commit();
		session.close();
		System.exit(0);
	}

}
