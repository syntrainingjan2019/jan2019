<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Employee</h1>
<form:form modelAttrbute="form">
<form:errors path="" element="div" />
<div>
<form:label path="name">Name</form:label>
<form:input path="name" />
<form:errors path="name" />
</div>
<div>
<form:label path="dept">Dept</form:label>
<form:input path="dept" />
<form:errors path="dept" />
</div>
<div>
<input type="submit" />
</div>
</form:form>
</body>
</html>