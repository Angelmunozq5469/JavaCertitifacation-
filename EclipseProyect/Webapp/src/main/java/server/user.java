package server;

public class user {
	private String fistname;
	private String lastname;
	public user() {
		fistname = "angel";
		lastname = "emilio";
	}
	public String getFirstname() {
		return fistname;
	}
	public void setFirstname(String fistname) {
		this.fistname=fistname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

}
