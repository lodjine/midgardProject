var midgApp = angular.module('midgApp');

var projetCtrl=midgApp.controller('projetCtrl', function($scope,$window,projetService,entrepriseService,phaseService,documentService) {
	 
	
	
	$scope.projets=projetService.query();
	$scope.documents=[]; 
	$scope.entreprises=entrepriseService.query();
	$scope.Add = function () {
        //Add the new item to the Array.
        var document = {};
        document.typeDoc = $scope.typeDoc;
        document.etatDoc = $scope.etatDoc;
        $scope.documents.push(document);

        //Clear the TextBoxes.
        $scope.typeDoc = "";
        $scope.etatDoc = "";
    };
    
    
    $scope.Remove = function (index) {
       
        
         $scope.documents.splice(index, 1);
        
    }
    
    
    $scope.saveProjet = function () {
        
      
    	
    	phaseService.save($scope.phase);
    	
    	
       
   }
    
    
	
	});