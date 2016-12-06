/**
 * Controlador inicial para tela de inicio.
 * @author Danillo Coradello.
 * 
 */
angular.module('app').controller('inicioCtrl',['$scope','$http','$location', function($scope,$http,$location){
	
	//redirecionar para a url de registrar que está mapeada no router.
	$scope.registrar = function(){
		$location.path('/registrar');
	}
		
}]);