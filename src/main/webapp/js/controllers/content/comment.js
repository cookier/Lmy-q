'use strict';

/**
 * 评论列表
 */
app.controller('CommentListController',[
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
    $scope.comment={beginCreateTime:"",endCreateTime:""};

    $scope.pageChanged = function(){
      var loading = layer.load(1,{
        shade:[0.1,'#393D49']
      });
      if($("#beginCreateTime").val() == ""){
        $scope.comment.beginCreateTime = "";
      }
      if($("#endCreateTime").val() == ""){
        $scope.comment.endCreateTime = "";
      }
      var data = $.extend({},$scope.comment,{
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      });
      $http.post('content/geCommentList',data).success(function(response){
    	  layer.close(loading);
    	  $scope.pageData = response;
	      if($scope.pageData.list && $scope.pageData.list.length > 0){
			  $.each($scope.pageData.list,function(i,p){
			    p.content = JSON.parse(p.content);
			  });
		  }
      }).error(function(e){
        console.error(e);
        layer.close(loading);
      });
    };

    $scope.loadState = function(){
      $http.post('content/getCommentState').success(function(data){ 
          $scope.state=data;
      }).error(function(e){
          console.error(e);
      });
    };
    
    $scope.content_del=function(data_id,data_index,index){
    	var data=JSON.stringify($scope.pageData.list[data_index].content);
    	data=JSON.parse(data);
    	data.remove(index);
    	layer.confirm("确定删除吗?",function(){
    		layer.closeAll();
    		$http.post('content/updateCommentContent?id='+data_id+'&content='+JSON.stringify(data)).success(function(data){ 
    			if(data.result=="success"){
    				$scope.pageData.list[data_index].content.remove(index);
    				layer.msg("删除成功!");
    			}else{
    				layer.alert("删除失败",{icon:2});
    			}
    	      }).error(function(e){
    	          console.error(e);
    	      });
    	})
    }
    
    $scope.updateState=function(id,state,index){
    	$http.post('content/updateCommentState?id='+id+'&state='+state).success(function(data){
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
      $scope.comment.beginCreateTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",lastDate);
      $scope.comment.endCreateTime = DateUtil.dateToStr(
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

