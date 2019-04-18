package com.mypkg.main;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mypkg.model.Answer;
import com.mypkg.model.Question;
public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		Question q1=new Question();
		q1.setQname("what is java ?");
		Answer ans1=new Answer();
		ans1.setAnswer("its a programminglanguage");
		ans1.setPosterName("post1");
		Answer ans2=new Answer();
		ans2.setAnswer("its a 5th generation langauage");
		ans2.setPosterName("post2");
		Answer ans3=new Answer();
		ans3.setAnswer("it supports web and desktop apps");
		ans3.setPosterName("post3");
		List<Answer> answers=new ArrayList<Answer>();
		answers.add(ans1);
		answers.add(ans2);
		answers.add(ans3);
		q1.setAnswers(answers);
		session.save(q1);
		t.commit();
		sessionFactory.close();

	}

}
