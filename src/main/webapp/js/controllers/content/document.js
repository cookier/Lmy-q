'use strict';

/**
 * POI兴趣点
 */
app.controller('DocumentListController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'dialogService',
  'notifyService',
  '$timeout',
  function($scope,$http,$state,$stateParams,dialogService,notifyService,$timeout){
    $scope.pageData = {};
    $scope.type={};
    $scope.data={beginCreateTime:"",endCreateTime:""};

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
      $http.post('doc/getHimiDocumentList',data).success(function(response){
    	  layer.close(loading);
    	  $scope.pageData = response.page;
      }).error(function(e){
        console.error(e);
        layer.close(loading);
      });
    };

    $scope.loadState = function(){
      $http.post('doc/getDocState').success(function(data){ 
    	  console.log(data);
          $scope.type=data;
      }).error(function(e){
          console.error(e);
      });
    };
    
    $scope.updateState=function(id,state,index){
    	$http.post('poi/updatePoiState?id='+id+'&state='+state).success(function(data){
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

