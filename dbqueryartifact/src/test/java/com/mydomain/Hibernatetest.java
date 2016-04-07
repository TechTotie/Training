package com.mydomain;

import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class Hibernatetest {
	
	private static SessionFactory sessfact;
	@BeforeClass
	public void initHibernate(){
		// Init Hibernate code
	}
	
	
	@Test
	public void testUserLoading(){
		int x = 3+4;
		Assert.assertEquals(7,x);
	}

}
