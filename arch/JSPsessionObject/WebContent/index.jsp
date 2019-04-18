<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.io.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Date createTime=new Date(session.getCreationTime());
Date lastAcessTime=new Date(session.getLastAccessedTime());
String title="Welcome  Back to my site";
Integer visitCount=new Integer(0);
String visitCountkey=new String("visitCount");
String userIDKey=new String("userId");
String userID=new String("ABCD");
if(session.isNew()){
	title="welcome to my website";
	session.setAttribute(userIDKey, userID);
	session.setAttribute(visitCountkey, visitCount);
}
visitCount=(Integer)session.getAttribute(visitCountkey);
visitCount=visitCount+1;
userID=(String)session.getAttribute(userIDKey);
session.setAttribute(visitCountkey, visitCount);
%>
<h1><%=title %></h1>
<table border="1" align="center">
<tr>
<th>session Info</th>
<th>value</th>
</tr>
<tr><td>id</td><td><% out.println(session.getId()); %></td></tr>
<tr><td>Creation Time</td><td><% out.println(createTime); %></td></tr>
<tr><td>Time of last access</td><td><% out.println(lastAcessTime); %></td></tr>
<tr><td>User Id</td><td><% out.println(userID); %></td></tr>
<tr><td>Number of Visits</td><td><% out.println(visitCount); %></td></tr>
</table>
</body>
</html>