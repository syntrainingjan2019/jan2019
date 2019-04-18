package mypkg.main;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import mypkg.hibernate.util.*;
import mypkg.model.*;
public class LogingMainApp {

	static{
		System.out.println("before log4j configuration :");
		DOMConfigurator.configure("log4j.xml");
		System.out.println("after log4j configuration");
	}
	private static Logger logger=Logger.getLogger(LogingMainApp.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Employee emp=new Employee();
		emp.setEmpid(101);
		emp.setEname("e001");
		emp.setAddress("eadd01");
		emp.setSalary(1000);
		session.save(emp);
		
		
		logger.info("Saving data for employee :"+emp);	
		Query q=session.createQuery("FROM Employee");
		List list=q.list();
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			Employee employee=(Employee)itr.next();
			System.out.println(employee);
			logger.info("List of Employees :"+employee);		
			
		}
		tx.commit();
		sessionFactory.close();
	}

}
