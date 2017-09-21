
(function() {
    'use strict';
    angular
        .module('midgApp')
        .factory('phaseService', phaseService);

    phaseService.$inject = ['$resource'];

    function phaseService ($resource) {
    	
    	var resourceUrl =  '/phase/:id';
    	return $resource(resourceUrl, {}, {

    	});
    	
    
        
    }
})();
