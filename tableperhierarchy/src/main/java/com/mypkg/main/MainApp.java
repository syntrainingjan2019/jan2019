package com.mypkg.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.mypkg.model.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction t=null;
		Session session=null;
		try{
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		session=sessionFactory.openSession();
		t=session.beginTransaction();
		Employee e1=new Employee();
//		e1.setId(101);
		e1.setName("normal emp");
		Regular_Employee re=new Regular_Employee();
		re.setName("regular emp");
		re.setSalary(50000);
		re.setBonus(5);
		Contract_Employee ce=new Contract_Employee();
		ce.setName("contract emp");
		ce.setContract_duration("15hrs");
		ce.setPay_per_hour(1000);
		
		session.persist(e1);
		session.persist(re);
		session.persist(ce);
		t.commit();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			t.rollback();
		}
		finally{
			
		}
		System.out.println("success");
			
	}

}
