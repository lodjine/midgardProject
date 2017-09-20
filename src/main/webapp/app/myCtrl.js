var myApp = angular.module('myApp');

var ctrl=myApp.controller('myCtrl', function($scope,$window) {
	 
	$scope.login="admin";
	
	
	   $scope.VerifAdmin=function() {
		   if($scope.login=="admin" && $scope.password=="admin"){
			 $scope.message="bienvenu";
		   }else{
			   $scope.message="login et/ou mot de passe erroné!";
		   }
	   }
	   
	});