<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유효성 검사</title>
</head>
<body>

<h2>Search1</h2>
<form action="/app/search/search1">
	<input type="text" name="id" value="" />
	<input type="submit" value="전송" />
</form>

<br />

<h2>Search2</h2>
<form action="/app/search/search2">
	<input type="text" name="id" value="" />
	<input type="text" name="name" value="" />
	<input type="submit" value="전송" />
</form>

</body>
</html>