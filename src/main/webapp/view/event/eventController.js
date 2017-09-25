/**
 * http://usejsdoc.org/
 */
(function() {
	'use strict';

	angular.module('midgApp').controller('eventController', eventController);
	eventController.$inject = [ '$scope', '$state', '$rootScope',
			'eventService','projetService' ];

	function eventController($scope, $state, $rootScope, 
			eventService,projetService) {
		$scope.event={};
		$scope.events = eventService.query();
		$scope.projets = projetService.query();
		$scope.update = function() {
			  console.log($scope.event.projet.nomProjet +"  N°"+$scope.event.projet.idProjet);
		  }
		   
	
	}
})();