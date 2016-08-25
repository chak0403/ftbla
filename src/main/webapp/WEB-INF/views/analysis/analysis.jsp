<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page contentType="text/html;charset=UTF-8"%>

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
	<table class="table table-striped">
		<thead>
			<tr>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>主隊:</td>
				<td>曼聯</td>
				<td>客隊：</td>
				<td>阿仙奴</td>
			</tr>
			<tr>
				<td>近十場賽果:</td>
				<td>{{datas.homeTenRs.result}}</td>
				<td>近十場賽果:</td>
				<td>{{datas.awayTenRs.result}}</td>
			</tr>
			<tr>
				<td>Win Draw Lose:</td>
				<td>{{datas.homeTenRs.winDrawLose}}</td>
				<td>Win Draw Lose:</td>
				<td>{{datas.awayTenRs.winDrawLose}}</td>
			</tr>
			<tr>
				<td>平均勝率：</td>
				<td>{{datas.homeTenRs.winPer}}</td>
				<td>平均勝率：</td>
				<td>{{datas.awayTenRs.winPer}}</td>
			</tr>
			<tr>
				<td>進球:</td>
				<td>{{datas.homeTenRs.goalFor}}  {{datas.homeTenRs.goalAgainst}}</td>
				<td>進球:</td>
				<td>{{datas.awayTenRs.goalFor}}  {{datas.awayTenRs.goalAgainst}}</td>
			</tr>
			<tr>
				<td>平均進球:</td>
				<td>{{datas.homeTenRs.avgFor}}  {{datas.homeTenRs.avgAgainst}}  {{datas.homeTenRs.avgForAgainst}}</td>
				<td>平均進球:</td>
				<td>{{datas.awayTenRs.avgFor}}  {{datas.awayTenRs.avgAgainst}}  {{datas.awayTenRs.avgForAgainst}}</td>
			</tr>
		</tbody>
	</table>
</div>