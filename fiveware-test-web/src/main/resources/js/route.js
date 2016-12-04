angular.module('app').config(function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: '/templates/index.html',
            controller: 'inicioCtrl'
        }).
        when('/registrar',{
        	templateUrl: '/templates/angular/registrar.html',
        	controller: 'registrarCtrl'
        }).
        otherwise({
        	redirecTo: '/'
        });
});