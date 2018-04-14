'use strict';

/**
 * 参数配置控制器
 */
app.controller('ConfigListController', [ '$scope', '$http', '$state','$stateParams','$compile','notifyService',
	function($scope, $http, $state,$stateParams,$compile,notifyService) {
		$scope.pageData = {};
		$scope.title = "";
		$scope.type = ($stateParams.type?$stateParams.type:"app");
	
		$scope.pageChanged = function() {
			$http.post('config/listConfig', {
				pageNumber : $scope.pageData.pageNumber,
				pageSize : $scope.pageData.pageSize,
				title : $scope.title,
				type:$scope.type
			}).success(function(page) {
				$scope.pageData = page;
			}).error(function(e) {
				console.error(e);
			});
		};
		
		$scope.pageChanged();
	} ]);

app.controller('ConfigEditController', [ '$scope', '$http', '$state','$stateParams','$compile','notifyService',
 	function($scope, $http, $state,$stateParams,$compile,notifyService) {
 		$scope.config = {};
 		$scope.config.type = ($stateParams.type?$stateParams.type:"app");
 	
 		$scope.getConfig = function() {
 			$http.post('config/getConfig', {
 				id:$stateParams.id
 			}).success(function(data) {
 				$scope.config = data;
 			}).error(function(e) {
 				console.error(e);
 			});
 		};
 		
 		$scope.save = function() {
 			$http.post('config/saveConfig', $scope.config)
 			.success(function(data) {
 				if(data.result='success'){
 					notifyService.info(data.message);
 					$state.go("console.config",{type:$scope.config.type});
 				}else{
 					notifyService.error(data.message);
 				}
 			}).error(function(e) {
 				console.error(e);
 			});
 		};
 		
 		$scope.cancel = function() {
 			$state.go("console.config",{type:$scope.config.type});
 		};
 		
 		$scope.getConfig();
 	} ]);