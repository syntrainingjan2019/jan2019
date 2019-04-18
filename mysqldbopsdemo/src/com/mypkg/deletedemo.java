package com.mypkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletedemo {

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
			String query="delete from student where id=?;";
			PreparedStatement stmt=con.prepareStatement(query);
			Scanner sc=new Scanner(System.in);						
			System.out.println("enter the id you want to delete :");
			int id=sc.nextInt();
			stmt.setInt(1, id);			
			int i=stmt.executeUpdate();
			System.out.println("data deleted successfully");
			stmt.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
