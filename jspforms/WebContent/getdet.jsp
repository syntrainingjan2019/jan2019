<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{
String JDBC_DRIVER="com.mysql.jdbc.Driver";
String DB_URL="jdbc:mysql://localhost:3306/test";

String dbusername="dev";
String dbpassword="password";
Connection conn=null;
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection(DB_URL,dbusername,dbpassword);
String username=request.getParameter("username");
String password=request.getParameter("password");
String sql="select * from login where username=? and password=?";
PreparedStatement query=conn.prepareStatement(sql);
query.setString(1, username);
query.setString(2,password);
ResultSet rs=query.executeQuery();
String loginusername=null;
while(rs.next()){
		int id=rs.getInt("id");
		loginusername=rs.getString("username");
}
rs.close();
conn.close();
if(loginusername==null){
	out.println("login failed please try again");
			response.sendRedirect("index.html");
}
else{
	out.println("Welcome  :"+username+" successfull login");
	session.setAttribute("username", username);
}


}
catch(Exception ex){
	out.println(ex.getMessage());
}
%>
<a href="profiledetails.jsp">Profile</a>
</body>
</html>