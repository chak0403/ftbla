<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<script type="text/javascript" charset="utf-8">

	angular.module('mainApp', ['main.service']).controller('mainController', function($scope, mainService){
		//init Scope
		mainService.init($scope);
		
		$scope.datas = ${datas};
		
		angular.element(document).ready(function(){

		});
	});
	


</script>

<div ng-app="mainApp" ng-controller="mainController">
	{{datas}}TEST2
</div>