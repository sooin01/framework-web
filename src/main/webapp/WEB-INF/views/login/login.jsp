<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/app/j_spring_security_check" method="post">
	<input type="text" name="j_username" value="test" />
	<br />
	<input type="text" name="j_password" value="test" />
	<br />
	<input type="submit" value="로그인" />
</form>

</body>
</html>