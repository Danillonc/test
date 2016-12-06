/**
 * Votacao Controller
 * @author Danillo Coradello.
 */
angular.module('app').
 controller('registrarCtrl',['$scope','$http','$location','registrarService', function($scope,$http,$location,registrarService){
	 
	 $scope.nome = "";
	 $scope.sobrenome = "";
	 $scope.email = "";
	 $scope.senha = "";
	 
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
	 
	 $scope.sexo = "M";
	 
	 $scope.civil = "S";
	 
	 $scope.estadoEscolhido = "";
	 
	 $scope.estados = {
			 model: null,
			 disponiveis : 	[{
					"ID": "1",
					"Sigla": "AC",
					"Nome": "Acre"
				},
				     {
					"ID": "2",
					"Sigla": "AL",
					"Nome": "Alagoas"
				},
				     {
					"ID": "3",
					"Sigla": "AM",
					"Nome": "Amazonas"
				},
				     {
					"ID": "4",
					"Sigla": "AP",
					"Nome": "Amapá"
				},
				     {
					"ID": "5",
					"Sigla": "BA",
					"Nome": "Bahia"
				},
				     {
					"ID": "6",
					"Sigla": "CE",
					"Nome": "Ceará"
				},
				     {
					"ID": "7",
					"Sigla": "DF",
					"Nome": "Distrito Federal"
				},
				     {
					"ID": "8",
					"Sigla": "ES",
					"Nome": "Espírito Santo"
				},
				     {
					"ID": "9",
					"Sigla": "GO",
					"Nome": "Goiás"
				},
				     {
					"ID": "10",
					"Sigla": "MA",
					"Nome": "Maranhão"
				},
				     {
					"ID": "11",
					"Sigla": "MG",
					"Nome": "Minas Gerais"
				},
				     {
					"ID": "12",
					"Sigla": "MS",
					"Nome": "Mato Grosso do Sul"
				},
				     {
					"ID": "13",
					"Sigla": "MT",
					"Nome": "Mato Grosso"
				},
				     {
					"ID": "14",
					"Sigla": "PA",
					"Nome": "Pará"
				},
				     {
					"ID": "15",
					"Sigla": "PB",
					"Nome": "Paraíba"
				},
				     {
					"ID": "16",
					"Sigla": "PE",
					"Nome": "Pernambuco"
				},
				     {
					"ID": "17",
					"Sigla": "PI",
					"Nome": "Piauí"
				},
				     {
					"ID": "18",
					"Sigla": "PR",
					"Nome": "Paraná"
				},
				     {
					"ID": "19",
					"Sigla": "RJ",
					"Nome": "Rio de Janeiro"
				},
				     {
					"ID": "20",
					"Sigla": "RN",
					"Nome": "Rio Grande do Norte"
				},
				     {
					"ID": "21",
					"Sigla": "RO",
					"Nome": "Rondônia"
				},
				     {
					"ID": "22",
					"Sigla": "RR",
					"Nome": "Roraima"
				},
				     {
					"ID": "23",
					"Sigla": "RS",
					"Nome": "Rio Grande do Sul"
				},
				     {
					"ID": "24",
					"Sigla": "SC",
					"Nome": "Santa Catarina"
				},
				     {
					"ID": "25",
					"Sigla": "SE",
					"Nome": "Sergipe"
				},
				     {
					"ID": "26",
					"Sigla": "SP",
					"Nome": "São Paulo"
				},
				     {
					"ID": "27",
					"Sigla": "TO",
					"Nome": "Tocantins"
				}]

	 }
	 	 
	 
	 //chamar o servico que enviara a votacao e retornar o status de ok caso
	 // seja bem sucedido a persistencia no banco. 
	 //após isso mudar o location e mostrar a tela com o percentual.
	 $scope.registrarUsuario = function(){
		  // $event.preventDefault();
		 
		 var dataObj = {
					nome : $scope.nome,
					sobreNome: $scope.sobrenome,
					email: $scope.email,
					senha: $scope.senha,
		            estadoCivil: $scope.civil,
		            sexo: $scope.sexo,
		            estado: $scope.estadoEscolhido
			};
		   
		   //chamar servico para persistir o voto para respectivo participante.
		 registrarService.addUser(dataObj).
		     then(function(response){
		    	 console.log('Sucesso ao registrar - controller votacao.');
		    	 $location.path('/registroFinalizado');		    	 
		     },
		     function(data){
		    	console.log('Erro ao registrar - controller votacao.'); 
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
			url: '/registrarUsuario',
			method: 'POST',
			contentType: "application/json",
			data: obj			
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