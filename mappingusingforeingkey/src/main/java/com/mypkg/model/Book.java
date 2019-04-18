package com.mypkg.model;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Book")
public class Book {
	
	@Id
	@Column(name="BOOK_ID")
	@GeneratedValue
	private long id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="title")
	private String title;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name="description")
	private String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	 @Temporal(TemporalType.DATE)
	    @Column(name = "PUBLISHED")
	private Date publishedDate;
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	private Author author;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="AUTHOR_ID")
	public Author getAuthor(){
		return author;
	}
	 public void setAuthor(Author author) {
	        this.author = author;
	    }
}
