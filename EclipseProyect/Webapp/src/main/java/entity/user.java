package entity;

public class user {
    private int user_ID;
    private String username;
    private String email;

    public user(int user_ID, String username, String email) {
        super();
        this.user_ID = user_ID;
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
