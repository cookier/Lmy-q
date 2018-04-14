'use strict';

/**
 * 代理商控制器
 */
app.controller('AgentListController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'notifyService',
  'dialogService',
  function($scope,$http,$state,$stateParams,notifyService,dialogService){
    $scope.pageData = {};
    $scope.agent = {};
    $scope.name = "";
    $scope.mobile = "";
    $scope.beginCreateTime = "";
    $scope.endCreateTime = "";
    $scope.agentAddDepositMoney = "";//代理商增加保证金
    $scope.agentMinusDepositMoney = "";//代理商解冻保证金
    $scope.selectValue = [{name:'未审核',value:0},{name:'审核中',value:1},{name:'审核通过',value:2},{name:'审核不通过',value:3}];
    $scope.selectedName = '';
    
    $scope.pageChanged = function(){
      if($("#beginCreateTime").val() == ""){
        $scope.beginCreateTime = "";
      }
      if($("#endCreateTime").val() == ""){
        $scope.endCreateTime = "";
      }
      var data = $.extend({},$scope.agent,{
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
        mobile:$scope.mobile,
        name:$scope.name,
        beginCreateTime:$scope.beginCreateTime,
        endCreateTime:$scope.endCreateTime,
        level:1
      });
      $http.post('agent/listAgent',data).success(function(response){
        if(response.page && response.page != null){
          $scope.pageData = response.page;
          $.each($scope.pageData.list,function(i,e){
            if(response.areaList.list != ""){
              var areaList = response.areaList.list;
              var area = "";
              $.each(areaList,function(j,el){
                if(e.id == el.agent_id){
                  area += el.area_name + " ; ";
                }
              });
              e.area = area;
            }
          });
        }
      }).error(function(e){
        layer.alert("操作失败!",{icon:2});
      });
    };

    /**
     * 设置查询时间
     */
    $scope.setQueryTime = function(day){
      var curTime = new Date();
      var lastDate = DateUtil.dateAdd('d',day,curTime);
      lastDate.setHours(0,0,0,0);
      $scope.beginCreateTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",lastDate);
      $scope.endCreateTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",curTime);
    };

    $scope.save = function(id,pop){
      pop.save_show = false;
      $http.post('agent/saveAgent',{id:id,status:$("#status_" + id).val()}).success(function(response){
        if(response.result == 'success'){
          layer.msg(response.message);
          $scope.pageChanged();
        }else{
          layer.alert(response.message,{icon:2});
        }
      }).error(function(e){
        layer.alert("操作失败!",{icon:2});
      });
    };

    $scope.toCommissionRate = function(){
      dialogService.openAgentCommissionRate(function(){
      },0);
    }

    $scope.del = function(id,type){
      var name = "封号";
      if(type == 0){
        name = "解冻";
      }
      layer.confirm("确定" + name + "吗?",function(y){
        layer.close(y);
        var index = layer.close(1);
        $http.post('agent/delAgent',{id:id,type:type}).success(function(response){
          layer.close(index);
          if(response.result == 'success'){
            layer.msg(response.message);
            $scope.pageChanged();
          }else{
            layer.alert(response.message,{icon:2});
          }
        }).error(function(e){
          layer.close(index);
          layer.alert("操作失败!",{icon:2});
        });
      })
    }

    $scope.update_commission_rate = function(id){
      var rate = $("#" + id + "_commission_rate").val();
      var index = layer.load(1);
      $http.post('agent/updateCommissionRate',{id:id,commission_rate:rate}).success(function(response){
        layer.close(index);
        if(response.result == 'success'){
          layer.msg(response.message);
          $scope.pageChanged();
        }else{
          layer.alert(response.message,{icon:2});
        }
      }).error(function(e){
        layer.close(index);
        layer.alert("操作失败!",{icon:2});
      });
    }
    //打开代理商保证金比例
    $scope.openSupplierCommissionRate = function(id){
      dialogService.openAgentCommissionRate(function(){
      },id);
    }

    //添加保证金
    $scope.addDepositMoney = function(userId,pop,sumMoney,addMoney){
      if(addMoney < 1){
        layer.alert("请添加大于0的保证金 ! ");
        return;
      }else{
        var index = layer.load(1);
        $http.post('agent/addDepositMoney',{sumMoney:sumMoney,addMoney:addMoney,userId:userId}).success(function(response){
          layer.close(index);
          if(response.result == 'success'){
            pop.addDepositMoney = false;
            layer.msg(response.message);
            $scope.pageChanged();
          }else{
            layer.alert(response.message,{icon:2});
          }
        }).error(function(e){
          layer.close(index);
          layer.alert("操作失败!",{icon:2});
        });
      }
    }

    //修改保证金
    $scope.updateDepositMoney = function(userId,pop){
      var money = $("#" + userId + "_updateMoney").val();
      if(money < 1){
        layer.alert("请添加大于0的保证金 ! ");
        return;
      }

      var index = layer.load(1);
      $http.post('agent/updateDepositMoney',{money:money,userId:userId}).success(function(response){
        layer.close(index);
        if(response.result == 'success'){
          pop = false;
          layer.msg(response.message);
          $scope.pageChanged();
        }else{
          layer.alert(response.message,{icon:2});
        }
      }).error(function(e){
        layer.close(index);
        layer.alert("操作失败!",{icon:2});
      });
    }

    //解冻保证金
    $scope.minusDepositMoney = function(userId,pop,money,minusMoney){
      if(minusMoney < 1 && minusMoney < money){
        layer.alert("需要解冻的保证金必须大于0,并且小于当前保证金 ! ");
        return;
      }else{
        var index = layer.load(1);
        $http.post('agent/minusDepositMoney',{minusMoney:minusMoney,sumMoney:money - minusMoney,userId:userId}).success(function(response){
          layer.close(index);
          if(response.result == 'success'){
            pop.minusDepositMoney = false;
            layer.msg(response.message);
            $scope.pageChanged();
          }else{
            layer.alert(response.message,{icon:2});
          }
        }).error(function(e){
          layer.close(index);
          layer.alert("操作失败!",{icon:2});
        });
      }
    }
    
    //修改代理区域
    $scope.updateArea = function(agent_id){
      dialogService.openAgentArea(function(){
        $scope.pageChanged();
      },agent_id);
    }

    $scope.delAgentArea = function(agent_id){
      layer.confirm("确定取消代理区域吗,取消区域将删除代理商区域有关的所有数据?",function(y){
        layer.close(y);
        var index = layer.load(1);
        $http.post('agent/delAgentArea',{agentId:agent_id}).success(function(response){
          layer.close(index);
          if(response.result == 'success'){
            layer.msg(response.message);
            $scope.pageChanged();
          }else{
            layer.alert(response.message,{icon:2});
          }
        }).error(function(e){
          layer.close(index);
          console.error(e);
        });
      })
    }
    $scope.pageChanged();
    
    $scope.addAgent=function(){
    	dialogService.openAddAgent(function(){
            $scope.pageChanged();
          });
    }  
    
  } ]);


