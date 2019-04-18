package com.mypkg.model;
import javax.persistence.*;
@Entity
@Table(name="AUTHOR")
public class Author {
	@Id
	@Column(name="AUTHOR_ID")
	@GeneratedValue
	private long id;
	
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	public Author(String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}
