<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Employees Page</h1>
<ul>
<c:forEach items="${employees }" var="employee" >
<li>${employee }</li>
</c:forEach>
</ul>