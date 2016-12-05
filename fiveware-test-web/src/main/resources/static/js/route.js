angular.module('app').config(function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'index.html',
            controller: 'inicioCtrl'
        })
        .when('/registrar',{
        	templateUrl: 'registrar.html',
        	controller: 'registrarCtrl'
        }).
        otherwise({
        	redirecTo: '/'
        });
});