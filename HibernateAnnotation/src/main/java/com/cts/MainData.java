package com.cts;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainData {
	
	public static void main(String[] args){
		Configuration conf=new Configuration().configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee emp=(Employee)session.load(Employee.class, 102);
		System.out.println("Id is: " +emp.getId()+ "\nName is: "+emp.getFirstName()+" " + emp.getLastName());

		
		
		
		
				
	        tx.commit();
	        session.close();
}
}
