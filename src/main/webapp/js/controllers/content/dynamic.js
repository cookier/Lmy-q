'use strict';

/**
 * 动态列表
 */
app.controller('DynamicListController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'dialogService',
  'notifyService',
  function($scope,$http,$state,$stateParams,dialogService,
           notifyService){
    $scope.pageData = {};
    $scope.source = {};
    $scope.permissions = {};
    $scope.state={};
    $scope.type={};
    $scope.dynamic={beginCreateTime:"",endCreateTime:""};

    $scope.pageChanged = function(){
      var loading = layer.load(1,{
        shade:[0.1,'#393D49']
      });
      if($("#beginCreateTime").val() == ""){
        $scope.dynamic.beginCreateTime = "";
      }
      if($("#endCreateTime").val() == ""){
        $scope.dynamic.endCreateTime = "";
      }
      var data = $.extend({},$scope.dynamic,{
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      });
      $http.post('content/getDynamicList',data).success(function(response){
        layer.close(loading);
        $scope.pageData = response;
        if($scope.pageData.list && $scope.pageData.list.length > 0){
          $.each($scope.pageData.list,function(i,p){
        	  if(p.images!=""){
        		  p.images = angular.fromJson(p.images);
        	  }
          });
        }
      }).error(function(e){
        console.error(e);
        layer.close(loading);
      });
    };

    $scope.loadState = function(){
      $http.post('content/getDynamicState').success(function(data){ 
          $scope.source = data.source;
          $scope.permissions= data.permissions;
          $scope.state=data.state;
          $scope.type=angular.fromJson(data.type);
      }).error(function(e){
          console.error(e);
      });
      $http.post('content/getDynamicType').success(function(data){
    	  console.log(data);
          $scope.type=angular.fromJson(data);
      }).error(function(e){
          console.error(e);
      });
    };
    
    $scope.updateState=function(id,state,index){
    	$http.post('content/updateDynamicState?id='+id+'&state='+state).success(function(data){
			if(data.result=="success"){
				layer.msg("操作成功!");
				$scope.pageData.list[index].stateUpdate=true;
			}else{
				layer.alert("操作失败",{icon:2});
			}
	      }).error(function(e){
	          console.error(e);
	      });
    }

    /**
     * 设置查询时间
     */
    $scope.setQueryTime = function(day){
      var curTime = new Date();
      var lastDate = DateUtil.dateAdd('d',day,curTime);
      lastDate.setHours(0,0,0,0);
      $scope.dynamic.beginCreateTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",lastDate);
      $scope.dynamic.endCreateTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",curTime);
    };

    // 页面初始化数据

    $scope.pageChanged();
    $scope.loadState();
  }]);

