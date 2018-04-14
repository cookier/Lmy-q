'use strict';

/**
 * 文档列表
 */
app.controller('DocumentListController', [
	'$scope',
	'$http',
	'$state',
	'$stateParams',
	'notifyService',
	function($scope, $http, $state, $stateParams, notifyService) {
		$scope.pageData = {};
		$scope.document = {};
		$scope.categorys=[];
		$scope.title = "";
		$scope.categoryId="";

		$scope.pageChanged = function() {
			var data = $.extend({}, $scope.document, {
				pageNumber : $scope.pageData.pageNumber,
				pageSize : $scope.pageData.pageSize,
				categoryId : $scope.categoryId,
				title:$scope.title
			});
			$http.post('doc/listDocument', data)
				.success(
					function(response) {
						if(response){
							$scope.pageData = response.page;
						}else{
							$scope.pageData={};
						}
					})
				.error(function(e) {
					notifyService.error(e);
			});
		};

		$scope.getDocCategorys = function() {
			$http.post('doc/getDocCategorys').success(function(data) {
				$scope.categorys = data;
			}).error(function(e) {
				console.error(e);
			});
		};
		
		$scope.del = function(id) {
			layer.confirm('确定删除吗?', function(index){
	        	layer.close(index);
	 			$http.post("doc/deleteDocument",{id:id})
	 			.success(function(response){
	 				if(response){
	 					notifyService.info(response.message);
	 					if(response.result=="success"){
	 						$scope.pageChanged();
	 					}
	 				}else{
	 					notifyService.error("系统正忙，请稍后再试!");
	 				}
	 				
	 			})
	            .error(function(err){
	               console.error(err);
	            });
			});
  		};

  		$scope.edit = function(id) {
  			$state.go("console.help_doc_edit",{id:id});
  		}

		// 页面初始化数据
		$scope.pageChanged();
		$scope.getDocCategorys();
} ]);

app.controller('DocumentEditController', [
  	'$scope',
  	'$http',
  	'$state',
  	'$stateParams',
  	'notifyService',
  	function($scope, $http, $state, $stateParams, notifyService) {
  		$scope.doc = {};
  		$scope.template_data=[];
  		$scope.extra_content=[];

  		$scope.load = function() {
  			$http.post('doc/getDocument', {id:$stateParams.id})
  				.success(
  					function(response) {
  						if(response){
  							$scope.doc = response;

  							$scope.extra_content=angular.fromJson($scope.doc.extra_content);
  							
  							var json = {
  							        "type":"config",
  							        "title":$scope.doc.title,
  							        "digest":$scope.doc.digest,
  							        "keywords":$scope.doc.keywords,
  							        "category":$scope.doc.category,
  							        "questions":$scope.extra_content[0].questions
  							    };
  							
  							$scope.template_data=angular.fromJson($scope.doc.content);
  							$scope.template_data.unshift(json);
  						}else{
  							$http.get("api/document.json")
  		                    .success(function (response) {
  		                        $scope.template_data = angular.fromJson(response);
  		                        console.log(response);
  		                    })
  		                    .error(function (err) {
  		                        console.error(err);
  		                    });
  						}
  					})
  				.error(function(e) {
  					notifyService.error(e);
  			});
  		};

  		$scope.save = function(action) {
  			var data = $.extend({action:action},$scope.doc);
			data.template_data = angular.toJson($scope.template_data);
			console.log(data);
 			$http.post("doc/saveDocument",data).success(function(response){
 				if(action=="save"){
 					if(response.result=="success"){
 						 $state.go("console.help_doc"); 
 					}
 				}
            })
            .error(function(err){
               console.error(err);
            });
  		};
  		
  		$scope.cancel=function(){
  			$state.go("console.help_doc");
  		}
  		
  		// 页面初始化数据
  		$scope.load();
 } ]);


