package hibernateonetoonemapping;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static SessionFactory buildSessionFactory(){
		SessionFactory sessionFactory=null;
		try{
			
			Configuration configuration=new Configuration();
			configuration.configure("hibernate.cfg.xml");
			ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory=configuration.buildSessionFactory(serviceRegistry);
			
			
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return sessionFactory;
	}
	public static SessionFactory getSessionFactory(){
		if(sessionFactory==null){
			System.out.println("building session factory");
			sessionFactory=buildSessionFactory();
		}
		System.out.println("creating hibernate session");
		return sessionFactory;
	}
	private static SessionFactory buildSessionAnnotatonFactory(){
		SessionFactory sessionFactory=null;
		try{
			Configuration configuration=new Configuration();
			configuration.configure("hibernate-annotation.cfg.xml");
			ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory=configuration.buildSessionFactory(serviceRegistry);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		return sessionFactory;
	}
	public static SessionFactory getSessionAnnotationFactory(){
		if(sessionFactory==null){
			System.out.println("building session factory");
			sessionFactory=buildSessionAnnotatonFactory();
		}
		System.out.println("creating hibernate from annotation config ");
		return sessionFactory;
	}
}