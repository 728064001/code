package com.Utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate_Utils {
	private static SessionFactory sessionfactory;
	static{
		try {
			Configuration cf = new Configuration().configure();
			sessionfactory = cf.buildSessionFactory();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Session getSession(){
		return sessionfactory.openSession();
	}
	
	public static void closeSession(Session session){
		if(session!=null){
			if(session.isOpen()){
				session.close();
			}
		}
	}
	
}
