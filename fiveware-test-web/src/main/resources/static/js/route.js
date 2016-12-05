angular.module('app').config(function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: './inicio.html',
            controller: 'inicioCtrl'
        })
        .when('/registrar',{
        	templateUrl: './registrar.html',
        	controller: 'registrarCtrl'
        }).
        otherwise({
        	redirecTo: '/'
        });
});