<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="s" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>

<script type="text/javascript" src="/app/resources/js/jquery/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="/app/resources/js/lib/json2.js"></script>

<script type="text/javascript">
	$.fn.serializeObject = function() {
	   var o = {};
	   var a = this.serializeArray();
	   $.each(a, function() {
	       if (o[this.name]) {
	           if (!o[this.name].push) {
	               o[this.name] = [o[this.name]];
	           }
	           o[this.name].push(this.value || '');
	       } else {
	           o[this.name] = this.value || '';
	       }
	   });
	   return o;
	};
	
	var codes = [];
	function charByteSize(ch) {
		var charCode = ch.charCodeAt(0);
		codes.push(charCode);

		if (charCode == 0x00000A) { // 자바에선 리턴값이 2바이트
			return 2;
		} else if (charCode <= 0x00007F) {
			return 1;
		} else if (charCode <= 0x0007FF) {
			return 2;
		} else if (charCode <= 0x00FFFF) {
			return 3;
		} else {
			return 4;
		}
	}
	
	function checkCount() {
		$("#result").text("");
		$("#size").text(0);
		
		var content = $("#content").val();

		var size = 0;
		for (var i = 0; i < content.length; i++) {
			size += charByteSize(content.charAt(i));
		}
		/* var size = (function getByteLength(s, b, i, c) {
			for (b = i = 0; c = s.charCodeAt(i++); b += c >> 11 ? 3 : c >> 7 ? 2 : 1);
			return b;
		})(content); */
		$("#size").text(size);
		
		for (var i = 0; i < content.length; i++) {
			var c = content.charCodeAt(i);
			console.log(c, c >> 11 ? 3 : c >> 7 ? 2 : 1);
		}

		$.ajax({
			url : "/app/ajax/date",
			contentType : "application/json; charset=UTF-8",
			method : "POST",
			data : JSON.stringify($("#content").serializeObject()),
			dataType : "json"
		}).done(function(data) {
			$("#result").text(data);
		});
		
		$("#code").text(codes);
		codes = [];
	}
</script>
</head>
<body>

<p>
<a href="/app/j_spring_security_logout">로그아웃</a>
</p>

<h1>
	Hello world!
</h1>

결과: <b id="result"></b>, 길이: <b id="size">0</b>
<br />
<button onclick="checkCount(); return false;">클릭</button>
<br />
<textarea id="content" name="content" rows="20" cols="100">a
b
</textarea>
<br />
코드값: <b id="code"></b>

</body>
</html>
