package transactionmanagementdemo;
import java.sql.*;
public class MainApp {

	public static void main(String args[]){
		String database="test";
		String dbhost="localhost";
		String dbusername="dev";
		String dbpassword="password";
		String port="3306";
		Connection conn=null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			String DB_URL="jdbc:mysql://"+dbhost+":"+port+"/"+database;
			conn=DriverManager.getConnection(DB_URL,dbusername,dbpassword);
			conn.setAutoCommit(false);
			Statement stmt=conn.createStatement();
			String sql="insert into employees (emp_name,emp_salary) values('one',1000)";
			stmt.executeUpdate(sql);
			sql="insert into employees (emp_name,emp_salary) values('two',2000)";
			stmt.executeUpdate(sql);
			conn.commit();
			
	}
		catch(Exception ex){
			try {
				conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(ex.getMessage());
		}
	}
}
