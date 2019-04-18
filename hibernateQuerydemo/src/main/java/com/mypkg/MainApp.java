package com.mypkg;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//storedata();
		nativequery();
		System.exit(0);
	}
	public static void nativequery(){
		Session session=HibernateUtil.getSessionFactory().openSession();
		try{
			String sql="select * from employees";
			SQLQuery query=session.createSQLQuery(sql);
			query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
			List list=query.list();			
			for(Object object: list){
				Map row=(Map)object;
				System.out.println("Name :"+row.get("ename")+" City :"+row.get("ecity"));
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		finally{
			session.close();
		}
		
	}
	public static void criteriademo(){
		Session session=HibernateUtil.getSessionFactory().openSession();
		try{
			Criteria cr=session.createCriteria(Employee.class);
			cr.addOrder(Order.desc("name"));
			List list=cr.list();
			Iterator itr=list.iterator();
			while(itr.hasNext()){
				Employee emp=(Employee)itr.next();
				System.out.println(emp);				
			}
			
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		finally{
			session.close();
		}
		
	}
	public static void showdata(){
		Session session=HibernateUtil.getSessionFactory().openSession();
		try{
			Transaction tx=session.beginTransaction();
			Query query=session.createQuery("update Employee set salary=:salary where id=:empid");
			query.setParameter("empid", 5);
			query.setParameter("salary", 5000);
//			List list=query.list();
//			Iterator itr=list.iterator();
//			while(itr.hasNext()){
//				//Employee emp=(Employee)itr.next();
//				//System.out.println(emp);				
//			}
			int result=query.executeUpdate();
			tx.commit();
			System.out.println("no of rows affected is "+result);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		finally{
			session.close();
		}
	}
	public static void storedata(){
		Session session=HibernateUtil.getSessionFactory().openSession();
		try{
			Transaction tx=session.beginTransaction();
//			Employee emp1=new Employee("E001","ECity001",100);
//			session.save(emp1);
			for(int i=1;i<=10;i++){
				String name="E"+i;
				String city="ECity"+i;
				int salary=i*100;
				Employee emp=new Employee(name,city,salary);
				session.save(emp);
			}
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
