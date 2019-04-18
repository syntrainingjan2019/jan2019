package com.mypkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class selectdemo {

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
			Statement stmt=con.createStatement();
			String query="select * from student";
			ResultSet rs=stmt.executeQuery(query);
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
			stmt.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
