'use strict';

/**
 * 栏目列表
 */
app.controller('DocumentCategoryListController', [
		'$scope',
		'$http',
		'$state',
		'$stateParams',
		'notifyService',
		function($scope, $http, $state, $stateParams, notifyService) {
			$scope.pageData = {};
			$scope.document = {};
			$scope.name = "";
			
			$scope.pageChanged = function() {

				var data = $.extend({}, $scope.document, {
					pageNumber : $scope.pageData.pageNumber,
					pageSize : $scope.pageData.pageSize,
					name : $scope.name
				});
				$http.post('documentCategory/listDocumentCategory', data)
						.success(function(response) {
							if (response) {
								$scope.pageData = response;
							} else {
								$scope.pageData = {};
							}
						}).error(function(e) {
							notifyService.error(e);
						});
			};

			$scope.delete = function(id){
				layer.confirm('是否删除该栏目？', {
					  btn: ['确认','取消'] // 按钮
					}, function(){
						$http.post('documentCategory/deleteDocumentCategory',{id:id})
						.success(function(resp){
							if(resp.result){
								layer.alert(resp.message);
								$scope.pageChanged();
							}else{
								layer.alert(resp.message);
							}
						});
					});
			}
			
			// 页面初始化数据
			$scope.pageChanged();
		} ]);

app.controller('CreateDocumentCategoryController', [
		'$scope',
		'$http',
		'$state',
		'$stateParams',
		'notifyService',
		'fileReader',
		'documentCategoryService',
		'dialogService',
		function($scope, $http, $state, $stateParams, notifyService,fileReader,documentCategoryService,dialogService) {
			$scope.imageSrc = "";
			$scope.parent_id = 0;
			$scope.id = $stateParams.id;
			$scope.documentCategory = {};
			$scope.documentCategory.sort_num = 0;
			
			$scope.loadData = function(){
				//同步拿到栏目数据
				documentCategoryService.loadCategory($scope.id).then(function(documentCategory){
					$scope.documentCategory = documentCategory;
					if($scope.documentCategory&&$scope.documentCategory.id){
						$scope.parent_id = $scope.documentCategory.parent_id;
						//$scope.imageSrc = 'console'+$scope.documentCategory.icon;
						$scope.imageSrc = $scope.documentCategory.icon;
					}else{
						$scope.documentCategory = {};
						$scope.documentCategory.id = 0;
						$scope.parent_id = 0;
						$scope.imageSrc = "";
					}
				});
			}
			
			$scope.selectParent=function(){
				dialogService.openCategoryTreeDialog(function(category){
					if(category){
						$scope.documentCategory.parentName = category.name;
						$scope.parent_id = category.id;
					}else{
						$scope.documentCategory.parentName = '';
						$scope.parent_id = 0;
					}
				},$scope.documentCategory.id);
			};
			
			//显示所选图片
			$scope.getFile = function () {
                fileReader.readAsDataUrl($scope.file, $scope)
	              .then(function(result) {
	                  $scope.imageSrc = result;
	              });
            };
            
            //触发input file的click事件
            $scope.upload = function(){
            	var inputFile = document.getElementById("fileUp");
                var e = document.createEvent('Event');
                e.initEvent('click', true, true);
                inputFile.dispatchEvent(e);
            }
            
            $scope.save = function(){
            	if($scope.documentCategory&&!$scope.documentCategory.sort_num){
            		$scope.documentCategory.sort_num = 0;
            	}
				$http({
					　　method: 'POST',
					　　url: './documentCategory/saveDocumentCategory',
					  headers: {
					    'Content-Type': undefined
					  },
					  transformRequest: function(data) {
					    var formData = new FormData();
					    formData.append('icon', $scope.file);//图片
					    formData.append('name',$scope.documentCategory.name);
					    formData.append('description',$scope.documentCategory.description);
					    formData.append('sort_num',$scope.documentCategory.sort_num);
					    formData.append('parent_id',$scope.parent_id);//父id
					    formData.append('id',$scope.id);
					    return formData;
					  }
					  }).success(function(d) {
						  if(d.result=="success"){
							  layer.alert(d.message);
						  }else{
							  layer.alert(d.message);
						  }
					  }).error(function(err, status) {
					  });
            }
			
            $scope.loadData();
	} ]);


//上传图片所需
app.directive('fileModel', ['$parse', function ($parse) {
  return {
    restrict: 'A',
    link: function(scope, element, attrs, ngModel) {
      var model = $parse(attrs.fileModel);
      var modelSetter = model.assign;
      element.bind('change', function(event){
        scope.$apply(function(){
          modelSetter(scope, element[0].files[0]);
        });
        //附件预览
        scope.file = (event.srcElement || event.target).files[0];
        if(scope.file.size>1024*1024){
        	scope.file = null;
        	layer.alert("请上传小于1M的图片");
        }else{
        	scope.getFile();
        }
      });
    }
  };
}]);

app.factory('fileReader', ["$q", "$log", function($q, $log){
  var onLoad = function(reader, deferred, scope) {
    return function () {
      scope.$apply(function () {
        deferred.resolve(reader.result);
      });
    };
  };
  var onError = function (reader, deferred, scope) {
    return function () {
      scope.$apply(function () {
        deferred.reject(reader.result);
      });
    };
  };
  var getReader = function(deferred, scope) {
    var reader = new FileReader();
    reader.onload = onLoad(reader, deferred, scope);
    reader.onerror = onError(reader, deferred, scope);
    return reader;
  };
  var readAsDataURL = function (file, scope) {
    var deferred = $q.defer();
    var reader = getReader(deferred, scope);		 
    reader.readAsDataURL(file);
    return deferred.promise;
  };
  return {
    readAsDataUrl: readAsDataURL  
  };
}]);

app.service('documentCategoryService', ['$http','$q','$modal', function ($http,$q,$modal) {
    this.loadCategory = function (id) {
        var deferred = $q.defer();
        $http.post('documentCategory/getDocumentCategory',{id:id})
            .success(function(data){
                deferred.resolve(data.documentCategory);
            })
            .error(function(e){
                console.error(e);
                deferred.reject("操作失败！");
            });
        return deferred.promise;
    };
}]);
