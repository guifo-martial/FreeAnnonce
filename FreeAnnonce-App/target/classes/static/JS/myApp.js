var myApp= angular.module("myApp",[]);

myApp.controller("UtilisateursCtrl", function($scope,$http) {	
	$scope.user={};

	$scope.initPageData = function(){
		// Get all Roles
		$http.get("/ws/getAllRoles")
			.success(function(data) {
				$scope.allRoles = data;
			})
	
			.error(function(data) {
	
			});
			
		// Get all Users
		$http.get("/ws/getAllUsers")
			.success(function(data) {
				$scope.allUsers = data;
			})
	
			.error(function(data) {
	
			});
	};
		
	
	$scope.save= function(){
		$http.post("/ws/createUser", $scope.user)		
			.success(function(data){
				$scope.user=data;
				alert("L'utilisateur a été créé !");
			})		
			.error(function(data){
				//alert("ERREUR lors de la création de l'utilisateur");				
			})
	};
	
	$scope.deleteUser= function(idUser2delete, item){
		var res = confirm("Etes vous sur de vouloir supprimer cet utilisateur ?");
		if(res == true){
			$http.put("/ws/deleteUser", idUser2delete)		
			.success(function(data){
				alert("L'utilisateur a été supprimé !");
				
			}).error(function(data) {
				// alert("Erreur lors de la suppression de l'utilisateur");
			})
		}
	}
	
});

myApp.controller("HomeCtrl", function($scope,$http) {	
	$scope.allRoles=[];
	
	$scope.inscription = function(){
		$scope.getAllRoles();
	};
	
	
	
});