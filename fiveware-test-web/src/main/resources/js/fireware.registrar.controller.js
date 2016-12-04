/**
 * Votacao Controller
 * @author Danillo Coradello.
 */
angular.module('app').
 controller('registrarCtrl',['$scope','$http','$location','registrarService', function($scope,$http,$location,registrarService){
	 
	 $scope.estadoCivil = [
      {
	    "label" : "Solteiro(a)",
	    "tipo" : "S"
	  },
	  {
		    "label" : "Casado(a)",
		    "tipo" : "C"
	  },
	  {
	    "label" : "Divorciado(a)",
	    "tipo" : "D"
	  },
	];
	 
	 $scope.sexo = {
	   opt : "M"
	 }
	 
//	 $scope.checkEstadoCivil = function(){
//		 //$event.preventDefault();
//		 $scope.estadoCivil = true;
//	 }
	 
	 	 
	 var dataObj = {
				nome : $scope.nome,
				sobreNome: $scope.sobreNome,
	            estadoCivil: $scope.estadoCivil,
	            sexo: $scope.sexo
		};
	 
	 //chamar o servico que enviara a votacao e retornar o status de ok caso
	 // seja bem sucedido a persistencia no banco. 
	 //após isso mudar o location e mostrar a tela com o percentual.
	 $scope.votarParticipante = function(){
		  // $event.preventDefault();
		   
		   //chamar servico para persistir o voto para respectivo participante.
		 registrarService.addUser(dataObj).
		     then(function(response){
		    	 console.log('Sucesso ao votar - controller votacao.');
		    	 $location.path('/votoFinalizado');		    	 
		     },
		     function(data){
		    	console.log('Erro ao votar - controller votacao.'); 
		     });
		   
	 }		
	 
}]);

angular.module('app').service('registrarService',['$http',function($http){
	
	var service = {
			addUser : addUser
	}
	
	return service;
	
	function addUser(obj){
		
		var request = $http({
			method: 'POST',
			url: '/registrarUsuario/'+obj			
		})
		.success(function(response){
			console.log('Sucesso ao registrar - servico angular.');
		})
		.error(function(){
			console.log('Erro ao registrar - servico angular.')
		});
		
		return request;
	 
	}
}]);