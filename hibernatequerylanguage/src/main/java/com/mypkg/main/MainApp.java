package com.mypkg.main;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mypkg.hibernate.util.HibernateUtil;
import com.mypkg.model.Employee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String sql="select e.empid,e.ename,e.esalary from Employee e where e.empid=:employeeid";
		String updatesql="update Employee set esalary=:salary where empid=:employeeid";
		Query q=session.createQuery(updatesql);		
		q.setParameter("salary", new Double(6000.00));
		q.setParameter("employeeid", new Integer(106));
		int result=q.executeUpdate();		
		tx.commit();
		session.close();
//		List<Object[]> list=q.list();
//		for(Object[] arr:list){
//			System.out.println(Arrays.toString(arr));
//		}
//		for(int i=1;i<=10;i++){
//			Employee emp=new Employee();
//		emp.setEmpid(100+i);
//		emp.setEname("emp00"+i);
//		emp.setEaddress("empadd0"+i);
//		emp.setEsalary(100*i/2);
//		session.save(emp);
//		}
//		tx.commit();
		session.close();
		System.exit(0);
	}

}
