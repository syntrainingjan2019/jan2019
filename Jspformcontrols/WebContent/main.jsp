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
<center>
<h2>Data from request form controls </h2>
<table width="100%" border="1" align="center">
<tr><th>Param Name</th><th>Param value</th></tr>
<%
Enumeration paramNames=request.getParameterNames();
while(paramNames.hasMoreElements()){
	String paramname=(String)paramNames.nextElement();
	out.print("<tr><td>"+paramname+"</td>\n");
	String paramvalue=request.getParameter(paramname);
	out.print("<td>"+paramvalue+"</td></tr>\n");
}

%>
</table>
</center>
</body>
</html>