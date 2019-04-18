package com.mypkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class insertdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String JDBC_DRIVER="com.mysql.jdbc.Driver";
		String dbusername="dev";
		String dbpassword="password";
		String schemaname="test";
		String JDBC_URL="jdbc:mysql://localhost:3306/"+schemaname;
		Connection con=null;
		try {
			Class.forName(JDBC_DRIVER);
			con=DriverManager.getConnection(JDBC_URL, dbusername, dbpassword);
			String query="insert into student (name,age,address) values(?,?,?);";
			PreparedStatement stmt=con.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name :");
			String name=sc.next();			
			System.out.println("enter the age :");
			int age=sc.nextInt();			
			System.out.println("enter the address :");
			String address=sc.next();
			stmt.setString(1, name);
			stmt.setInt(2, age);
			stmt.setString(3, address);
			int i=stmt.executeUpdate();
			System.out.println("data inserted successfully");
			stmt.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
