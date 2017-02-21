package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s1=sf.openSession();
		
		PersonalAddress p1=new PersonalAddress();
		p1.setAddress("Flat no 113,Jijai Hights,Manaji nagar");
		p1.setStreetNo(001);
		p1.setNearBy("Narhe Police Station");
		
		Contact c=new Contact();
		c.setMobileNo("9021155722");
		c.setLandLineNo("Not Applicable");
		c.setEmailId("Aishwary.rajput11@gmail.com");
		
		User u=new User();
		u.setUserid(101);
		u.setUsername("Aishwary Rajput");
		Transaction tx=s1.beginTransaction();
		s1.save(u);
		s1.save(c);
		s1.save(p1);
		tx.commit();
		
		
	}
}
