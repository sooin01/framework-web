<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html ng-app="app">
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/app/resources/js/angular/angular.js"></script>
<script type="text/javascript" src="/app/resources/js/angular/app.js"></script>
<script type="text/javascript" src="/app/resources/js/angular/controller.js"></script>
</head>
<body>

	<div id="content" ng-controller="tutorialController">
		<input type="text" ng-model="inputValue" /> {{inputValue}}
	</div>
	
	<p>Nothing here {{'yet' + '!'}}</p>

	<ul ng-controller="phonesController">
		<li ng-repeat="phone in phones">
			<span>{{phone.name}}</span>
		</li>
	</ul>

</body>
</html>