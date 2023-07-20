package HibernateEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
@Entity
@Table(name="User")


public class User {
	
	
	@Id
	@Column(name="user_ID")
	int user_ID;
		
		
	@Column(name="username")
	String username;
	
	
	
	@Column(name="email")
	String email;


	
	
	public User(String username, String email) {
		
		this.username = username;
		this.email = email;
	}



	public int getUser_ID() {
		return user_ID;
	}



	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
}
