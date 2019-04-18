package com.mypkg.model;

import java.util.Date;

public class Passport {
	private int passportNumber;
	private Date issueDate;
	private Date expiryDate;
	private Person person;
	public Passport(int passportNumber, Date issueDate, Date expiryDate, Person person) {
		super();
		this.passportNumber = passportNumber;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.person = person;
	}
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
