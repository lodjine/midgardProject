var midgApp = angular.module('midgApp');

var tacheCtrl = midgApp.controller('tacheCtrl', function($scope, $window,
		tacheService,userService,evenementService) {
	$scope.taches=tacheService.query();
	$scope.users=userService.query();
	$scope.selectedUser=false;
	$scope.tachesLies=tacheService.query();
	$scope.events=evenementService.query();
	$scope.selectOperateur=function selectOperateur(){
		$scope.selectedUser=true;
		$scope.user=userService.get({id:$scope.tache.operateur.id});
	}
});