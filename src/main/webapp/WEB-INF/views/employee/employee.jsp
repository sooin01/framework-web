<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Employee</title>
</head>
<body>

<p>
사번, 이름, 성
</p>
<c:forEach var="item" items="${employeeList}">
	<p>
		${item.managerId},
		${item.departmentId},
		${item.employeeList}
	</p>
</c:forEach>

</body>
</html>