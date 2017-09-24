/**
 * http://usejsdoc.org/
 */
(function() {
	'use strict';

	angular.module('midgApp').controller('eventController', eventController);
	eventController.$inject = [ '$scope', '$state', '$rootScope',
			'eventService' ];

	function eventController($scope, $state, $rootScope, $stateParams,
			eventService) {

	}
})();