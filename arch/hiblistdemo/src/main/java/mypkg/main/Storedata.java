package mypkg.main;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mypkg.models.Answer;
import mypkg.models.Question;
public class Storedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		
		Answer ans1=new Answer();
		ans1.setAnswername("java is a programming language");
		ans1.setPostedBy("candidate01");
		Answer ans2=new Answer();
		ans2.setAnswername("java is a based on OOPS");
		ans2.setPostedBy("candidate02");
		Answer ans3=new Answer();
		ans3.setAnswername("csharp is a programming language");
		ans3.setPostedBy("candidate03");
		Answer ans4=new Answer();
		ans4.setAnswername("csharp is based on oops");
		ans4.setPostedBy("candidate04");
		ArrayList<Answer> list11=new ArrayList<Answer>();
		list11.add(ans1);
		list11.add(ans2);
		ArrayList<Answer> list22=new ArrayList<Answer>();
		list22.add(ans3);
		list22.add(ans4);
		Question ques1=new Question();
		ques1.setQname("what is java ?");
		ques1.setAnswers(list11);
		Question ques2=new Question();
		ques2.setQname("what is csharp ?");
		ques2.setAnswers(list22);
		session.persist(ques1);
		session.persist(ques2);
		t.commit();
		session.close();
		System.out.println("success");
	}

}
