package mydatautils;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class mydataops {
	public cred cd;
	public String[] headers;

	public mydataops() {
		cd = new cred();
	}

	public mydataops(cred cd) {
		this.cd = cd;
	}

	public String[] getheaders(cred cd, String tablename) {
		String[] headers = null;
		String colnames[] = null;
		Connection con = cd.getConnection();
		String sql = "select * from " + tablename + " where 1=0";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			colnames = new String[rsmd.getColumnCount()];
			for (int i = 0; i < rsmd.getColumnCount(); i++) {
				colnames[i] = rsmd.getColumnName(i + 1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return colnames;
	}

	public String[] getrsheaders(ResultSet rs) {
		String[] colnames = null;
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			colnames = new String[rsmd.getColumnCount()];
			for (int i = 0; i < rsmd.getColumnCount(); i++) {
				colnames[i] = rsmd.getColumnName(i + 1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return colnames;
	}

	public void printresults(cred cd, String sql) {
		String colnames[] = null;
		Connection con = cd.getConnection();
		;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			colnames = new String[rsmd.getColumnCount()];
			for (int i = 0; i < rsmd.getColumnCount(); i++) {
				colnames[i] = rsmd.getColumnName(i + 1);
			}
			while (rs.next()) {
				for (int i = 0; i < colnames.length; i++) {
					System.out.print(rs.getObject(colnames[i]) + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printwebresults(cred cd, String sql, PrintWriter out) {
		String colnames[] = null;
		Connection con = cd.getConnection();
		;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			printtohtmltable(rs, out);
			/*
			 * ResultSetMetaData rsmd = rs.getMetaData(); colnames = new
			 * String[rsmd.getColumnCount()]; for (int i = 0; i <
			 * rsmd.getColumnCount(); i++) { colnames[i] = rsmd.getColumnName(i
			 * + 1); } while (rs.next()) { for (int i = 0; i < colnames.length;
			 * i++) { System.out.print(rs.getObject(colnames[i]) + " "); }
			 * System.out.println(); }
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printtohtmltable(ResultSet rs, PrintWriter out) {
		try {
			String colnames[] = null;
			ResultSetMetaData rsmd = rs.getMetaData();
			colnames = new String[rsmd.getColumnCount()];
			for (int i = 0; i < rsmd.getColumnCount(); i++) {
				colnames[i] = rsmd.getColumnName(i + 1);
			}
			out.print("<table><thead>");
			for (int i = 0; i < colnames.length; i++) {
				out.print("<th>" + colnames[i] + "</th>");
			}
			out.print("</thead><tbody>");
			while (rs.next()) {
				out.print("<tr>");
				for (int i = 0; i < colnames.length; i++) {
					out.print("<td>" + rs.getObject(colnames[i]) + "</td>");
				}
				out.print("</tr>");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
