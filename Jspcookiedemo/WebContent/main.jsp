<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Cookie firstname=new Cookie("first_name",request.getParameter("first_name"));
Cookie lastname=new Cookie("last_name",request.getParameter("last_name"));

firstname.setMaxAge(60*60*24);
lastname.setMaxAge(60*60*24);

response.addCookie(firstname);
response.addCookie(lastname);
%>
<h1>Setting cookies</h1>
<ul>
<li><p>First Name :<%=request.getParameter("first_name") %></p></li>
<li><p>Last Name :<%=request.getParameter("last_name") %></p></li>
</ul>
<a href="readcookie.jsp">Read cookies</a>
</body>
</html>