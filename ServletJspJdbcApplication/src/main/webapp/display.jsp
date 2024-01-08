<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
<%= request.getAttribute("student") %>

						 <c:forEach var="param" items="${student}">
        <li>${param}</li>
        </c:forEach>
</body>
</html>