'use strict';

app.controller('userController',['$scope','$http','$state','$stateParams','$compile','notifyService','dialogService',
  function($scope,$http,$state,$stateParams,$compile,notifyService,dialogService){
    $scope.pageData = {};
    $scope.mobile = '';

    $scope.pageChanged = function(){
      $http.post('permission/getPlatformRoleUsers',{
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
        mobile:$scope.mobile
      }).success(function(req){
        console.log(req);
        $scope.pageData = req.page;
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.remove = function(id){
      layer.confirm('确认删除此用户？',{
        btn:['确认','取消'] //按钮
      },function(){
        $http.post('permission/removeUser',{id:id})
        .success(function(req){
          if(req.result == 'success'){
            layer.msg('删除成功');
          }else{
            layer.msg('删除失败');
          }
          $scope.pageChanged();
        });
      },function(){
      });
    }

    $scope.openAddPlatformUser = function(){
      dialogService.openAddPlatformUser(function(){
        $scope.pageChanged();
      });
    };

    $scope.addRole = function(userId){
      dialogService.openRoles(function(selected){

        var roleArr = [];
        $.each(selected,function(index,s){
          roleArr.push(s.id);
        });

        $http.post('permission/addRoleForUser',{
          userId:userId,
          ids:roleArr.join(',')
        }).success(function(req){
          if(req.result == 'success'){
            layer.alert('添加角色成功！');
            $scope.pageChanged();
          }else{
            layer.alert('添加角色失败！');
          }
        }).error(function(e){
          console.error(e);
        });
      },userId,2);
    };

    $scope.viewRoles = function(id){
      dialogService.openRoles(function(selected){

        var roleArr = [];
        $.each(selected,function(index,s){
          roleArr.push(s.id);
        });

        $http.post('permission/addRoleForUser',{
          userId:userId,
          ids:roleArr.join(',')
        }).success(function(req){
          if(req.result == 'success'){
            layer.alert('添加角色成功！');
            $scope.pageChanged();
          }else{
            layer.alert('添加角色失败！');
          }
        }).error(function(e){
          console.error(e);
        });
      },id,1);
    };

    $scope.pageChanged();
  }]);

app.controller('roleController',['$scope','$http','$state','$stateParams','$compile','notifyService','dialogService',
  function($scope,$http,$state,$stateParams,$compile,notifyService,dialogService){
    $scope.pageData = {};

    $scope.pageChanged = function(){
      $http.post('permission/getRoles',{
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
      }).success(function(req){
        console.log(req);
        $scope.pageData = req.page;
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.openAddPlatformUser = function(){
      dialogService.openAddPlatformUser(function(selected){
        var userArr = [];
        $.each(selected,function(index,s){
          userArr.push(s.id);
        });
        console.log(userArr);
        $http.post('permission/openPlatformForUser',{ids:userArr.join(',')})
        .success(function(req){
          if(req.result == 'success'){
            layer.alert('添加平台操作用户成功！');
          }else{
            layer.alert('添加平台操作用户失败！');
          }
        })
      });
    };

    $scope.addPermission = function(roleId){
      dialogService.openPermissionList(function(){
        $scope.pageChanged();
      },roleId);
    }

    $scope.remove = function(roleId){
      layer.confirm('确认删除此角色？',{
        btn:['确认','取消'] //按钮
      },function(){
        $http.post('permission/removeRole',{id:roleId})
        .success(function(req){
          if(req.result == 'success'){
            layer.msg('删除成功');
          }else{
            layer.msg('删除失败');
          }
          $scope.pageChanged();
        });
      },function(){
      });
    }

    $scope.pageChanged();
  }]);

app.controller('roleEditController',['$scope','$http','$state','$stateParams','$compile','notifyService','dialogService',
  function($scope,$http,$state,$stateParams,$compile,notifyService,dialogService,editableOptions,editableThemes){
    $scope.pageData = {};
    $scope.role = {};
    $scope.role.id = $stateParams.id?$stateParams.id:0;

    $scope.loadRole = function(){
      $http.post('permission/getRole',{id:$stateParams.id})
      .success(function(req){
        if(req.result == 'success'){
          $scope.role.name = req.platformRole.name;
          $scope.role.details = req.platformRole.details;
        }
      })
    }

    $scope.save = function(){
      $http.post('permission/saveRole',$scope.role)
      .success(function(req){
        if(req.result == 'success'){
          if($scope.role.id){
            notifyService.info('修改成功');
          }else{
            notifyService.info('新建成功');
          }
          $state.go('console.roles');
        }
      });
    };

    $scope.loadRole();
  }]);

app.filter("merge",function(){
  return function(ls,key,n,omit){
    var a = [];
    angular.forEach(ls,function(v,i){
      if(n && n <= i) return false;
      a.push(v[key]);
    });
    if(n && ls.length > n)
      return a.join(',') + (omit || '');
    return a.join(',');
  }
});

app.filter("none",function(){
  return function(obj,content){
    if(obj == null || obj == ''){
      return content;
    }
    return obj;
  };
});

app.filter("state",function(){
  return function(obj){
    switch(obj){
      case 1:
        return "激活";
      case 2:
        return "锁定";
      case 3:
        return "废弃";
      default:
        return "未知状态";
    }
  };
});