package com.joydeep.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.joydeep.hibernate.model.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails uds=new UserDetails();
		uds.setUserId(1);
		uds.setUserName("Rahul Chowdhury");
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(uds);
        session.getTransaction().commit();
	}

}