app.controller('AgentDefaultCommissionRate',['$scope','$http','$state', '$stateParams','notifyService','dialogService',
 function($scope,$http,$state,$stateParams,notifyService,dialogService){
	$scope.agent_id=0;
	$scope.pageData = {};
	$scope.supplierData = {};
	$scope.pageData.pageNumber=1;
	$scope.pageData.pageSize=10;
	$scope.pop={update_show:false};
	$scope.person={};

	$scope.pageChanged = function() {
		$scope.person={};
		var index=layer.load(1);
		$http.post('agent/getSupplierCommissionRate',{ agentId:$scope.agent_id,nickname: $scope.nickname,pageNumber : $scope.pageData.pageNumber,pageSize : $scope.pageData.pageSize}).success(function(response) {
			layer.close(index);
			if(response.page&&response.page!=null){
				$scope.pageData = response.page;	
			}
			$scope.supplierData=response.supplier;
			console.log($scope.supplierData);
		}).error(function(e) {
			layer.close(index);
			console.error(e);
		});
	};
	
	$scope.addSupplierRate=function(){
		var percent=$("#percent").val();
		if(percent==""){
			layer.alert("提成比例不能为空!");
			return;
		}
		var data=$scope.person.selected;
		data.percent=percent;
		data.agentId=$scope.agent_id;
		var index=layer.load(1);
		$http.post('agent/addSupplierCommissionRate',data).success(function(response) {
			console.log(response);
			layer.close(index);
			if(response.result=="success"){
				$scope.pageChanged();
				$("#percent").val(0.02);
				layer.msg("操作成功 !");
			}else{
				layer.alert("操作失败 !",{icon:2});
			}
		}).error(function(e) {
			layer.close(index);
			console.error(e);
		});
	}
	$scope.updateSupplierRate=function(id,supplierId,pop){
		var percent=$("#"+supplierId+"_percent").val();
		var index=layer.load(1);
		$http.post('agent/addSupplierCommissionRate',{agentId:$scope.agent_id,id:id,supplierId:supplierId,percent:percent}).success(function(response) {
			layer.close(index);
			if(response.result=="success"){
				$scope.pageChanged();
				layer.msg("修改成功 !");
				pop=false;
			}else{
				layer.alert("操作失败 !",{icon:2});
			}
		}).error(function(e) {
			layer.close(index);
			console.error(e);
		});
	}
	
	$scope.del=function(id){
		layer.confirm("确定要删除吗?",function(){
			var index=layer.load(1);
			$http.post('agent/delSupplierCommissionRate',{id:id}).success(function(response) {
				layer.close(index);
				if(response.result=="success"){
					$scope.pageChanged();
					layer.msg("删除成功 !");
				}else{
					layer.alert("操作失败 !",{icon:2});
				}
			}).error(function(e) {
				layer.close(index);
				console.error(e);
			});
		})
	}
	
	$scope.pageChanged();
} ]);


