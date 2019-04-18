package com.mypkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class updatedemo {

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
			String query="update student set address=? where id=?";
			PreparedStatement stmt=con.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the address :");
			String address=sc.next();		
			System.out.println("enter the id :");
			int id=sc.nextInt();
			stmt.setString(1, address);
			stmt.setInt(2, id);			
			int i=stmt.executeUpdate();
			System.out.println("data updated successfully");
			stmt.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
