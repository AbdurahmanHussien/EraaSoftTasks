package hibernate;


import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.model.Job;
import hibernate.model.Person;
import net.bytebuddy.implementation.bytecode.Addition;

public class main {

	public static void main(String[] args) {
		
		try {
			
			Configuration configuration = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Person.class)
					.addAnnotatedClass(Job.class);
			
			SessionFactory factory = configuration.buildSessionFactory();
						
			Session session = factory.getCurrentSession();
			
			session.beginTransaction();

			session.getTransaction().commit();
			
	        session.close();
		} catch (Exception e) {

			System.out.println("Exception " + e.getMessage());
		}
		
	}

}

