package com.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.models.*;
import java.sql.*;
import java.util.*;
import org.springframework.jdbc.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.jdbc.core.RowMapper;
public class MainApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SimpleDriverDataSource dataSource=new SimpleDriverDataSource();
		dataSource.setDriver(new com.mysql.jdbc.Driver());
		dataSource.setUrl("jdbc:mysql://localhost/test");
		dataSource.setUsername("dev");
		dataSource.setPassword("password");
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
//		insert(jdbcTemplate,"one","oneemail","oneaddress","11111");
//		insert(jdbcTemplate,"two","twoemail","twoaddress","22222");
//		insert(jdbcTemplate,"three","threeemail","threeaddress","11111");
//		insert(jdbcTemplate,"four","fouremail","fouraddress","44444");
//		String sqlupdate="update contact set phone=? where name=?";
//		jdbcTemplate.update(sqlupdate,new Object[]{"33333","three"});
		String sqldelete="delete from contact where name=?";
		jdbcTemplate.update(sqldelete,new Object[]{"four"});
		String sqlselect="select * from contact";
		List<Contact> listcontact=jdbcTemplate.query(sqlselect, new contactMapper());
		for(Contact acontact:listcontact){
			System.out.println(acontact);
		}
		System.out.println("the program is working fine");
	}
	public static void insert(JdbcTemplate jdbcTemplate,String name,String email,String address,String phone){
		String sqlinsert="insert into contact (name,email,address,phone) values (?,?,?,?)";
		jdbcTemplate.update(sqlinsert,name,email,address,phone);
		System.out.println("record has been inserted");
	}
	public static final class contactMapper implements RowMapper<Contact>{

		public Contact mapRow(ResultSet rs, int rownum) throws SQLException {
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
