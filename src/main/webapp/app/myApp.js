var myApp = angular.module('myApp', ['ui.router']);

myApp.config(function($stateProvider, $urlRouterProvider) {

    

    $stateProvider.state('index', {
            url: '/index',
            templateUrl: 'index.html',
			controller: 'myCtrl'
        });

});