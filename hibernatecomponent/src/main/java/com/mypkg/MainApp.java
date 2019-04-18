package com.mypkg;
import org.hibernate.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		try{
			tx=session.beginTransaction();
			Address address=new Address("MG Road","bangalore","KA","560047");
			Student student=new Student("Stu001",address);
			session.save(student);
			tx.commit();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		finally{
			session.close();
		}
	}

}
