package mypkg.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import mypkg.model.*;
import java.util.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionAnnotationFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		HashMap<String,User> map1=new HashMap<String,User>();
		HashMap<String,User> map2=new HashMap<String,User>();
		HashMap<String,User> map3=new HashMap<String,User>();
		map1.put("java is a programing language", new User("user01","user01@testmail.com","user01country"));
		map2.put("csharp is a programing language", new User("user02","user02@testmail.com","user02country"));
		map3.put("vb is a programing language", new User("user03","user03@testmail.com","user03country"));
		
		Question question1=new Question("what is java ?",map1);
		Question question2=new Question("what is csharp ?",map2);
		Question question3=new Question("what is vb ?",map3);
		
		session.persist(question1);
		session.persist(question2);
		session.persist(question3);
		tx.commit();
		System.out.println("many to many done");
		session.close();
		sessionFactory.close();
	}

}
