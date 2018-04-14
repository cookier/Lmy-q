'use strict';

app.controller('BasicCtrl',['$scope','$http',function($scope,$http){
  $scope.data = [];

  $scope.remove = function(scope){
    scope.remove();
  };

  $scope.toggle = function(scope){
    scope.toggle();
  };

  $scope.moveLastToTheBeginning = function(){
    var a = $scope.data.pop();
    $scope.data.splice(0,0,a);
  };

  $scope.newSubItem = function(scope){
    var nodeData = scope.$modelValue;
    nodeData.nodes.push({
      id:nodeData.id * 10 + nodeData.nodes.length,
      title:nodeData.title + '.' + (nodeData.nodes.length + 1),
      nodes:[]
    });
  };

  $scope.collapseAll = function(){
    $scope.$broadcast('angular-ui-tree:collapse-all');
  };

  $scope.expandAll = function(){
    $scope.$broadcast('angular-ui-tree:expand-all');
  };

  $scope.loadAllPermission = function(){
    $http.post('permission/getAllPermission')
    .success(function(req){
      if(req.allPermission){
        if(req.allPermission.length <= 0){
          req.allPermission.push({
            id:- 1,
            permission_name:'',
            permission_url:'',
            delete_flag:0,
          });
          req.allPermission.push({
            id:- 2,
            permission_name:'',
            permission_url:'',
            delete_flag:0,
          });

        }
        var list = req.allPermission;
        $.each(list,function(index,item){
          if(! item.parent_id){
            $scope.createTree(item,list);
            $scope.data.push(item);
          }
        });

        console.log($scope.data);
      }
    })
  };

  $scope.loadAllPermission();

  $scope.createTree = function(element,list){
    element.nodes = [];
    $.each(list,function(index,item){
      if(item.parent_id == element.id){
        $scope.createTree(item,list);
        element.nodes.push(item);
      }
    })
  };

  $scope.savePermissionTree = function(){
    $http.post('permission/savePermissionTree',{data:angular.toJson($scope.data)})
    .success(function(req){
      if(req.result == 'success'){
        layer.alert('保存成功！');
      }else{
        layer.alert('保存失败！');
      }
    });
  }

}]);

