'use strict';

/**
 * 天气
 */
app.controller('WeatherListController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'dialogService',
  'notifyService',
  '$timeout',
  function($scope,$http,$state,$stateParams,dialogService,notifyService,$timeout){
    $scope.pageData = {};
    $scope.state={};
    $scope.permissions={};
    $scope.type={};
    $scope.data={beginCreateTime:"",endCreateTime:""};
    $scope.user={};
    $scope.pageChanged = function(){
      var loading = layer.load(1,{
        shade:[0.1,'#393D49']
      });
      if($("#beginCreateTime").val() == ""){
        $scope.data.beginCreateTime = "";
      }
      if($("#endCreateTime").val() == ""){
        $scope.data.endCreateTime = "";
      }
      var data = $.extend({},$scope.data,{
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      });
      $http.post('weather/getList',data).success(function(response){
    	  layer.close(loading);
    	  $scope.pageData = response;
    	  if($scope.pageData.list && $scope.pageData.list.length > 0){
			  $.each($scope.pageData.list,function(i,p){
				  p.adviseDetail = JSON.parse(p.adviseDetail);
				  p.aqiDetail = JSON.parse(p.aqiDetail);
			  });
		  }
      }).error(function(e){
        console.error(e);
        layer.close(loading);
      });
    };

    $scope.loadState = function(){
      $http.post('report/getState').success(function(data){ 
    	  console.log(data);
          $scope.state=data.state;
          $scope.permissions=data.permissions;
          $scope.type=data.type;
          $scope.user.name=data.user.nickname;
          $scope.user.icon_url=data.user.icon_url?data.user.icon_url:"";
          $scope.user.id=data.user.id;
      }).error(function(e){
          console.error(e);
      });
    };


    /**
     * 设置查询时间
     */
    $scope.setQueryTime = function(day){
      var curTime = new Date();
      var lastDate = DateUtil.dateAdd('d',day,curTime);
      lastDate.setHours(0,0,0,0);
      $scope.data.beginCreateTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",lastDate);
      $scope.data.endCreateTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",curTime);
    };
    
    
    // 页面初始化数据

    $scope.pageChanged();
    $scope.loadState();
    
    Array.prototype.remove=function(obj){
		for(var i =0;i <this.length;i++){
	    	var temp = this[i];
	    	if(!isNaN(obj)){
	    		temp=i;
	    	}
	    	if(temp == obj){
	        	for(var j = i;j <this.length;j++){
	        		this[j]=this[j+1];
	        	}
	        	this.length = this.length-1;
	    	}
		}
	}
  }]);

