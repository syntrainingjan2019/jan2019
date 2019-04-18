package com.mypkg.spring.jdbc.dao;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.mypkg.spring.jdbc.model.*;
import com.mypkg.spring.jdbc.model.Customer;

public class CustomerDAOImpl implements CustomerDAO{
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource){
		this.dataSource=dataSource;
	}
	
	public void create(Customer customer) {
		// TODO Auto-generated method stub
		String querycreatecustomer="insert into customer(id,name) values(?,?)";
		String querycreateaddress="insert into address (id,address,country) values (?,?,?)";
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		jdbcTemplate.update(querycreatecustomer,new Object[]{customer.getId(),customer.getName()});
		jdbcTemplate.update(querycreateaddress,new Object[]{customer.getId(),customer.getAddress().getAddress(),customer.getAddress().getCountry()});
		}
	}

