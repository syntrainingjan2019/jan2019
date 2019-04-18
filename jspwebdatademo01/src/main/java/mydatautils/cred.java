package mydatautils;

import java.sql.*;
public class cred {
	Connection con;
	String database;
	String dbusername;
	String dbpassword;
	String dbhost;
	String JDBC_URL;
	String port;
	public cred(){
		this.database="test";
		this.dbhost="localhost";
		this.dbusername="dev";
		this.dbpassword="password";
		this.port="3306";
	}
	public cred(String dbusername,String dbpassword,String dbhost,String database){
		this.database=database;
		this.dbhost=dbhost;
		this.dbusername=dbusername;
		this.dbpassword=dbpassword;
		this.port="3306";
	}
	public Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String DBURL="jdbc:mysql://"+dbhost+":"+port+"/"+database;
			conn=DriverManager.getConnection( DBURL,dbusername,dbpassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  return conn;
	}
}

