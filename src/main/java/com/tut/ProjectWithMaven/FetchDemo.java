package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		
			//fetch data from db
			Student st=(Student)session.get(Student.class, 1);
			System.out.println(st.getCity());
		
		session.close();
		factory.close();
	}
}
