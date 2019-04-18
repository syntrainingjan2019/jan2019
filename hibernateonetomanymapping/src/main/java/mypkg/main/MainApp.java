package mypkg.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import mypkg.model.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionAnnotationFactory();
		Session session=sessionFactory.openSession();
		Vendor v=new Vendor();
		v.setVendorId(100);
		v.setVendorName("vendor01");
		Customers c1=new Customers();
		c1.setCustomerId(100);
		c1.setCustomerName("cust01");
		c1.setParent(v);
		Customers c2=new Customers();
		c2.setCustomerId(102);
		c2.setCustomerName("cust02");
		c2.setParent(v);
		Customers c3=new Customers();
		c3.setCustomerId(103);
		c3.setCustomerName("cust03");
		c3.setParent(v);
		
		Transaction tx=session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.save(c3);
		tx.commit();
		System.out.println("one to many done");
		session.close();
		sessionFactory.close();
	}

}
