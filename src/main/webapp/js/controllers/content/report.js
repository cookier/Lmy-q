'use strict';

/**
 * POI兴趣点
 */
app.controller('ReportListController',[
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
      $http.post('report/getList',data).success(function(response){
    	  console.log(response);
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
    
    $scope.updateState=function(id,state,index){
    	$http.post('report/updateState?id='+id+'&state='+state).success(function(data){
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
    
    $scope.addContent=function(id,index){
    	console.log($scope.pageData.list[index].content[0].from_id);
    	var date = new Date();  
        var seperator1 = "-";  
        var seperator2 = ":";  
        var year = date.getFullYear();  
        var month = date.getMonth() + 1;  
        var strDate = date.getDate();  
        if (month >= 1 && month <= 9) {  
            month = "0" + month;  
        }  
        if (strDate >= 0 && strDate <= 9) {  
            strDate = "0" + strDate;  
        }  
        var currentdate = year + seperator1 + month + seperator1 + strDate + " " + date.getHours() + seperator2 + date.getMinutes()  + seperator2 + date.getSeconds();  
    	console.log($scope.pageData.list[index].content);
        var json={from_id: $scope.user.id,from_name:$scope.user.name,from_avatar:$scope.user.icon_url,to_id:$scope.pageData.list[index].content[0].from_id,to_name:$scope.pageData.list[index].content[0].from_name,to_avatar:$scope.pageData.list[index].content[0].from_avatar,content:$scope.pageData.list[index].addContent,evaTime:currentdate};
    	var data=JSON.stringify($scope.pageData.list[index].content);
    	data=JSON.parse(data);
    	data.push(json);
    	console.log(data);
    	$http.post('report/updateContent?id='+id+'&content='+JSON.stringify(data)).success(function(data){
			if(data.result=="success"){
				layer.msg("回复成功!");
				$scope.pageData.list[index].addContent="";
				$scope.pageData.list[index].content.push(json);
				$scope.pageData.list[index].editContent=false;
			}else{
				layer.alert("回复失败",{icon:2});
			}
	      }).error(function(e){
	          console.error(e);
	      });
    }
    
    $scope.content_del=function(data_id,data_index,index){
    	var data=JSON.stringify($scope.pageData.list[data_index].content);
    	data=JSON.parse(data);
    	data.remove(index);
    	layer.confirm("确定删除吗?",function(){
    		layer.closeAll();
    		$http.post('report/updateContent?id='+data_id+'&content='+JSON.stringify(data)).success(function(data){ 
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

