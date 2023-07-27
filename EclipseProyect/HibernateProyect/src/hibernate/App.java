package hibernate;

import java.util.List;

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
			
// estas son funciones basicas que ya tiene preconfiguradas el lenguage 
//			HQL que es " Hibernate Query lenguage "
			// por ejemplo si quiero desplegar una lista con hiberante de todos
			//los usuarios seria
			
			//List<User> users = session.createQuery("from users").getResultList();
			//for (User temp: users) {
			//	System.out.print(temp);
			//}
			//En este caso es muy similar para crear un Query puesto que podemos alternar
			//lo que necesitemos por ejemplo: session.createQuety("from users select id_name='3' + "or username like 'angel'"")
			// Para hacer un Update hago la terminacion del query con ("").executeUpdate();
			
			
			
			
		} finally {
			session.close();
			factory.close();
		}
		
	}

}
