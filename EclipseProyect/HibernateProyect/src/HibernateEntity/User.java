package HibernateEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="User")
public class User {
	int user_ID;
	String username;
	String email;


}
