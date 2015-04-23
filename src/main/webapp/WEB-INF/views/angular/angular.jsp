<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/app/resources/js/angular/angular.js"></script>
<script type="text/javascript" src="/app/resources/js/angular/app.js"></script>
<script type="text/javascript" src="/app/resources/js/angular/controller.js"></script>
</head>
<body>

<div id="content" ng-app="TutorialApp" ng-controller="TutorialController">
	<input type="text" ng-model="inputValue" /> {{inputValue}}
</div>

</body>
</html>