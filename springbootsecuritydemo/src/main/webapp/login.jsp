<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>Employee Login</h1>
<c:url value="/login" var="login" />
<form:form action="${login }" method="post">
<label >Username</label><input type="text" name="username" /><br>
<label >Password</label><input type="text" name="password" />
<br>
<input type="submit" />
</form:form>
</body>
</html>