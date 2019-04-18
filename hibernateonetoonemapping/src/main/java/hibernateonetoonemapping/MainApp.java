package hibernateonetoonemapping;
import org.hibernate.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Student s=new Student();
		s.setStudentId(101);
		s.setStudentName("student01");
		s.setGrp("grp01");
		Address ad=new Address();
		ad.setAddressId(1);
		ad.setPlace("carolina");
		ad.setParent(s);
		Transaction tx=session.beginTransaction();
		session.save(ad);
		tx.commit();
		System.out.println("oen to one mapping completed");
		session.close();
		sessionFactory.close();
	}

}
