/**
 * http://usejsdoc.org/
 */
(function() {
	'use strict';

	angular.module('midgApp').controller('eventController', eventController);
	eventController.$inject = [ '$scope', '$state', '$rootScope',
			'eventService','projetService' ,'phaseService'];

	function eventController($scope, $state, $rootScope, 
			eventService,projetService,phaseService) {
		$scope.event={};
		$scope.events = eventService.query();
		$scope.phases = phaseService.query();
		$scope.projets = projetService.query();
		$scope.update = function() {
			  alert(event.projet);
		  }
		   
	
	}
})();