<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹소켓</title>

<script type="text/javascript" src="/resources/js/websocket/sockjs-0.3.4.js"></script>
<script type="text/javascript" src="/resources/js/websocket/stomp.js"></script>

<script type="text/javascript">
	var socket = new SockJS('/hello');
	var stompClient = Stomp.over(socket);
	stompClient.connect({}, function(frame) {
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/greetings', function(greeting){
            console.log(JSON.parse(greeting.body).content);
        });
    });
	
	function sendName() {
        stompClient.send("/app/hello", {}, JSON.stringify({ 'name': '홍길동' }));
    }
	
	function disconnect() {
        if (stompClient != null) {
            stompClient.disconnect();
        }
        console.log("Disconnected");
    }
</script>
</head>
<body>

<button type="button" onclick="sendName();">전송</button>
<button type="button" onclick="disconnect();">종료</button>

</body>
</html>