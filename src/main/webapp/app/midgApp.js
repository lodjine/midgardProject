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
        });

});