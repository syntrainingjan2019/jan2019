package com.mypkg;
import javax.persistence.*;

@Entity
@Table(name="customers")
public class Customers {
	
	@Id
	@Column(name="custid")
	private int customerId;
	@Column(name="custName",length=30)
	private String customerName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="venid",referencedColumnName="vid")
	private Vendor parent;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Vendor getParent() {
		return parent;
	}

	public void setParent(Vendor parent) {
		this.parent = parent;
	}

	public Customers(int customerId, String customerName, Vendor parent) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.parent = parent;
	}
	

}
