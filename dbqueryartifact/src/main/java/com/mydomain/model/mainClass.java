package com.mydomain.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class mainClass {
	
	public static void main(String args[]){
		// Loading Session Factory and Querying
		Configuration configuration =  new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(((Configuration) configuration).getProperties()).build();
		SessionFactory sessionFactory = ((Configuration) configuration).buildSessionFactory(serviceRegistry);
	
		Session session = sessionFactory.openSession();
		List<Users> userList = session.createQuery("select u from Users u").list();
		System.out.println("First Time");
		System.out.println(userList);

		Users user1 = new Users();
		user1.setAge(25);
		user1.setEmailId("temp@temp.com");
//		user1.setJoinDate(11/11/2011);
		user1.setName("User1");
		user1.setPassword("password1");
		user1.setState("AZ");

		Transaction tx = session.beginTransaction();
		session.save(user1);
		tx.commit();
		
		userList = session.createQuery("select u from Users u").list();
		System.out.println("Second Time");
		System.out.println(userList);

		session.close();
		
		
		
		
	}
}
