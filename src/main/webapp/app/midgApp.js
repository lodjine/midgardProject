var midgApp = angular.module('midgApp', ['ui.router','ngResource']);


midgApp.config(function($stateProvider, $urlRouterProvider) {

    

    $stateProvider.state('projet', {
            url: '/listProjets',
            templateUrl: 'listProjet.html',
			controller: 'projetCtrl'
        }).state('formProjet', {
            url: '/nouveauProjet',
            templateUrl: 'formProjet.html',
			controller: 'projetCtrl'

        }).state('event', {
            url: '/listEvents',
            templateUrl: 'event/listevent.html',
			controller: 'eventController'

        }).state('nouveauEvent', {
            url: '/nouveauEvent',
            templateUrl: 'event/formevent.html',
			controller: 'eventController'

        }).state('detailProjet', {
    		url : '/detailProjet/:id',
    		templateUrl : 'modifProjet.html',
    		controller : 'modifProjetCtrl'
    			
        }).state('listPhase', {
    		url : '/listPhase',
    		templateUrl : 'listPhase.html',
    		controller : 'phaseCtrl'
    			
        }).state('listUser', {
    		url : '/listUser',
    		templateUrl : 'listUser.html',
    		controller : 'userCtrl'
    			
        });
    
});