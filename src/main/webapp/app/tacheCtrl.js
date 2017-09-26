var midgApp = angular.module('midgApp');

var tacheCtrl = midgApp.controller('tacheCtrl', function($scope, $window,
		tacheService,userService,eventService) {
	$scope.taches=tacheService.query();
	$scope.users=userService.query();
	$scope.selectedUser=false;
	$scope.tachesLies=tacheService.query();
	$scope.events=eventService.query();
	$scope.selectOperateur=function selectOperateur(){
		$scope.selectedUser=true;
		$scope.user=userService.get({id:$scope.tache.operateur.id});
	}
});