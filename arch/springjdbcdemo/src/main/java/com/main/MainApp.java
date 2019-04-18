package com.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.models.Contact;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import java.sql.*;
import java.util.*;
public class MainApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SimpleDriverDataSource dataSource=new SimpleDriverDataSource();
		dataSource.setDriver(new com.mysql.jdbc.Driver());
		dataSource.setUrl("jdbc:mysql://localhost/test");
		dataSource.setUsername("dev");
		dataSource.setPassword("password");
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		insert(jdbcTemplate,"one","emailone","adone","phoneone");
		String sqlSelect="select * from contact";		
		List<Contact> listcontact=jdbcTemplate.query(sqlSelect, new contactMapper());
		for(Contact acontact:listcontact){
			System.out.println(acontact);
		}
		System.out.println("program works fine");
	}
	public static void insert(JdbcTemplate jdbcTemplate,String name,String email,String address,String phone){
		String sqlinsert="insert into contact (name,email,address,phone) values(?,?,?,?)";
		jdbcTemplate.update(sqlinsert,name,email,address,phone);
		System.out.println("record has been created");
		
	}
	private static final class contactMapper implements RowMapper<Contact>{

		public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Contact con=new Contact();
			con.setName(rs.getString("name"));
			con.setEmail(rs.getString("email"));
			con.setAddress(rs.getString("address"));
			con.setPhone(rs.getString("phone"));
			return con;
		}
		
	}

}
