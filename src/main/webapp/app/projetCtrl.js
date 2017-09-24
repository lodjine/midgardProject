var midgApp = angular.module('midgApp');

var projetCtrl = midgApp.controller('projetCtrl', function($scope, $window,
		projetService, entrepriseService, phaseService, documentService) {

	$scope.projets = projetService.query();
	$scope.documents = [];
	$scope.phase = {
		id : null,
		docs : []
	};
	$scope.entreprises = entrepriseService.query();
	$scope.Add = function() {
		// Add the new item to the Array.
		var document = {};
		document.typeDoc = $scope.typeDoc;
		document.etatDoc = $scope.etatDoc;
		$scope.phase.docs.push(document);
		$scope.typeDoc = "";
		$scope.etatDoc = "";
	};

	$scope.Remove = function(index) {
		$scope.phase.docs.splice(index, 1);
	}

	$scope.saveProjet = function() {
		console.log($scope.phase);
		phaseService.save($scope.phase);

	}

});