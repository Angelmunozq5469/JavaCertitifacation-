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
			// create object of entity class type
			User user = new User("username","email");
			
			// start transaction
			session.beginTransaction();
			//perform operation 
			session.save(user); // session.get(User.class,8)
			//el 8 hace la primary key
			//Commit the transaction 
			session.delete(user); // con este eliminamos de la database
			
			//PARA UPDATE USEER
			((User) session).setUsername("ok");
			//lo estamos updating 
			
			
			session.getTransaction().commit();
			System.out.print("Agregado");			
			
			
			
			
			
		} finally {
			session.close();
			factory.close();
		}
		
	}

}
