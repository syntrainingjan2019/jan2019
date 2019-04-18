<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Reading Cookies</h1>
<%
Cookie cookie=null;
Cookie[] cookies=null;
cookies=request.getCookies();
if(cookies !=null){
	out.println("<h2>Found some cookies");
	for(int i=0;i<cookies.length;i++){
		cookie=cookies[i];
		if((cookie.getName()).compareTo("first_name")==0){
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			out.println("Deleted the cookie"+cookie.getName());
			out.println("Name :"+cookie.getName()+"  Value :"+cookie.getValue()+"</br>");
		}
		else{
			out.println("No cookies found ");
		}
	}
}

%>
</body>
</html>