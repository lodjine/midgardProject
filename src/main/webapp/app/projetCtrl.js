var midgApp = angular.module('midgApp');

var projetCtrl=midgApp.controller('projetCtrl', function($scope,$window,projetService) {
	 
	
	
	$scope.projets=projetService.query();
	   
	});