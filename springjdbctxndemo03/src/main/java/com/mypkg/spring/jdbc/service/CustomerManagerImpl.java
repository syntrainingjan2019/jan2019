package com.mypkg.spring.jdbc.service;
import com.mypkg.spring.jdbc.model.Customer;
import com.mypkg.spring.jdbc.dao.*;
import org.springframework.transaction.annotation.Transactional;
public class CustomerManagerImpl implements CustomerManager{
	private CustomerDAO customerDAO;
	
	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public void createCustomer(Customer cust) {
		// TODO Auto-generated method stub
		customerDAO.create(cust);
	}
	
}
