package mypkg.main;
import java.util.ArrayList;
import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mypkg.models.Question;
public class getdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		
		
		session.close();
		System.out.println("success");
		System.exit(0);
	}

}
