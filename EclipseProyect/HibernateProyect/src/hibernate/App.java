package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import HibernateEntity.User;

public class App {
	
	public static void main (String[]args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernatecontext.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
		} finally {
			session.close();
			factory.close();
		}
		
	}

}
