package com.mysqloperations;
import java.sql.*;
import java.util.*;

public class Jdbcops {
	String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	String dbusername = "dev";
	String dbpasword = "password";
	String schemaname = "test";
	String JDBC_URL = "jdbc:mysql://localhost:3306/" + schemaname;
	public Connection getConnection(){
		Connection con=null;
		try{
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(JDBC_URL, dbusername, dbpasword);	
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return con;
	}
	public void selectquery(String str){
		Connection con=getConnection();
		try {
		Statement stmt=con.createStatement();		
			ResultSet rs=stmt.executeQuery(str);
			displayresults(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void displayresults(ResultSet rs){
		try{
		ResultSetMetaData rsmd=rs.getMetaData();
		ArrayList<String> headers=new ArrayList<String>();
		for(int i=1;i<=rsmd.getColumnCount();i++){
			headers.add(rsmd.getColumnName(i));
		}
		while(rs.next()){
			for(String colname:headers){
				System.out.print(colname+" : "+rs.getObject(colname)+"\t");
			}
			System.out.println();
		}		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
