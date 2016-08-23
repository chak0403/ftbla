<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>fa</title>
	
	<meta name="viewport" 		content="width=device-width, initial-scale=1.0">	
	<meta name="author" 		content="test">	
	<meta name="description" 	content="test">
<head>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/bs-3.3.6/jq-2.2.3/dt-1.10.12/datatables.min.css" />
<script type="text/javascript"
	src="https://cdn.datatables.net/v/bs-3.3.6/jq-2.2.3/dt-1.10.12/datatables.min.js"></script>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js"></script>
</head>


<script type="text/javascript">
	angular.module('main.service', []).factory('mainService', function() {
		return {
			init : function($scope) {

			},
			test : function($scope) {
			}
		}
	});
</script>

<body>
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="menu" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
</body>
</html>
