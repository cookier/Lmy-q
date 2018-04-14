'use strict';

/**
 * 文档列表
 */
app.controller('KeywordsListController', [
	'$scope',
	'$http',
	'$state',
	'$stateParams',
	'notifyService',
	function($scope, $http, $state, $stateParams, notifyService) {
		$scope.pageData = {};
		$scope.keywords = {};
		$scope.categorys=[];
		$scope.name = "";
		$scope.categoryId="";

		$scope.pageChanged = function() {
			var data = $.extend({}, $scope.keywords, {
				pageNumber : $scope.pageData.pageNumber,
				pageSize : $scope.pageData.pageSize,
				categoryId : $scope.categoryId,
				name:$scope.name
			});
			$http.post('keywords/listKeywords', data)
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
 			$http.post("keywords/deleteKeywords",{id:id})
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
  		};

  		$scope.edit = function(id) {
  			$state.go("console.help_keywords_edit",{id:id});
  		}

		// 页面初始化数据
		$scope.pageChanged();
		$scope.getDocCategorys();
} ]);

app.controller('KeywordsEditController', [
  	'$scope',
  	'$http',
  	'$state',
  	'$stateParams',
  	'notifyService',
  	function($scope, $http, $state, $stateParams, notifyService) {
  		$scope.keywords = {};
    	$scope.multipleCategorys = {};
	    $scope.multipleCategorys.selectedTags = [];
	    $scope.categorys=[];
	    $scope.selecteTags = [];
	    
  		$scope.load = function() {
  			$http.post('keywords/getKeywords', {id:$stateParams.id})
  				.success(
  					function(response) {
  						if(response){
  							$scope.keywords = response;
  							$scope.selecteTags = $scope.keywords.categorys; 
  						}
  						$scope.getDocCategorys();
  					})
  				.error(function(e) {
  					notifyService.error(e);
  			});
  		};
  		
  		$scope.getDocCategorys = function() {
			$http.post('doc/getDocCategorys').success(function(data) {
				$scope.categorys = data;
				$scope.multipleCategorys.selectedTags=[];
                $.each($scope.categorys,function(n1,e1){
                	if($scope.selecteTags&&$scope.selecteTags.length>0){
	                    $.each($scope.selecteTags,function(n2,e2){
	                        if(e1.id==e2.id){
	                            $scope.multipleCategorys.selectedTags.push(e1);
	                        }
	                    });
                	}
                });
			}).error(function(e) {
				console.error(e);
			});
		};

  		$scope.save = function(action) {
  			var data = $.extend({},$scope.keywords);
  			var cateIds="";
  			if($scope.multipleCategorys.selectedTags.length>0){
  				$.each($scope.multipleCategorys.selectedTags,function(i,e){
  					if(i<$scope.multipleCategorys.selectedTags.length-1){
  						cateIds=cateIds+e.id+",";
  					}else{
  						cateIds=cateIds+e.id;
  					}
  				});
  			}
  			data.category=cateIds;
  			if(cateIds==""){
  				layer.alert("请选择类目!");
  				return;
  			}
  			if(!$scope.keywords.name){
  				layer.alert("请选择输入关键字!");
  				return;
  			}
 			$http.post("keywords/saveKeywords",data)
 			.success(function(response){
 					if(response.result=="success"){
 						 $state.go("console.help_keywords"); 
 					}
            })
            .error(function(err){
               console.error(err);
            });
  		};
  		
  		$scope.cancel=function(){
  			$state.go("console.help_keywords");
  		}
  		
  		// 页面初始化数据
  		$scope.load();
 } ]);


