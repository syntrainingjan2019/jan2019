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
		Student s=new Student();
		s.setStudentName("student01");
		s.setGrp("grp01");
		Address ad=new Address();
		ad.setAddressId(1);
		ad.setPlace("delhi");
		ad.setParent(s);
		Transaction tx=session.beginTransaction();
		session.save(ad);
		tx.commit();
		System.out.println("one to one mapping done");
		session.close();
		sessionFactory.close();
	}

}
