'use strict';

/**
 * 订单列表
 */
app.controller('OrderListController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'dialogService',
  'notifyService',
  function($scope,$http,$state,$stateParams,dialogService,
           notifyService){
    $scope.pageData = {};
    $scope.order = {};
    $scope.refundStatus = {};
    $scope.orderStatus = {};
    $scope.type = $stateParams.type?$stateParams.type:1;
    $scope.order.time_type = "create_time";

    $scope.pageChanged = function(){
      var loading = layer.load(1,{
        shade:[0.1,'#393D49']
      });
      if($("#beginCreateTime").val() == ""){
        $scope.order.beginCreateTime = "";
      }
      if($("#endCreateTime").val() == ""){
        $scope.order.endCreateTime = "";
      }
      var data = $.extend({},$scope.order,{
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
        type:$scope.type
      });
      $http.post('order/listOrder',data).success(function(response){
        layer.close(loading);
        $scope.pageData = response;
        if($scope.pageData.list && $scope.pageData.list.length > 0){
          $.each($scope.pageData.list,function(i,p){
            p.discount_info = angular.fromJson(p.discount_info);
          });
        }
      }).error(function(e){
        console.error(e);
        layer.close(loading);
      });
    };

    $scope.loadRefundStatus = function(){
      $http.post('order/getRefundStatus').success(function(data){
        $scope.refundStatus = data;
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.loadOrderStatus = function(){
      $http.post('order/getOrderStatus').success(function(data){
        $scope.orderStatus = data;
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
      $scope.order.beginCreateTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",lastDate);
      $scope.order.endCreateTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",curTime);
    };

    /**
     * 客服介入
     */
    $scope.serviceIntervene = function(itemId,orderId){
      $state.go("console.order_refund",{
        itemId:itemId,
        orderId:orderId
      });
    };

    /**
     * 导出订单查询结果
     */
    $scope.exportOrderData = function(){
      dialogService.openExport(function(returnData){
        if($("#beginCreateTime").val() == ""){
          $scope.order.beginCreateTime = "";
        }
        if($("#endCreateTime").val() == ""){
          $scope.order.endCreateTime = "";
        }

        var date = new Date();

        var data = $.extend({},$scope.order,{
          pageNumber:$scope.pageData.pageNumber,
          pageSize:$scope.pageData.pageSize,
          type:$scope.type,
          exportPage:returnData,
          fileName:date.getTime()
        });
        var loading = layer.load(1,{
          shade:[0.1,'#393D49']
        });
        $http({
          method:'post',
          url:'order/exportOrder',
          data:data,
          timeout:3000000
        }).success(
          function(resp){
            layer.close(loading);
            if(resp.result == 'success'){
              layer.alert("数据已生成!<br><a href=\""
                + resp.file + "\">点击下载</a>",
                'center');
            }else{
              notifyService.info(resp.message,'center');
            }
          }).error(function(e){  //超时导致请求失败，服务器很大可能已经建好了xls，所以这里直接写死
          layer.close(loading);
          layer.alert("数据已生成!<br><a href=\""
            + '/console/res/report/' + date.getTime() + "\">点击下载</a>",
            'center');
        });
      });
    }

    /**
     * 关闭订单
     */
    $scope.closeOrder = function(id){
      $http.post('order/closeOrder',{orderId:id})
      .success(function(req){
        if(req.result == 'success'){
          $.each($scope.pageData.list,function(i,p){
            if(p.id == id){
              p.order_status_name = '已关闭';
              p.order_type = 5;
            }
          });
          layer.alert('关闭成功');
        }else{
          layer.alert('关闭失败');
        }
      });
    };

    /**
     * 直接退款
     */
    $scope.directRefund = function(id){
      $http.post('order/directRefund',{orderId:id})
      .success(function(req){
        if(req.result == 'success'){
          $.each($scope.pageData.list,function(i,p){
            if(p.id == id){
              p.order_status_name = '已关闭';
            }
          });
          layer.alert('关闭成功');
        }else{
          layer.alert('关闭失败');
        }
      });
    };

    // 页面初始化数据

    $scope.pageChanged();
    $scope.loadRefundStatus();
    $scope.loadOrderStatus();
  }]);

/**
 * 订单明细
 */
app.controller('OrderDetailController',['$scope','$http','$state',
  '$stateParams','notifyService',
  function($scope,$http,$state,$stateParams,notifyService){
    $scope.order = {};
    $scope.loadOrder = function(){
      $http.post('order/getOrder',{
        id:$stateParams.orderId
      }).success(function(data){
        $scope.order = data;
        // 处理物流信息
        if($scope.order.logistics){
          $.each($scope.order.logistics,function(index,d){
            if(d.content){
              d.content = angular.fromJson(d.content);
            }
          });
        }
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.loadOrder();
  }]);

/**
 * 订单退货控制器
 */
app.controller('OrderRefundController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'dialogService',
  'notifyService',
  function($scope,$http,$state,$stateParams,dialogService,
           notifyService){
    $scope.order = {};
    $scope.orderItem = {};
    $scope.orderSafe = {};
    $scope.message = "";
    $scope.pics = [];
    $scope.orderSafeLogs = [];
    $scope.orderLogisticses = [];
    $scope.type = "proxy";

    /**
     * 加载订单
     */
    $scope.loadOrder = function(){
      $http.post('order/getOrder',{
        id:$stateParams.orderId
      }).success(function(data){
        $scope.order = data;

        $scope.loadOrderItem();
        $scope.loadOrderSafe();
        $scope.loadOrderLogistics();
      }).error(function(e){
        console.error(e);
      });
    };

    /**
     * 加载订单物流信息，用来判断是否有发货
     */
    $scope.loadOrderLogistics = function(){
      $http.post('order/listOrderLogistics',{
        orderNo:$scope.order.order_no
      }).success(function(data){
        if(data){
          $scope.orderLogisticses = angular.fromJson(data);
        }
      }).error(function(e){
        console.error(e);
      });
    };

    /**
     * 加载订单项
     */
    $scope.loadOrderItem = function(){
      $http.post('order/getOrderItem',{
        orderItemId:$stateParams.itemId
      }).success(function(data){
        $scope.orderItem = data;
      }).error(function(e){
        console.error(e);
      });
    };

    /**
     * 加载维权信息
     */
    $scope.loadOrderSafe = function(){
      $http.post('order/getOrderSafe',{
        itemId:$stateParams.itemId
      }).success(function(data){
        $scope.orderSafe = data.orderSafe;
        $scope.type = data.type;
        $scope.loadOrderSafeLogs();
      }).error(function(e){
        console.error(e);
      });
    };

    /**
     * 拒绝退款
     */
    $scope.rejectRefund = function(){
      dialogService.openRejectRefundDialog(function(orderSafe){
        $scope.loadOrder();
        $scope.loadOrderItem();
        $scope.loadOrderSafe();
      },$scope.orderSafe);

      /*
       * $http.post('order/rejectRefund', $scope.orderSafe).success(
       * function(data) { alert(data.message); if (data.result ==
       * "success") { location.reload(); } }).error(function(e) {
       * console.error(e); })
       */
    };

    /**
     * 确认收货
     */
    $scope.confimReceiver = function(){
      $http.post('order/receiverGoods',$scope.orderSafe).success(
        function(data){
          alert(data.message);
          if(data.result == "success"){
            location.reload();
          }
        }).error(function(e){
        console.error(e);
      });
    };

    /**
     * 直接退款
     */
    $scope.directRefund = function(){
      $http.post('order/takeDelivery',$scope.orderSafe).success(
        function(data){
          alert(data.message);
          if(data.result == "success"){
            location.reload();
          }
        }).error(function(e){
        console.error(e);
      });
    };

    /**
     * 加载维权记录列表
     */
    $scope.loadOrderSafeLogs = function(){
      $http.post('order/getOrderSafeLogByOrderItem',{
        safeNo:$scope.orderSafe.safe_no
      }).success(
        function(data){
          if(data){
            $scope.orderSafeLogs = data;
            $.each($scope.orderSafeLogs,function(i,e){
              e.explain_detail = angular
              .fromJson(e.explain_detail);
            });
          }
        }).error(function(e){
        console.error(e);
      });
    };

    /**
     * 添加留言
     */
    $scope.addMessage = function(){
      $("#div-message").show();
    };

    /**
     * 保存留言
     */
    $scope.saveMessage = function(){
      if($scope.message == ""){
        alert("请添加留言内容!");
        return;
      }else{
        var data = {
          who:'云中邦客服',
          message:$scope.message,
          pics:angular.toJson($scope.pics),
          safeNo:$scope.orderSafe.safe_no
        };
        $http.post('order/saveMessage',data).success(
          function(data){
            alert(data.message);
            if(data.result == "success"){
              $scope.loadOrderSafeLogs();
              $scope.message = "";
              $scope.pics = [];
            }
          }).error(function(e){
          console.error(e);
        });
      }
    };

    /**
     * 添加维权图片
     */
    $scope.addPic = function(){
      dialogService.openPicUploadDialog(function(data){
        if(data && data.length > 0){
          $.each(data,function(n,e){
            var d = $.extend({
              thumb_url:e.url
            },e);
            $scope.pics.push(d);
          });
        }
      });
    };

    $scope.delPic = function(pic){
      $scope.pics.splice($scope.pics.indexOf(pic),1);
    };

    $scope.loadOrder();

  }]);

app.controller('OrderAgainController',['$scope','$http','$state',
  '$stateParams','notifyService',
  function($scope,$http,$state,$stateParams,notifyService){
    $scope.order_no = '';
    $scope.order = {};

    $http.post('order/orderAgain',{
      order_no:order_no
    }).success(function(req){
      if(req.result == 'success'){
        layer.alert('重新生成记录成功');
      }else{
        layer.alert('重新生成记录失败');
      }
    });

  }]);
