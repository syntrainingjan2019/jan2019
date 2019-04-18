package testhibernatedemo01;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class mainApp {
	private static SessionFactory factory;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			factory=new Configuration().configure().buildSessionFactory();
			Session session=factory.openSession();
			Transaction transaction=null;
			transaction=session.beginTransaction();
			Employee employee=(Employee)session.get(Employee.class, 1004);
			System.out.println(employee);
			session.delete(employee);
			transaction.commit();
			session.close();
			System.exit(0);
		}
		catch(Exception ex){
			System.out.println(ex.getLocalizedMessage());
			System.exit(0);
		}
	}

}
