package mypkg.model;

public class User {
	private int id;
	private String username,email,country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", country=" + country + "]";
	}
	public User(String username, String email, String country) {
		super();
		this.username = username;
		this.email = email;
		this.country = country;
	}
	
}
