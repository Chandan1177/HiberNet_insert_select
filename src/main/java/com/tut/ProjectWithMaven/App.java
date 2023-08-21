package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration confi=new Configuration();
        confi.configure("hibernate.cfg.xml");
               
        SessionFactory factory=confi.buildSessionFactory();
        
        Student st=new Student();
        st.setId(1);
        st.setName("anish");
        st.setCity("Jaipur");
        
        Session session=factory.openSession();
        
        	Transaction tx=session.beginTransaction();
        	session.save(st);
        	tx.commit();
        
        session.close();
    }
}
