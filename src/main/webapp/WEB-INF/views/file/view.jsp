<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/app/resources/js/jquery/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="/app/resources/js/lib/json2.js"></script>
<script type="text/javascript" src="/app/resources/js/jquery/jquery.form.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#form').submit(function() {
			$(this).ajaxSubmit({
				url: '/app/file/upload',
				type: 'post',
				dataType: 'json',
				target: '#response',
				success: function(responseText) {
					alert(responseText);
				}
			});
			return false;
		});
	});
</script>
</head>
<body>

<form id="form" action="/app/file/upload" method="post" enctype="multipart/form-data">
	<input type="text" name="id" value="1" />
	<input type="text" name="name" value="파일입니다." />
	<br />
	<input type="file" name="file" />
	<br />
	<input type="submit" value="전송" />
</form>

<br />
<div id="response"></div>

</body>
</html>