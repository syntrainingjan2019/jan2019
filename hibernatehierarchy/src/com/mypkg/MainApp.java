package com.mypkg;
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Employee e1=new Employee();
		e1.setName("EName001");
		Regular_Employee e2=new Regular_Employee();
		e2.setName("RegEmp01");
		e2.setSalary(5000);
		e2.setBonus(5);
		Contract_Employee e3=new Contract_Employee();
		e3.setName("RegEmp01");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("15 hours");
		session.save(e1);
		session.save(e2);
		session.save(e3);
		t.commit();
		session.close();
		System.out.println("data saved successfully");
	}

}
