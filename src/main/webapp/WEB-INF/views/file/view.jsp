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
				success: function(data) {
					alert(data.result);
				}
			});
			return false;
		});
	});
	
	function fileUpdate() {
		$.ajax({
			url: '/app/file/update',
			type: 'post',
			dataType: 'json',
			//contentType: 'application/json;charset=UTF-8',
			//data: toJson($('#form2').serializeArray()),
			data: {
				'id': '',
				'name': '이름입니다.'
			},
			success: function(data) {
				alert(data.result);
			}
		});
	}
	
	function toJson(array) {
		var json = {};
		$.each(array, function(index, ele) {
			return json[ele.name] = ele.value;
		});

		return JSON.stringify(json);
	}
</script>
</head>
<body>

<form id="form" action="/app/file/upload" method="post" enctype="multipart/form-data">
	<input type="text" name="id" value="" />
	<input type="text" name="name" value="파일입니다." />
	<br />
	<input type="file" name="file" />
	<br />
	<input type="submit" value="전송" />
</form>

<br />

<input type="button" value="전송" onclick="fileUpdate();" />

</body>
</html>