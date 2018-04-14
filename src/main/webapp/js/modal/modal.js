'use strict';

/**
 * 对话框服务 Created by yml on 2015/9/28.
 */
app.service('dialogService',
  [
    '$http',
    '$q',
    '$modal',
    function($http,$q,$modal){
      var self = this; // Save reference

      this.openSupplierChoser = function(callback,id,mode,url){
        console.log(id);
        var chooseMode = 1;// 1=单选，0=复选
        var actionUrl;
        var couponId;
        var argArr = Array.prototype.slice
        .call(arguments);

        if(argArr.indexOf(mode) > - 1){
          chooseMode = mode;
        }
        if(argArr.indexOf(url) > - 1){
          actionUrl = url;
        }
        if(argArr.indexOf(id) > - 1){
          couponId = id;
        }
        var modalInstance = $modal.open({
          templateUrl:'tpl/modal/suppliers_modal.html',
          controller:'SupplierChoserCtrl',
          backdrop:true,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            },
            actionUrl:function(){
              return actionUrl;
            },
            couponId:function(){
              return couponId;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openMemberChoser = function(callback,id,mode,url){
        console.log(id);
        var chooseMode = 1;// 1=单选，0=复选
        var actionUrl;
        var couponId;
        var argArr = Array.prototype.slice
        .call(arguments);

        if(argArr.indexOf(mode) > - 1){
          chooseMode = mode;
        }
        if(argArr.indexOf(url) > - 1){
          actionUrl = url;
        }
        if(argArr.indexOf(id) > - 1){
          couponId = id;
        }
        var modalInstance = $modal.open({
          templateUrl:'tpl/modal/members_modal.html',
          controller:'MemberChoserCtrl',
          backdrop:true,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            },
            actionUrl:function(){
              return actionUrl;
            },
            couponId:function(){
              return couponId;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openProxyChoser = function(callback,id,mode,url){
        console.log(id);
        var chooseMode = 1;// 1=单选，0=复选
        var actionUrl;
        var couponId;
        var argArr = Array.prototype.slice
        .call(arguments);

        if(argArr.indexOf(mode) > - 1){
          chooseMode = mode;
        }
        if(argArr.indexOf(url) > - 1){
          actionUrl = url;
        }
        if(argArr.indexOf(id) > - 1){
          couponId = id;
        }
        var modalInstance = $modal.open({
          templateUrl:'tpl/modal/proxys_modal.html',
          controller:'ProxyChoserCtrl',
          backdrop:true,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            },
            actionUrl:function(){
              return actionUrl;
            },
            couponId:function(){
              return couponId;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openGoodsBySupplierChoser = function(callback,mode,selectedGoods,url){
        var chooseMode = 1;// 1=单选，0=复选
        var actionUrl;
        var actionSelectedGoods;
        var argArr = Array.prototype.slice
        .call(arguments);

        if(argArr.indexOf(mode) > - 1){
          chooseMode = mode;
        }
        if(argArr.indexOf(selectedGoods) > - 1){
          actionSelectedGoods = selectedGoods;
        }
        if(argArr.indexOf(url) > - 1){
          actionUrl = url;
        }
        var modalInstance = $modal.open({
          templateUrl:'tpl/modal/goods_modal.html',
          controller:'GoodsBySupplierChoserCtrl',
          backdrop:true,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            },
            actionUrl:function(){
              return actionUrl;
            },
            actionSelectedGoods:function(){
              return actionSelectedGoods;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openGoodsForGroupChoser = function(callback,mode,groupName,url){
        var chooseMode = 1;// 1=单选，0=复选
        var actionUrl;
        var actionSelectedGoods;
        var actionGroupName
        var argArr = Array.prototype.slice
        .call(arguments);

        if(argArr.indexOf(mode) > - 1){
          chooseMode = mode;
        }
        if(argArr.indexOf(url) > - 1){
          actionUrl = url;
        }
        if(argArr.indexOf(groupName) > - 1){
          actionGroupName = groupName;
        }
        var modalInstance = $modal.open({
          templateUrl:'tpl/modal/goods_modal.html',
          controller:'GoodsChoserForGroupCtrl',
          backdrop:true,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            },
            actionUrl:function(){
              return actionUrl;
            },
            actionSelectedGoods:function(){
              return actionSelectedGoods;
            },
            actionGroupName:function(){
              return actionGroupName;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openActivityChoser = function(callback,mode,url){
        var chooseMode = 1;// 1=单选，0=复选
        var actionUrl;
        var argArr = Array.prototype.slice
        .call(arguments);

        if(argArr.indexOf(mode) > - 1){
          chooseMode = mode;
        }
        if(argArr.indexOf(url) > - 1){
          actionUrl = url;
        }
        var modalInstance = $modal.open({
          templateUrl:'tpl/modal/activity_modal.html',
          controller:'ActivityChoserCtrl',
          backdrop:true,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            },
            actionUrl:function(){
              return actionUrl;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openCouponChoser = function(callback,mode,url){
        var chooseMode = 1;// 1=单选，0=复选
        var actionUrl;
        var argArr = Array.prototype.slice
        .call(arguments);

        if(argArr.indexOf(mode) > - 1){
          chooseMode = mode;
        }
        if(argArr.indexOf(url) > - 1){
          actionUrl = url;
        }
        var modalInstance = $modal.open({
          templateUrl:'html/modal/coupon_modal.html',
          controller:'CouponChoserCtrl',
          backdrop:true,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            },
            actionUrl:function(){
              return actionUrl;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 打开活动优惠券选择
       * @param callback
       * @param mode
       * @param url
       */
      this.openActivityCouponChoser = function(callback,mode,url,activity,rule){
        var chooseMode = 1;// 1=单选，0=复选
        var actionUrl;
        var argArr = Array.prototype.slice
        .call(arguments);
        console.info("activity" + activity);
        if(argArr.indexOf(mode) > - 1){
          chooseMode = mode;
        }
        if(argArr.indexOf(url) > - 1){
          actionUrl = url;
        }
        var modalInstance = $modal.open({
          templateUrl:'html/marketing/activity_coupon_modal.html',
          controller:'ActivityCouponChoserCtrl',
          backdrop:true,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            },
            actionUrl:function(){
              return actionUrl;
            },
            activity:function(){
              return activity;
            },
            rule:function(){
              return rule;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openGoodsChoser = function(callback,mode,url){
        var chooseMode = 1;// 1=单选，0=复选
        var actionUrl;
        var argArr = Array.prototype.slice
        .call(arguments);

        if(argArr.indexOf(mode) > - 1){
          chooseMode = mode;
        }
        if(argArr.indexOf(url) > - 1){
          actionUrl = url;
        }
        var modalInstance = $modal.open({
          templateUrl:'tpl/modal/goods_modal.html',
          controller:'GoodsChoserCtrl',
          backdrop:true,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            },
            actionUrl:function(){
              return actionUrl;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openMusicChoser = function(callback){
        var modalInstance = $modal.open({
          templateUrl:'tpl/modal/music_modal.html',
          controller:'MusicChoserCtrl',
          backdrop:true
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 打开图片上传对话框
       */
      this.openPicUploadDialog = function(callback,
                                          c_mode,u_mode,from){
        var chooseMode = 1;
        if(arguments.length > 1){
          chooseMode = c_mode;
        }
        ;
        var uploadMode = 1;
        if(arguments.length > 2){
          uploadMode = u_mode;
        }
        ;

        var modalInstance = $modal.open({
          templateUrl:'html/common/pic_upload.html',
          controller:'FileUploadCtrl',
          backdrop:false,
          resolve:{
            fileType:function(){
              return "picture";
            },
            action:function(){
              return from;
            },
            chooseMode:function(){
              return chooseMode;
            },
            uploadMode:function(){
              return uploadMode;
            }
          }

        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 打开上传语音对话框
       */
      this.openVoiceUploadDialog = function(callback,
                                            mode,u_mode,action){
        var chooseMode = 1;
        if(arguments.length > 1){
          chooseMode = mode;
        }
        ;
        var uploadMode = 1;
        if(arguments.length > 2){
          uploadMode = u_mode;
        }
        ;
        var modalInstance = $modal.open({
          templateUrl:'tpl/shop/voice_upload.html',
          controller:'FileUploadCtrl',
          backdrop:true,
          resolve:{
            fileType:function(){
              return "voice";
            },
            action:function(){
              return action;
            },
            chooseMode:function(){
              return chooseMode;
            },
            uploadMode:function(){
              return uploadMode;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openGoodsTemplateDialog = function(callback){
        var modalInstance = $modal
        .open({
          templateUrl:'tpl/goods/goods_template_modal.html',
          controller:'GoodsTemplateCtrl',
          backdrop:true
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 打开商品类目树选择对话框
       */
      this.openCategoryTreeDialog = function(callback,id){
        var chooseId = 0;
        if(arguments.length > 1){
          chooseId = id;
        }
        var modalInstance = $modal
        .open({
          templateUrl:'html/modal/category_tree.html',
          controller:'CategoryContrl',
          backdrop:true,
          resolve:{
            chooseId:function(){
              return chooseId;
            },
          }

        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openOrderRemarkDialog = function(callback,obj){
        var modalInstance = $modal
        .open({
          templateUrl:'tpl/order/order_remark_dialog.html',
          controller:'OrderRemarkCtrl',
          backdrop:false,
          size:'sm',
          resolve:{
            order:function(){
              return obj;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };
      /**
       * 打开活动奖励选择对话框
       */
      this.openActivityAwardsDialog = function(callback,rowdata){
        var modalInstance = $modal
        .open({
          templateUrl:'html/marketing/activity_awards_modal.html',
          controller:'ActivityAwardsContrl',
          backdrop:true,
          resolve:{
            rowdata:function(){
              return rowdata;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openRuleDialog = function(callback,activity){
        var modalInstance = $modal.open({
          templateUrl:'html/marketing/activity_rule_edit_modal.html',
          controller:'ActivityRuleEditWindow',
          backdrop:false,
          size:'lg',
          keyboard:false,
          resolve:{
            activity:function(){
              return activity;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 打开活动规则奖励选择对话框
       */
      this.openActivityRuleDialog = function(callback,activity){
        var modalInstance = $modal.open({
          templateUrl:'html/marketing/activity_rule_modal.html',
          controller:'ActivityRuleContrl',
          backdrop:true,
          resolve:{
            activity:function(){
              return activity;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 打开运费模板对话框
       */
      this.openAreaDialog = function(callback,regionRules,valuationRules){
        var modalInstance = $modal.open({
          templateUrl:'tpl/order/area_dialog.html',
          controller:'DeliveryCtrl',
          backdrop:false,
          size:'lg',
          resolve:{
            regionRules:function(){
              return regionRules;
            },
            valuationRules:function(){
              return valuationRules;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 打开商品价格修改对话框
       */
      this.openOrderPriceDialog = function(callback,
                                           order){
        var modalInstance = $modal
        .open({
          templateUrl:'tpl/order/change_price.html',
          controller:'OrderPriceCtrl',
          backdrop:false,
          size:'lg',
          resolve:{
            order:function(){
              return order;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 打开订单发货对话框
       */
      this.openOrderDeliveryDialog = function(callback,
                                              order){
        var modalInstance = $modal
        .open({
          templateUrl:'tpl/order/order_delivery.html',
          controller:'OrderDeliveryCtrl',
          backdrop:false,
          size:'lg',
          resolve:{
            order:function(){
              return order;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 拒绝退款对话框
       */
      this.openRejectRefundDialog = function(callback,
                                             orderSafe){
        var modalInstance = $modal
        .open({
          templateUrl:'html/order/reject_refund.html',
          controller:'OrderRejectRefundCtrl',
          backdrop:false,
          size:'lg',
          resolve:{
            orderSafe:function(){
              return orderSafe;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 同意退款对话框
       */
      this.openAgreeRefundDialog = function(callback,
                                            orderSafe){
        var modalInstance = $modal
        .open({
          templateUrl:'tpl/order/agree_refund.html',
          controller:'OrderAgreeRefundCtrl',
          backdrop:false,
          size:'lg',
          resolve:{
            orderSafe:function(){
              return orderSafe;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 确认收货对话框
       */
      this.openTakeDeliveryDialog = function(callback,
                                             orderSafe){
        var modalInstance = $modal
        .open({
          templateUrl:'tpl/order/refund_take_delivery.html',
          controller:'OrderTakeDeliveryCtrl',
          backdrop:false,
          size:'lg',
          resolve:{
            orderSafe:function(){
              return orderSafe;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openImageTextChoser = function(callback,mode){
        var chooseMode = 1;
        if(arguments.length > 1){
          chooseMode = mode;
        }
        var modalInstance = $modal
        .open({
          templateUrl:'tpl/modal/image_text_modal.html',
          controller:'ImageTextChoserCtrl',
          backdrop:false,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 微信快捷短语对话框
       */
      this.openShortcutWordDialog = function(callback,
                                             obj){
        var modalInstance = $modal
        .open({
          templateUrl:'tpl/weixin/shortcutwords_dialog.html',
          controller:'ShortcutWordCtrl',
          backdrop:false,
          resolve:{
            word:function(){
              return obj;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      /**
       * 微信支付设置对话框
       */
      this.openPaymentSettingDialog = function(callback,
                                               obj){
        var modalInstance = $modal
        .open({
          templateUrl:'tpl/shop/payment_setting_dialog.html',
          controller:'PaymentSettingCtrl',
          backdrop:false,
          resolve:{
            setting:function(){
              return obj;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openFeatureChoser = function(callback,mode,
                                        type){
        var chooseMode = 1;
        if(arguments.length > 1){
          chooseMode = mode;
        }
        var dataType = 'feature';
        if(arguments.length > 2){
          dataType = type;
        }

        var modalInstance = $modal
        .open({
          templateUrl:'tpl/modal/feature_modal.html',
          controller:'FeatureChoserCtrl',
          backdrop:false,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            },
            dataType:function(){
              return dataType;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openGoodsTagChoser = function(callback,mode){
        var chooseMode = 1;
        if(arguments.length > 1){
          chooseMode = mode;
        }
        var modalInstance = $modal
        .open({
          templateUrl:'tpl/modal/goods_tag_modal.html',
          controller:'GoodsTagChoserCtrl',
          backdrop:false,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openComponentChoser = function(callback,mode){
        var chooseMode = 1;
        if(arguments.length > 1){
          chooseMode = mode;
        }
        var modalInstance = $modal
        .open({
          templateUrl:'tpl/modal/component_modal.html',
          controller:'ComponentChoserCtrl',
          backdrop:false,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      //导出对话框
      this.openExport = function(callback,mode){
        var chooseMode = 1;
        if(arguments.length > 1){
          chooseMode = mode;
        }
        var modalInstance = $modal
        .open({
          templateUrl:'tpl/modal/order_export_modal.html',
          controller:'ExportCtrl',
          backdrop:false,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      //代理设置提成比例
      this.openAgentCommissionRate = function(callback,mode){
        var chooseMode = 1;
        if(arguments.length > 1){
          chooseMode = mode;
        }
        var modalInstance = $modal
        .open({
          templateUrl:'html/marketing/agent_commission_rate.html',
          controller:'CommissionRate',
          backdrop:false,
          size:'1g',
          resolve:{
            chooseMode:function(){
              return chooseMode;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };
      //代理编辑代理区域
      this.openAgentArea = function(callback,mode){
        var chooseMode = 1;
        if(arguments.length > 1){
          chooseMode = mode;
        }
        var modalInstance = $modal
        .open({
          templateUrl:'html/marketing/agent_area.html',
          controller:'AgentUpateArea',
          backdrop:false,
          size:'lg',
          resolve:{
            chooseMode:function(){
              return chooseMode;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openAddAgent = function(callback,mode){
        var chooseMode = 1;
        if(arguments.length > 1){
          chooseMode = mode;
        }
        var modalInstance = $modal
        .open({
          templateUrl:'html/marketing/add_agent.html',
          controller:'AddAgent',
          backdrop:false,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openAddPlatformUser = function(callback){
        var chooseMode = 1;// 1=单选，0=复选
        var argArr = Array.prototype.slice.call(arguments);

        var modalInstance = $modal.open({
          templateUrl:'tpl/modal/user_open_permission_modal.html',
          controller:'AddPlatformUserCtrl',
          backdrop:true,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openPermissionList = function(callback,roleId){
        var chooseMode = 1;// 1=单选，0=复选
        var argArr = Array.prototype.slice.call(arguments);

        var modalInstance = $modal.open({
          templateUrl:'tpl/modal/permissions_modal.html',
          controller:'PermissionListCtrl',
          backdrop:true,
          size:'',
          resolve:{
            chooseMode:function(){
              return chooseMode;
            },
            roleId:function(){
              return roleId;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

      this.openRoles = function(callback,userId,type){
        var chooseMode = 1;// 1=单选，0=复选
        var argArr = Array.prototype.slice.call(arguments);

        var modalInstance = $modal.open({
          templateUrl:'tpl/modal/role_modal.html',
          controller:'RoleListCtrl',
          backdrop:true,
          resolve:{
            chooseMode:function(){
              return chooseMode;
            },
            userId:function(){
              return userId;
            },
            type:function(){
              return type;
            }
          }
        });
        modalInstance.result.then(function(items){
          callback(items);
        },function(){
        });
      };

    }]);

/**
 * 活动选择控制器
 */
app.controller('ActivityChoserCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'chooseMode',
  'actionUrl',
  function($scope,$http,$modalInstance,chooseMode,actionUrl){
    $scope.pageData = {};
    $scope.chooseMode = chooseMode;
    $scope.actionUrl = actionUrl;
    $scope.title = "";
    $scope.selected = {};

    $scope.ok = function(){
      console.log($scope.selected);
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){//取消
      $modalInstance.dismiss('cancel');
    };

    $scope.pageChanged = function(){
      $http.post('activity/listActivity',{
        name:$scope.title,
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      }).success(function(resp){
        if(resp){
          $scope.pageData = resp.page;
        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.selectData = function(data){
      $scope.selected = data;
      $scope.ok();
    };

    $scope.pageChanged();

  }]);

/**
 * 优惠券选择控制器
 */
app.controller('CouponChoserCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'chooseMode',
  'actionUrl',
  function($scope,$http,$modalInstance,chooseMode,actionUrl){
    $scope.pageData = {};
    $scope.chooseMode = chooseMode;
    $scope.actionUrl = (actionUrl == undefined?'activityRule/listCoupons'
      :actionUrl);
    $scope.title = "";
    $scope.selected = {};

    $scope.ok = function(){
      console.log($scope.selected);
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){//取消
      $modalInstance.dismiss('cancel');
    };

    $scope.pageChanged = function(){
      $http.post('activityRule/listCoupons',{
        title:$scope.title,
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      }).success(function(resp){
        if(resp){
          $scope.pageData = resp.page;
        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.selectGoods = function(data){
      $scope.selected = data;
      $scope.ok();
    };

    $scope.pageChanged();

  }]);

// 商品类别选择器
app.controller('CategoryContrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'dialogService',
  'chooseId',
  function($scope,$http,$modalInstance,dialogService,chooseId){
    $scope.category_tree = [];
    $scope.category;
    $scope.id = chooseId;
    $scope.treeList = [];
    $scope.treedataTemp = {};
    $scope.treedataTemp.children = [];
    $scope.treedata = [];

    $scope.ok = function(){
      $modalInstance.close($scope.category);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.loadCategorys = function(){
      $http.post('documentCategory/listAll').success(function(resp){
        $.each(resp.data,function(index,d){
          if(! d.parent_id){
            d.parent_id = "0";
          }

          var o = {label:d.name,children:[],id:d.id,parent_id:d.parent_id,removeMark:false,name:d.name};

          $scope.treeList.push(o);
        });

        $scope.createSubTree($scope.treeList,0,$scope.treedataTemp);
        $scope.treedata = $scope.treedataTemp.children;
        if($scope.id){
          $scope.removeById($scope.treedata,$scope.id);
        }
      });
    };

    $scope.removeById = function(tree,id){
      for(var i = 0; i < tree.length; i ++){
        if(tree[i].id == id){
          tree.splice(i,1);
          return;
        }else{
          $scope.removeById(tree[i].children,id);
        }
      }
    }

    $scope.createSubTree = function(domArr,parentId,list){
      for(var i = 0; i < domArr.length; i ++){
        if(domArr[i].removeMark == false){
          if(domArr[i].parent_id == parentId){
            list.children.push(domArr[i]);
            $scope.createSubTree(domArr,domArr[i].id,domArr[i]);
          }
        }
      }
    }

    $scope.loadCategorys();

    $scope.showSelected = function(branch){
      console.log(branch);
      $scope.category = branch;
      $scope.parent_id = branch.id;
    };

    $scope.setCategory = function(){
      $scope.ok();
    };
  }]);

/**
 * 商品选择控制器
 */
app.controller('GoodsChoserCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'chooseMode',
  'actionUrl',
  'actionSelectedGoods',
  function($scope,$http,$modalInstance,chooseMode,actionUrl,actionSelectedGoods){
    $scope.pageData = {};
    $scope.chooseMode = chooseMode;
    $scope.actionUrl = (actionUrl == undefined?'goods/listGoods'
      :actionUrl);
    $scope.title = "";
    $scope.selected = [];
    $scope.goods = {};
    $scope.goods.single = {};

    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.pageChanged = function(){
      var str;
      if(actionSelectedGoods && actionSelectedGoods.length > 0){
        str = "";
        $.each(actionSelectedGoods,function(i,a){
          str = str + a.id + ",";
        });
        str = str.substring(0,str.length - 1);
      }

      $http.post($scope.actionUrl,{
        ids:str,
        title:$scope.title,
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      }).success(function(page){
        console.log(page);
        if(page){
          $scope.pageData = page;
        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.checkAll = function(){// 全选
      var flag = ! $scope.isCheckedAll();
      $.each($scope.pageData.list,function(index,ele){
        ele.chk = flag;
        if(flag){
          $scope.selected.push(ele);
        }
      });
      if(! flag){
        $scope.selected = [];
      }
    };

    $scope.isCheckedAll = function(){
      var flag = true;
      if(! $scope.pageData.list){
        return false;
      }
      $.each($scope.pageData.list,function(index,ele){
        if(! ele.chk){
          flag = false;
          return false;
        }
      });
      return flag;
    };

    $scope.setCheckedGoods = function(){
      $.each($scope.pageData.list,function(index,ele){
        if(ele.chk){
          $scope.selected.push(ele);
        }
      });
    };

    $scope.setGoods = function(data){
      $scope.goods = data;
      $scope.selected = [];
      $scope.selected.push($scope.goods);
      $scope.ok();
    };

    $scope.selectGoods = function(){
      if($scope.chooseMode != 1){
        $scope.selected = [];
        $scope.setCheckedGoods();
      }else{
        $scope.selected.push($scope.goods.single);
      }
      if($scope.selected.length == 0){
        alert("请选择商品!");
      }else{
        $scope.ok();
      }
    };

    $scope.pageChanged();

  }]);

app.controller('MusicChoserCtrl',['$scope','$http','$modalInstance',
  function($scope,$http,$modalInstance){
    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };
  }]);

// 文件上传控制器
app.controller('FileUploadCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'FileUploader',
  'dialogService',
  'fileType',
  'action',
  'chooseMode',
  'uploadMode',
  function($scope,$http,$modalInstance,FileUploader,dialogService,
           fileType,action,chooseMode,uploadMode){

    $scope.chooseMode = chooseMode;
    $scope.uploadMode = uploadMode;
    $scope.fileType = fileType;
    $scope.from = action;
    $scope.pageData = {};
    $scope.fileName = "";
    $scope.selected = [];
    $scope.network_url = "";
    $scope.curTab = (action == undefined?1:2);

    var uploader = $scope.uploader = new FileUploader({
      url:'res/uploadFile?fileType=' + $scope.fileType,
      autoUpload:false
    });

    uploader.onAfterAddingFile = function(fileItem){
      console.log(fileItem);
      if(fileItem.file.size > 1024 * 1024){
        layer.alert("文件" + fileItem.file.name + "太大，请选择1MB以内的图片文件!");
        fileItem.remove();
      }
    };

    uploader.onCompleteItem = function(fileItem,response,status,headers){
      console.info('onCompleteItem',fileItem,response,status,headers);
      if(response.file){
        var d = response.file;
        $scope.selected.push(d);
      }else{
        alert(response.message);
      }
    };

    uploader.onCompleteAll = function(){
      console.info('onCompleteAll');
      $scope.ok();
    };

    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.fetchNetworkUrl = function(){
      $http.post('resourceFile/fetchNetworkPic',{
        network_url:$scope.network_url,
        fileType:$scope.fileType
      }).success(function(response){
        if(response.result == "success"){
          $scope.selected.push(response.file);
          $scope.ok();
        }else{
          alert(response.message);
        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.pageChanged = function(){
      $http.post('resourceFile/listResourceFile',{
        fileName:$scope.fileName,
        fileType:$scope.fileType,
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      }).success(function(page){
        $scope.pageData = page;
        $scope.curTab = 1;
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.upload = function(){
      $scope.curTab = 2;
      $scope.selected = [];
    };

    $scope.selectPic = function(data){
      if($scope.selected.indexOf(data) > - 1){
        $scope.selected.splice($scope.selected.indexOf(data),1);
        $scope.selected.checked = false;
      }else{
        $scope.selected.push(data);
        $scope.selected.checked = true;
      }
      if($scope.chooseMode == 1 && $scope.selected.length > 0){
        $scope.ok();
      }
    };

    if($scope.curTab == 1){
      $scope.selected = [];
      $scope.pageChanged();
    }
    ;

  }]);

app.controller('GoodsTemplateCtrl',['$state','$scope','$http',
  '$modalInstance',function($state,$scope,$http,$modalInstance){
    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.confirm = function(id){
      var item = {
        id:id
      };
      $modalInstance.close(item);
    };

    $scope.toEdit = function(e){
      $scope.cancel();
      $state.go("app.goods_page_tpl_edit",{
        id:e
      });
    };

    $scope.pageData = {};
    // 页面改变事件
    $scope.pageChanged = function(){
      $http.post('goodsTemplate',{
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      }).success(function(page){
        $scope.pageData = page;
      }).error(function(e){
        console.error(e);
      })
    };

    // 页面初始化数据
    $scope.pageChanged();
  }

]);

app.controller('OrderRemarkCtrl',['$state','$scope','$http','order',
  '$modalInstance',
  function($state,$scope,$http,order,$modalInstance){
    $scope.item = order;
    // $scope.item.remark = order.remark;
    $scope.item.orderId = order.id;

    $scope.ok = function(){
      $modalInstance.close($scope.item);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };
  }

]);

app.controller(
  'DeliveryCtrl',
  [
    '$state',
    '$scope',
    '$http',
    '$modalInstance',
    'regionRules',
    'valuationRules',
    function($state,$scope,$http,$modalInstance,
             regionRules,valuationRules){
      $scope.item = {};
      $scope.areaList = {};
      $scope.getAreaList = function(parentId,parentLevel){
        $http
        .post('area/getSubArea',{
          parentId:parentId
        })
        .success(
          function(data){
            if(parentId == '0'){
              $scope.areaList = data.areaList;
              // 设置显示隐藏
              // $scope.setSelectFlag($scope.areaList,
              // false);
              $scope
              .setDisplayFlag(
                $scope.areaList,
                true,0);
              $scope
              .setDisplayFlag(
                $scope.areaList,
                true,1);
            }else{
              var area = $scope
              .findAreaById(
                parentId,
                $scope.areaList);
              area.childList = data.areaList;
              $scope.setSelectFlag(
                area,
                area.select);
              $scope.setSelected(
                area,
                area.selected);
              $scope.setDisplayFlag(
                area.childList,
                true,0);
              $scope.setDisplayFlag(
                area.childList,
                true,1);
            }
          }).error(function(e){
          console.error(e);
        })
      };

      $scope.isSelected = function(item){
        return $scope.checkSelectedState(item);
      };

      $scope.isDisplay = function(item){
        // return $scope.checkDisplayState(item);
        return item.display;
      };

      $scope.checkDisplayState = function(item){
        var b = false;
        if(item.display){
          b = true;
        }
        if(item.childList && item.childList.length > 0){
          $.each(item.childList,function(index,i){
            var r = $scope.checkDisplayState(i);
            if(r){
              b = true;
              return false;
            }
          });
        }
        return b;
      };

      $scope.checkSelectedState = function(item){
        var b = false;
        if(item.selected){
          b = true;
        }
        if(item.childList && item.childList.length > 0){
          $.each(item.childList,function(index,i){
            var r = $scope.checkSelectedState(i);
            if(r){
              b = true;
              return false;
            }
          });
        }
        return b;
      };

      $scope.haveNotSelectedState = function(item){
        var b = true;
        if(item.selected){
          b = false;
        }
        if(item.childList && item.childList.length > 0){
          var have = true;
          $.each(item.childList,function(index,i){
            have = $scope.haveNotSelectedState(i);
            if(have){
              b = true;
              return false;
            }
          });
          if(b && ! have){
            b = false;
          }
        }
        return b;
      };

      $scope.haveNotSelected = function(item){
        return $scope.haveNotSelectedState(item);
      };

      $scope.isSelected = function(item){
        return $scope.checkSelectedState(item);
      };

      $scope.isDisplay = function(item){
        return item.display;
      };

      $scope.isDisplay2 = function(item){
        return item.display2;
      };

      $scope.checkSelect = function(item){
        return $scope.checkSelectState(item);
      };

      $scope.checkSelectState = function(item){
        var b = item.select;
        if(item.childList && item.childList.length > 0){
          b = true;
          $.each(item.childList,function(index,i){
            var r = $scope.checkSelectState(i);
            if(! r){
              b = false;
              return false;
            }
          });
        }
        return b;
      };

      // 设置选中状态
      $scope.setSubAreaSelect = function(list,select){
        if(list){
          $.each(list,function(index,item){
            item.select = select;
            if(item.childList){
              $scope.setSubAreaSelect(
                item.childList,select);
            }
          });
        }
      };

      $scope.setSelectFlag = function(item,flag){
        item.select = flag;
        if(item.childList){
          $.each(item.childList,
            function(index,item){
              $scope
              .setSelectFlag(item,
                flag);
            });
        }
      };

      // 单个area点击事件
      $scope.clickArea = function(item,e){
        $scope.setSelectFlag(item,! item.select);
      };

      // 删除area事件
      $scope.removeArea = function(){
        // 删除当前area及其子area
        // 左侧显示该area及其子area，并设置为选中状态
      };

      // 添加按钮事件
      $scope.addArea = function(){
        // 将选中的area拷贝至右侧
        // 将选中的area隐藏
        $.each($scope.areaList,function(index,item){
          $scope.setSelected(item);
        });
      };

      // 将选中的area隐藏
      $scope.setSelected = function(item){
        if(item.select == true){
          item.selected = true;
          item.display2 = true;
        }
        if(item.childList){
          $.each(item.childList,
            function(index,item){
              $scope.setSelected(item);
            });
        }
      };

      $scope.setDisplayFlag = function(areaList,display,
                                       type){
        if(areaList){
          $.each(areaList,function(index,item){
            if(type == 1){
              item.display2 = display;
            }else{
              item.display = display;
            }
          });
        }
      };

      // 伸缩按钮点击
      $scope.toggleBtn = function(item,e){
        // 展开、隐藏子area
        e.stopPropagation();
        if(e.currentTarget.innerText == '+'){
          e.currentTarget.innerText = '-';
          if(! item.childList){
            $scope.getAreaList(item.id,item.level);
          }else{
            $scope.setDisplayFlag(item.childList,
              true,0);
          }
        }else{
          e.currentTarget.innerText = '+';
          $scope.setDisplayFlag(item.childList,
            false,0);
        }
      };

      $scope.toggle2 = function(item,e){
        // 展开、隐藏子area
        e.stopPropagation();
        if(e.currentTarget.innerText == '+'){
          e.currentTarget.innerText = '-';
          if(! item.childList){
            $scope.getAreaList(item.id,item.level);
          }else{
            $scope.setDisplayFlag(item.childList,
              true,1);
          }
        }else{
          e.currentTarget.innerText = '+';
          $scope.setDisplayFlag(item.childList,
            false,1);
        }
      };

      // 根据id获取area
      $scope.findAreaById = function(id,list){
        var area = null;
        $.each(list,function(index,item){
          if(item.id == id){
            area = item;
            return false;
          }
          if(item.id != id && item.childList){
            area = $scope.findAreaById(id,
              item.childList);
            if(area != null){
              return false;
            }
          }
        });
        return area;
      };

      // 初始化省份
      $scope.getAreaList('0',0);

      $scope.getSelected = function(arr,item){
        if(! $scope.haveNotSelectedState(item)){
          arr.push({
            id:item.id,
            parent_id:item.parent_id,
            name:item.name,
            level:item.level
          })
        }else if($scope.isSelected(item)
          && item.childList
          && item.childList.length > 0){
          // 取子对像
          var list = [];
          $.each(item.childList,function(index,i){
            $scope.getSelected(list,i);
          });
          if(list.length > 0){
            var p = {
              id:item.id,
              parent_id:item.parent_id,
              name:item.name,
              level:item.level
            };
            p.list = list;
            arr.push(p);
          }
        }
      };

      $scope.ok = function(){
        // 将选中的areaJson返回
        var arr = [];
        $.each($scope.areaList,function(index,item){
          $scope.getSelected(arr,item);
        });
        console.log(arr);
        $modalInstance.close(arr);
      };

      $scope.cancel = function(){
        $modalInstance.dismiss('cancel');
      };

    }]);

/**
 * 商品价格修改控制器
 */
app.controller('OrderPriceCtrl',[
  '$state',
  '$scope',
  '$http',
  'order',
  '$modalInstance',
  function($state,$scope,$http,order,$modalInstance){
    $scope.order = order;
    var orderCopy = $.extend(true,{},order);

    $scope.ok = function(){
      $modalInstance.close($scope.order);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.setPostageZero = function(item){
      item.postage = 0.00;
      $scope.calRealPrice();
    };

    $scope.calRealPrice = function(){
      var adjust_money = 0;
      var adjust_postage = 0;

      $.each($scope.order.items,function(i,e){
        e.adjust_postage = parseFloat(orderCopy.items[i].postage) - parseFloat(e.postage);//更改订单项涨价邮费金额
        e.need_pay_money = parseFloat(e.need_pay_money) + parseFloat(e.adjust_postage) + parseFloat(e.adjust_money);

        adjust_postage = adjust_postage + parseFloat(e.adjust_postage);
        adjust_money = adjust_money + parseFloat(e.adjust_money);
      });

      $scope.order.postage = parseFloat(adjust_postage).toFixed(2);
      $scope.order.adjust_money = parseFloat(adjust_money).toFixed(2);
      $scope.order.need_pay_money = parseFloat($scope.order.total_money) + parseFloat($scope.order.postage) + parseFloat($scope.order.adjust_money);
    };

    $scope.updateOrderPrice = function(){
      $modalInstance.close($scope.order);
    };

  }]);

/**
 * 订单发货控制器
 */
app.controller('OrderDeliveryCtrl',[
  '$state',
  '$scope',
  '$http',
  'order',
  '$modalInstance',
  function($state,$scope,$http,order,$modalInstance){
    $scope.order = order;
    $scope.orderItemIds = [];
    $scope.expresses = "";
    $scope.express_id = "";
    $scope.express_no = "";
    $scope.item_send_type = 1;

    $scope.ok = function(){
      $modalInstance.close(data);
    };

    $scope.saveDelivery = function(){
      $scope.getCheckIds();
      if($scope.item_send_type == 1){
        if($scope.express_id == ""
          || $scope.express_no.length == 0
          || $scope.orderItemIds.length == 0){
          alert("请选择发货信息，物流公司，并把快递单填写完整!");
        }else{
          var data = $.extend({
            item_send_type:$scope.item_send_type,
            orderItemIds:$scope.orderItemIds.join(","),
            express_id:$scope.express_id,
            express_no:$scope.express_no
          },$scope.order);
          $modalInstance.close(data);
        }
      }else{
        var data = $.extend({
          item_send_type:$scope.item_send_type,
          orderItemIds:$scope.orderItemIds.join(","),
          express_id:$scope.express_id,
          express_no:$scope.express_no
        },$scope.order);
        $modalInstance.close(data);
      }
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.checkAll = function(){// 全选
      var flag = ! $scope.isCheckedAll();
      $.each($scope.order.items,function(index,ele){
        ele.chk = flag;
        if(flag){
          $scope.orderItemIds.push(ele.id);
        }
      });
      if(! flag){
        $scope.orderItemIds = [];
      }
    };

    $scope.isCheckedAll = function(){
      var flag = true;
      if(! $scope.order.items){
        return false;
      }
      $.each($scope.order.items,function(index,ele){
        if(! ele.chk){
          flag = false;
          return false;
        }
      });
      return flag;
    };

    $scope.getCheckIds = function(){
      $scope.orderItemIds = [];
      $.each($scope.order.items,function(index,ele){
        if(ele.chk){
          $scope.orderItemIds.push(ele.id);
        }
      });
    };

    $scope.getAllExpress = function(){
      $http.post('express/listAllExpress').success(function(data){
        if(data){
          $scope.expresses = data;
        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.getAllExpress();
  }]);

app.controller('OrderRejectRefundCtrl',[
  '$state',
  '$scope',
  '$http',
  'orderSafe',
  '$modalInstance',
  function($state,$scope,$http,orderSafe,$modalInstance){
    $scope.orderSafe = orderSafe;
    $scope.reject_reason = "";
    $scope.ok = function(){
      $modalInstance.close($scope.orderSafe);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.rejectRefund = function(){
      var data = $.extend({
        reject_reason:$scope.reject_reason
      },$scope.orderSafe);
      $http.post('order/rejectRefund',data).success(
        function(data){
          alert(data.message);
          if(data.result == "success"){
            $modalInstance.close($scope.orderSafe);
          }
        }).error(function(e){
        console.error(e);
      })
    };

  }]);

app.controller('OrderAgreeRefundCtrl',[
  '$state',
  '$scope',
  '$http',
  'orderSafe',
  '$modalInstance',
  function($state,$scope,$http,orderSafe,$modalInstance){
    $scope.orderSafe = orderSafe;
    $scope.ok = function(){
      $modalInstance.close($scope.orderSafe);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.agreeRefund = function(){
      $http.post('orderSafe/agreeSafe',$scope.orderSafe).success(
        function(data){
          alert(data.message);
          if(data.result == "success"){
            $modalInstance.close($scope.orderSafe);
          }
        }).error(function(e){
        console.error(e);
      })
    };

  }]);

app.controller('OrderTakeDeliveryCtrl',[
  '$state',
  '$scope',
  '$http',
  'orderSafe',
  '$modalInstance',
  function($state,$scope,$http,orderSafe,$modalInstance){
    $scope.orderSafe = orderSafe;
    $scope.ok = function(){
      $modalInstance.close($scope.orderSafe);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.takeDelivery = function(){
      $http.post('orderSafe/takeDelivery',$scope.orderSafe).success(
        function(data){
          alert(data.message);
          if(data.result == "success"){
            $modalInstance.close($scope.orderSafe);
          }
        }).error(function(e){
        console.error(e);
      })
    };
  }]);

app.controller('ShortcutWordCtrl',['$state','$scope','$http','word',
  '$modalInstance',
  function($state,$scope,$http,word,$modalInstance){
    $scope.item = word;
    $scope.ok = function(){
      $modalInstance.close($scope.item);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };
  }]);

app.controller('PaymentSettingCtrl',['$state','$scope','$http','setting',
  '$modalInstance',
  function($state,$scope,$http,setting,$modalInstance){
    $scope.item = setting;
    $scope.ok = function(subType){
      if(subType == 1){
        $scope.item.subinfo = {};
      }
      $scope.item.subType = subType;
      $modalInstance.close($scope.item);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };
  }

]);

app.controller('ImageTextChoserCtrl',['$scope','$http','$modalInstance',
  'chooseMode',function($scope,$http,$modalInstance,chooseMode){
    $scope.q = {
      type:- 1
    };
    $scope.selected = [];
    $scope.chooseModel = chooseMode;
    // 列表数据
    $scope.pageData = {
      list:[],
      pageNumber:1,
      pageSize:3,
      totalPage:0,
      totalRow:0
    };

    $scope.pageChanged = function(){
      var d = {
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      };
      if($scope.q.type != - 1){
        d = $.extend(d,$scope.q);
      }
      $http.post("wx/news/list",d).success(function(resp){
        $.each(resp.page.list,function(i,d){
          if(d.items){
            d.items = angular.fromJson(d.items);
          }
        });
        $scope.pageData = resp.page;
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.choose = function(item){
      if(item.checked){
        // 从选择表中移除
        $scope.selected.splice($scope.selected.indexOf(item),1);
        item.checked = false;
      }else{
        $scope.selected.push(item);
        item.checked = true;
      }
      if($scope.chooseModel == 1 && $scope.selected.length > 0){
        $scope.ok();
      }
    };

    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.pageChanged();

  }]);

app.controller('FeatureChoserCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'chooseMode',
  'dataType',
  function($scope,$http,$modalInstance,chooseMode,dataType){
    $scope.q = {
      keyword:null
    };
    $scope.selected = [];
    $scope.chooseModel = chooseMode;
    $scope.data_type = ! dataType?'feature':dataType;
    // 列表数据
    $scope.pageData = {
      list:[],
      pageNumber:1,
      pageSize:10,
      totalPage:0,
      totalRow:0
    };

    $scope.doSearch = function(){
      $scope.pageChanged();
    };

    $scope.changeType = function(type){
      if($scope.data_type != type){
        $scope.data_type = type;
        $scope.selected = [];
        $scope.pageData.pageNumber = 1;
        $scope.q.keyword = null;
        $scope.pageChanged();
      }
    };

    $scope.pageChanged = function(){
      var d = {
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      };
      if($scope.data_type == 'category'){
        if($scope.q.keyword){
          d.shopPageCategoryName = $scope.q.keyword;
        }
        $http.post('shopPageCategory/listShopPageCategory',d)
        .success(function(page){
          $scope.pageData = page;
        }).error(function(e){
          console.error(e);
        })
      }else{
        if($scope.q.keyword){
          d.shopPageTitle = $scope.q.keyword;
        }
        $http.post('shopPage/listShopPage',d).success(
          function(page){
            console.log(page);
            $scope.pageData = page;
          }).error(function(e){
          console.error(e);
        })
      }
    };

    $scope.choose = function(item){
      if(item.checked){
        // 从选择表中移除
        $scope.selected.splice($scope.selected.indexOf(item),1);
        item.checked = false;
      }else{
        $scope.selected.push(item);
        item.checked = true;
      }
      if($scope.chooseModel == 1 && $scope.selected.length > 0){
        $scope.ok();
      }
    };

    $scope.ok = function(){
      $.each($scope.selected,function(i,d){
        d.data_type = $scope.data_type;
      });
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.pageChanged();

  }]);

app.controller('GoodsTagChoserCtrl',['$scope','$http','$modalInstance',
  'chooseMode',function($scope,$http,$modalInstance,chooseMode){
    $scope.q = {
      keyword:null
    };
    $scope.selected = [];
    $scope.chooseModel = chooseMode;
    // 列表数据
    $scope.pageData = {
      list:[],
      pageNumber:1,
      pageSize:10,
      totalPage:0,
      totalRow:0
    };

    $scope.doSearch = function(){
      $scope.pageChanged();
    };

    $scope.pageChanged = function(){
      var d = {
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      };
      if($scope.q.keyword){
        d.group_name = $scope.q.keyword;
      }
      $http.post('goodsTags',d).success(function(page){
        $scope.pageData = page;
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.choose = function(item){
      if(item.checked){
        // 从选择表中移除
        $scope.selected.splice($scope.selected.indexOf(item),1);
        item.checked = false;
      }else{
        $scope.selected.push(item);
        item.checked = true;
      }
      if($scope.chooseModel == 1 && $scope.selected.length > 0){
        $scope.ok();
      }
    };

    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.pageChanged();

  }]);

app.controller('ComponentChoserCtrl',['$scope','$http','$modalInstance',
  'chooseMode',function($scope,$http,$modalInstance,chooseMode){
    $scope.q = {
      keyword:null
    };
    $scope.selected = [];
    $scope.chooseModel = chooseMode;
    // 列表数据
    $scope.pageData = {
      list:[],
      pageNumber:1,
      pageSize:10,
      totalPage:0,
      totalRow:0
    };

    $scope.doSearch = function(){
      $scope.pageChanged();
    };

    $scope.pageChanged = function(){
      var d = {
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      };
      if($scope.q.keyword){
        d.tplName = $scope.q.keyword;
      }
      $http.post('shopTpl/listShopTpl',d).success(function(page){
        $scope.pageData = page;
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.choose = function(item){
      if(item.checked){
        // 从选择表中移除
        $scope.selected.splice($scope.selected.indexOf(item),1);
        item.checked = false;
      }else{
        $scope.selected.push(item);
        item.checked = true;
      }
      if($scope.chooseModel == 1 && $scope.selected.length > 0){
        $scope.ok();
      }
    };

    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.pageChanged();

  }]);
app.controller('ActivityAwardsContrl',['$state','$scope','rowdata','$http','notifyService',
  '$modalInstance',function($state,$scope,rowdata,$http,notifyService,$modalInstance){
    $scope.money = 0;
    $scope.smsCode = '';

    $scope.ids = [];
    // 列表数据
    $scope.pageData = {
      list:[],
      pageNumber:1,
      pageSize:10,
      totalPage:0,
      totalRow:0
    };

    $scope.getSMSCode = function(){
      if($scope.money > 0){
        var seed = 60;
        $("#btn_sms").attr("disabled","true");
        $.post("activity/getSMSCode",{money:$scope.money,userName:rowdata.nickname,tplId:'18067'},
          function(data){
            if(data.result == "success"){
              notifyService.info('您的短信验证码已发送!');
            }else if(data.result == "fail"){
              notifyService.info("短信发送失败！");
              $("#btn_sms").removeAttr("disabled");
              return;
            }else{
              notifyService.info('短信发送失败，请稍后再试!');
              $("#btn_sms").removeAttr("disabled");
              return;
            }
            var seed = 30;
            var timer;
            timer = setInterval(function setSeed(){
              if(seed > 0){
                $("#btn_sms").text(seed + "s后重新获取");
                seed --;
              }else{
                $("#btn_sms").removeAttr("disabled");
                $("#btn_sms").text("获取");
                seed = 30;
                clearInterval(timer);
              }
            },1000);
          });
      }else{
        notifyService.info('请填写奖励金额','center');
      }

    }

    $scope.ok = function(){
      console.info("$scope.ok");
      $modalInstance.dismiss('cancel');
    };

    $scope.post = function(){
      $scope.getCheckIds();
      $modalInstance.close($scope.ids);
    };

    $scope.cancel = function(){
      console.info("$scope.cancel");
      $modalInstance.dismiss('cancel');
    };

    $scope.doGenerator = function(){
      $http.post('activity/sendMoney',{
        userName:rowdata.nickname,
        userId:rowdata.user_id,
        money:$scope.money,
        smsCode:$scope.smsCode,
        activityId:rowdata.activity_id,
        cycle:rowdata.cycle,
        userMobile:rowdata.mobile
      }).success(function(data){
        if(data.result == 'success'){
          notifyService.info(data.message,'center');
          $modalInstance.close();
        }else{
          notifyService.info(data.message,'center');
        }
      });
    }
  }]);

app.controller('ActivityRuleContrl',['$state','$scope','activity','$http',
  '$modalInstance',function($state,$scope,activity,$http,$modalInstance){
    // 列表数据
    $scope.pageData = {
      list:[],
      pageNumber:1,
      pageSize:10,
      totalPage:0,
      totalRow:0
    };

    $scope.ids = [];

    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.isCheckedAll = function(){
      var flag = true;
      if(! $scope.pageData.list){
        return false;
      }
      $.each($scope.pageData.list,function(index,ele){
        if(! ele.chk){
          flag = false;
          return false;
        }
      });
      return flag;
    };

    $scope.checkAll = function(){// 全选
      var flag = ! $scope.isCheckedAll();
      console.info("checkAll" + flag);
      $.each($scope.pageData.list,function(index,ele){
        ele.chk = flag;
        if(flag){
          $scope.ids.push(ele.id);
        }
      });
      if(! flag){
        $scope.ids = [];
      }
    };

    $scope.getCheckIds = function(){
      $scope.ids = [];
      $.each($scope.pageData.list,function(index,ele){
        if(ele.chk){
          $scope.ids.push(ele.id);
        }
      });
    };

    var d = {
      id:activity.id,
      pageNumber:$scope.pageData.pageNumber,
      pageSize:$scope.pageData.pageSize,
      type:1
    };

    $scope.loadAwards = function(){
      $http.post("activityRule/listActivityRules",d).success(
        function(data){
          if(data){
            $scope.pageData = data;
            if($scope.pageData.totalRow > 0){
              $.each($scope.pageData.list,function(i,k){
                var text = angular.fromJson(k.prize);
                k.context = text.name;
              })
            }
          }else{
            alert("数据加载失败!");
          }
        }).error(function(e){
        console.error(e);
      });
    };

    $scope.loadAwards();
  }

]);

app.controller('ActivityRuleEditWindow',['$scope','$http','$state','$stateParams','activity','dialogService','$modalInstance','$compile','notifyService',
  function($scope,$http,$state,$stateParams,activity,dialogService,$modalInstance,$compile,notifyService){
    $scope.data = {};
    $scope.selectedData;
    $scope.selectedActivity;
    $scope.distribution = false;

    $scope.loadRule = function(){
      if(activity.ruleId){
        $http.post('activityRule/getActivityRule',{id:activity.ruleId})
        .success(
          function(response){
            if(response && response.result == "success"){
              $scope.data = response.rule;
              if($scope.data.prize_type == 8){
                $scope.distribution = true;
              }else{
                $scope.selectedData = angular.fromJson($scope.data.prize);
              }
              if($scope.data.extr_content){
                $scope.data.extr_content = angular.fromJson($scope.data.extr_content);
              }
            }
          })
        .error(function(e){
          console.error(e);
        });
      }else{
        $scope.data.rule_type = 0;
        $scope.data.extr_content = {};
        //$scope.data.extr_content.bonus_profit_percent = 0.01;
        //$scope.data.extr_content.ranking_fx_level = 1;
        //$scope.data.extr_content.fx_level = 1;
      }
    };

    $scope.selectData = function(data){
      if(data.prize_type == '1' || data.prize_type == '2'){
        dialogService.openActivityCouponChoser(function(data){
          $scope.selectedData = data;
        },0,0,activity,data);
      }else{
        alert("未开发");
      }
    }

    $scope.activitySelect = function(){
      dialogService.openActivityChoser(function(data){
        $scope.selectedActivity = data;
      },0);
    }

    $scope.ok = function(){
      if($scope.selectedData){
        var prize = angular.toJson($scope.selectedData);
        $scope.data.prize = prize + "";
      }
      $scope.data.activity_id = activity.id;
      // if($scope.data.name == null || $scope.data.receive_type == null||
      // $scope.data.rewards_object == null||
      // 	$scope.data.prize_type == null){
      // 	alert('表单数据不完整 请填写完整再提交');
      // 	return ;
      // }
      if($scope.data.extr_content){
        if($scope.data.extr_content.billing_dividend_min && $scope.data.extr_content.billing_dividend_max){
          if($scope.data.extr_content.billing_dividend_min > $scope.data.extr_content.billing_dividend_max){
            alert('结算分红参数最小值不能大于最大值');
            return;
          }
        }
        if($scope.data.extr_content.billing_places_min && $scope.data.extr_content.billing_places_max){
          if($scope.data.extr_content.billing_places_min > $scope.data.extr_content.billing_places_max){
            alert('名额结算参数最小值不能大于最大值');
            return;
          }
        }
      }
      $modalInstance.close($scope.data);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.showHidden = function(){
      if($scope.data.prize_type == 8){
        $scope.distribution = true;
      }else{
        $scope.distribution = false;
      }
    }

    $scope.loadRule();

  }
]);

/**
 * 活动优惠券选择控制器
 */
app.controller('ActivityCouponChoserCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'activity',
  'rule',
  'chooseMode',
  'actionUrl',
  function($scope,$http,$modalInstance,activity,rule,chooseMode,actionUrl){
    $scope.list = {};
    $scope.chooseMode = chooseMode;
    $scope.actionUrl = (actionUrl == undefined?'activityRule/listCoupons'
      :actionUrl);
    $scope.title = "";
    $scope.selected = {};

    $scope.ok = function(){
      console.log($scope.selected);
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){//取消
      $modalInstance.dismiss('cancel');
    };
    var type = rule.type = 2?2:1;
    var d = {'type':rule.prize_type,'activityId':activity.id};

    $scope.pageChanged = function(){
      $http.post('activityRule/getActivityPrizes',d).success(function(resp){
        if(resp){
          $scope.list = resp;
        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.selectGoods = function(data){
      $scope.selected = data;
      $scope.ok();
    };

    $scope.pageChanged();

  }]);

/**
 * 供应商选择控制器
 */
app.controller('SupplierChoserCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'chooseMode',
  'actionUrl',
  'couponId',
  function($scope,$http,$modalInstance,chooseMode,actionUrl,couponId){
    $scope.pageData = {};
    $scope.chooseMode = 2;
    $scope.actionUrl = (actionUrl == undefined?'goods/listGoods'
      :actionUrl);
    $scope.title = "";
    $scope.selected = [];
    $scope.goods = {};
    $scope.goods.single = {};
    $scope.couponId = couponId;
    $scope.sArray = [];

    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.pageChanged = function(){
      if($scope.pageData.list){
        $.each($scope.pageData.list,function(index,ele){
          if(ele.chk){
            $scope.selected.push(ele);
          }
        });
      }
      $http.post("coupon/getPageSupplier",{
        title:$scope.title,
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
        couponId:$scope.couponId
      }).success(function(resp){
        if(resp){
          console.log(resp);
          $scope.sArray = resp.sArray;
          $scope.pageData = resp.page;
          $.each($scope.pageData.list,function(i,p){
            $.each($scope.sArray,function(i1,userId){
              if(p.sid == userId){
                p.chk = true;
              }
            });
          });

        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.checkAll = function(){// 全选
      var flag = ! $scope.isCheckedAll();
      $.each($scope.pageData.list,function(index,ele){
        ele.chk = flag;
        if(flag){
          $scope.selected.push(ele);
        }
      });
      if(! flag){
        $scope.selected = [];
      }
    };

    $scope.isCheckedAll = function(){
      var flag = true;
      if(! $scope.pageData.list){
        return false;
      }
      $.each($scope.pageData.list,function(index,ele){
        if(! ele.chk){
          flag = false;
          return false;
        }
      });
      return flag;
    };

    $scope.setCheckedGoods = function(){
      $.each($scope.pageData.list,function(index,ele){
        if(ele.chk){
          $scope.selected.push(ele);
        }
      });
    };

    $scope.setGoods = function(data){
      $scope.goods = data;
      $scope.selected = [];
      $scope.selected.push($scope.goods);
      $scope.ok();
    };

    $scope.selectGoods = function(){
      if($scope.chooseMode != 1){
        $scope.setCheckedGoods();
      }else{
        $scope.selected.push($scope.goods.single);
      }
      if($scope.selected.length == 0){
        alert("请选择商品!");
      }else{
        $scope.ok();
      }
    };

    $scope.pageChanged();

  }]);

/**
 * 会员选择控制器
 */
app.controller('MemberChoserCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'chooseMode',
  'actionUrl',
  'couponId',
  function($scope,$http,$modalInstance,chooseMode,actionUrl,couponId){
    $scope.pageData = {};
    $scope.chooseMode = 2;
    $scope.actionUrl = (actionUrl == undefined?'goods/listGoods'
      :actionUrl);
    $scope.title = "";
    $scope.selected = [];
    $scope.goods = {};
    $scope.goods.single = {};
    $scope.couponId = couponId;
    $scope.sArray = [];

    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.pageChanged = function(){
      if($scope.pageData.list){
        $.each($scope.pageData.list,function(index,ele){
          if(ele.chk){
            $scope.selected.push(ele);
          }
        });
      }
      $http.post("coupon/getPageMember",{
        title:$scope.title,
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
        couponId:$scope.couponId
      }).success(function(resp){
        if(resp){
          console.log(resp);
          $scope.sArray = resp.sArray;
          $scope.pageData = resp.page;
          $.each($scope.pageData.list,function(i,p){
            $.each($scope.sArray,function(i1,userId){
              if(p.id == userId){
                p.chk = true;
              }
            });
          });

        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.checkAll = function(){// 全选
      var flag = ! $scope.isCheckedAll();
      $.each($scope.pageData.list,function(index,ele){
        ele.chk = flag;
        if(flag){
          $scope.selected.push(ele);
        }
      });
      if(! flag){
        $scope.selected = [];
      }
    };

    $scope.isCheckedAll = function(){
      var flag = true;
      if(! $scope.pageData.list){
        return false;
      }
      $.each($scope.pageData.list,function(index,ele){
        if(! ele.chk){
          flag = false;
          return false;
        }
      });
      return flag;
    };

    $scope.setCheckedGoods = function(){
      $.each($scope.pageData.list,function(index,ele){
        if(ele.chk){
          $scope.selected.push(ele);
        }
      });
    };

    $scope.setGoods = function(data){
      $scope.goods = data;
      $scope.selected = [];
      $scope.selected.push($scope.goods);
      $scope.ok();
    };

    $scope.selectGoods = function(){
      if($scope.chooseMode != 1){
        $scope.setCheckedGoods();
      }else{
        $scope.selected.push($scope.goods.single);
      }
      if($scope.selected.length == 0){
        alert("请选择商品!");
      }else{
        $scope.ok();
      }
    };

    $scope.pageChanged();

  }]);

/**
 * 活动选择控制器
 */
app.controller('ActivityChoserCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'chooseMode',
  'actionUrl',
  function($scope,$http,$modalInstance,chooseMode,actionUrl){
    $scope.pageData = {};
    $scope.chooseMode = chooseMode;
    $scope.actionUrl = (actionUrl == undefined?'activityRule/listCoupons'
      :actionUrl);
    $scope.title = "";
    $scope.selected = {};

    $scope.ok = function(){
      console.log($scope.selected);
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){//取消
      $modalInstance.dismiss('cancel');
    };

    $scope.pageChanged = function(){
      $http.post('activity/listActivity',{
        name:$scope.title,
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      }).success(function(resp){
        if(resp){
          $scope.pageData = resp.page;
        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.selectGoods = function(data){
      $scope.selected = data;
      $scope.ok();
    };

    $scope.pageChanged();

  }]);

/**
 * 分销商选择控制器
 */
app.controller('ProxyChoserCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'chooseMode',
  'actionUrl',
  'couponId',
  function($scope,$http,$modalInstance,chooseMode,actionUrl,couponId){
    $scope.pageData = {};
    $scope.chooseMode = 2;
    $scope.title = "";
    $scope.selected = [];
    $scope.couponId = couponId;
    $scope.sArray = [];
    $scope.mobile = '';

    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.pageChanged = function(){
      if($scope.pageData.list){
        $.each($scope.pageData.list,function(index,ele){
          if(ele.chk){
            $scope.selected.push(ele);
          }
        });
      }
      $http.post("coupon/getPageProxy",{
        title:$scope.title,
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
        couponId:$scope.couponId,
        mobile:$scope.mobile
      }).success(function(resp){
        if(resp){
          console.log(resp);
          $scope.sArray = resp.sArray;
          $scope.pageData = resp.page;
//						$.each($scope.pageData.list,function(i,p){
//							$.each($scope.sArray,function(i1,shopId){
//								if(p.id==shopId){
//									p.chk=true;
//								}
//							});
//						});
        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.checkAll = function(){// 全选
      var flag = ! $scope.isCheckedAll();
      $.each($scope.pageData.list,function(index,ele){
        ele.chk = flag;
        if(flag){
          $scope.selected.push(ele);
        }
      });
      if(! flag){
        $scope.selected = [];
      }
    };

    $scope.isCheckedAll = function(){
      var flag = true;
      if(! $scope.pageData.list){
        return false;
      }
      $.each($scope.pageData.list,function(index,ele){
        if(! ele.chk){
          flag = false;
          return false;
        }
      });
      return flag;
    };

    $scope.setCheckedGoods = function(){
      $scope.selected = [];
      $.each($scope.pageData.list,function(index,ele){
        if(ele.chk){
          $scope.selected.push(ele);
        }
      });
    };

    $scope.setGoods = function(data){
      $scope.goods = data;
      $scope.selected = [];
      $scope.selected.push($scope.goods);
      $scope.ok();
    };

    $scope.selectGoods = function(){
      if($scope.chooseMode != 1){
        $scope.setCheckedGoods();
      }else{
        $scope.selected.push($scope.goods.single);
      }
      if($scope.selected.length == 0){
        alert("请选择商品!");
      }else{
        $scope.ok();
      }
    };

    $scope.pageChanged();

  }]);

app.controller('ExportCtrl',['$state','$scope','$http',
  '$modalInstance',
  function($state,$scope,$http,$modalInstance){

    $scope.export_page = 0;
    $scope.ok = function(){
      $modalInstance.close($scope.export_page);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };
  }
]);

//代理商提成比例设置
app.controller('CommissionRate',['$scope','$http','$modalInstance','dialogService','chooseMode',function($scope,$http,$modalInstance,dialogService,chooseMode){
  $scope.agent_id = chooseMode;
  $scope.pageData = {};
  $scope.supplierData = {};
  $scope.pageData.pageNumber = 1;
  $scope.pageData.pageSize = 10;
  $scope.pop = {update_show:false};
  $scope.person = {};
  $scope.cancel = function(){
    $modalInstance.dismiss('cancel');
  };

  $scope.pageChanged = function(){
    $scope.person = {};
    var index = layer.load(1);
    $http.post('agent/getSupplierCommissionRate',{agentId:$scope.agent_id,nickname:$scope.nickname,pageNumber:$scope.pageData.pageNumber,pageSize:$scope.pageData.pageSize}).success(function(response){
      layer.close(index);
      if(response.page && response.page != null){
        $scope.pageData = response.page;
      }
      $scope.supplierData = response.supplier;
      console.log($scope.supplierData);
    }).error(function(e){
      layer.close(index);
      console.error(e);
    });
  };

  $scope.addSupplierRate = function(){
    var percent = $("#percent").val();
    if(percent == ""){
      layer.alert("提成比例不能为空!");
      return;
    }
    var data = $scope.person.selected;
    data.percent = percent;
    data.agentId = $scope.agent_id;
    var index = layer.load(1);
    $http.post('agent/addSupplierCommissionRate',data).success(function(response){
      console.log(response);
      layer.close(index);
      if(response.result == "success"){
        $scope.pageChanged();
        $("#percent").val(0.02);
        layer.msg("操作成功 !");
      }else{
        layer.alert("操作失败 !",{icon:2});
      }
    }).error(function(e){
      layer.close(index);
      console.error(e);
    });
  }
  $scope.updateSupplierRate = function(id,supplierId,pop){
    var percent = $("#" + supplierId + "_percent").val();
    var index = layer.load(1);
    $http.post('agent/addSupplierCommissionRate',{agentId:$scope.agent_id,id:id,supplierId:supplierId,percent:percent}).success(function(response){
      layer.close(index);
      if(response.result == "success"){
        $scope.pageChanged();
        layer.msg("修改成功 !");
        pop = false;
      }else{
        layer.alert("操作失败 !",{icon:2});
      }
    }).error(function(e){
      layer.close(index);
      console.error(e);
    });
  }

  $scope.del = function(id){
    layer.confirm("确定要删除吗?",function(){
      var index = layer.load(1);
      $http.post('agent/delSupplierCommissionRate',{id:id}).success(function(response){
        layer.close(index);
        if(response.result == "success"){
          $scope.pageChanged();
          layer.msg("删除成功 !");
        }else{
          layer.alert("操作失败 !",{icon:2});
        }
      }).error(function(e){
        layer.close(index);
        console.error(e);
      });
    })
  }

  $scope.pageChanged();
}]);

//代理商提成比例设置
app.controller('AgentUpateArea',['$scope','$http','$modalInstance','dialogService','chooseMode',function($scope,$http,$modalInstance,dialogService,chooseMode){
  $scope.agent_id = chooseMode;
  $scope.areaList = "";
  $scope.cancel = function(){
    $modalInstance.close();
  };

  $scope.init = function(){
    var index = layer.load(1);
    $.post("agent/getAgentAreaData",{agentId:$scope.agent_id},function(data){
      console.log(data);
      layer.close(index);
      var city = data.agentAreaIds;
      city = "," + city + ",";
      $scope.areaList = data.areaList;
      var selectedParentIds = data.selectedParentIds;
      selectedParentIds = "," + selectedParentIds + ",";
      loadData(city,data.areaList,selectedParentIds);
    })
  }

  function loadData(city,areaList,selectedParentIds){
    $.ajax({
      type:"GET",
      url:"data/province_city.json",
      dataType:"json",
      success:function(data){
        $.each(data,function(n,item){
          var content = "<div style='display: inline-block;width: 100%;padding:10px 0px;border-bottom:1px dashed #CCCCCC;line-height:40px;'>";
          var levelOne = '';
          if(city.indexOf("," + item.id + ",") > - 1){
            levelOne = "agentArea";
            for(var j = 0; j < areaList.length; j ++){
              if(item.id == areaList[j].area_id){
                levelOne = "clickAgent";
                var html = "<span><span id='myAgentArea_" + item.id + "' data-id='" + item.id + "' data-level='" + item.level + "' data-name='" + item.name + "' class='clickAgent top_" + item.parentId + "'>" + item.name + "</span></span>";
                if(selectedParentIds.indexOf("," + item.id + ",") < 0){
                  html = "<span><span id='myAgentArea_" + item.id + "' data-id='" + item.id + "' data-level='" + item.level + "' data-name='" + item.name + "' class='clickAgent top_" + item.parentId + "'>" + item.name + "<em onclick='deleteAgent(" + item.id + ")'>x</em></span></span>";
                }
                $("#myAgentArea").append(parentName + html);
              }
            }
          }
          content += "<div id='agent_" + item.id + "' class='agent_em " + levelOne + "' style='font-weight: bold;font-size:14px;' ><span data-id='" + item.id + "' data-level='" + item.level + "' levelOne=''  onclick='clickAgent(jQuery(this))'>" + item.name + "</span>";
          if(selectedParentIds.indexOf("," + item.id + ",") < 0){
            content += "<em onclick='deleteAgent(" + item.id + ")'>x</em>";
          }
          content += "</div>";
          if(item.child_list && item.child_list.length > 0){
            var chile = item.child_list;
            content += "<div style='font-size:14px;color:#5252EB'>";
            for(var j = 0; j < chile.length; j ++){
              var chile_level = '';
              if(city.indexOf("," + chile[j].id + ",") > - 1){
                chile_level = "agentArea";
                for(var num = 0; num < areaList.length; num ++){
                  if(chile[j].id == areaList[num].area_id){
                    chile_level = "clickAgent";

                    var html = "<span><span id='myAgentArea_" + chile[j].id + "' data-id='" + chile[j].id + "' data-level='" + chile[j].level + "' data-name='" + chile[j].name + "' class='clickAgent top_agent_" + areaList[num].area_parent_Id + "'>" + chile[j].name + "<em onclick='deleteAgent(" + chile[j].id + ")'>x</em></span></span>";
                    var parentName = "";
                    if($("#parentName_agent_" + areaList[num].area_parent_Id).text() == ''){
                      parentName = "<div><span id='parentName_agent_" + areaList[num].area_parent_Id + "'>" + areaList[num].name + " : </span></div>";
                      $("#myAgentArea").append(parentName);
                    }
                    $("#parentName_agent_" + areaList[num].area_parent_Id).parent().append(html);
                  }
                }
              }
              content += "<span id='agent_" + chile[j].id + "' class='agent_em " + chile_level + " main_agent_" + item.id + "' style='margin-left:20px;'><span levelOneId='agent_" + item.id + "'  levelOne='" + levelOne + "' data-id='" + chile[j].id + "' data-level='" + chile[j].level + "' levelOneName='" + item.name + "'  onclick='clickAgent(jQuery(this))'>" + chile[j].name + "</span><em onclick='deleteAgent(" + chile[j].id + ")'>x</em></span>";
            }
            content += "</div>";
          }
          content += "</div>";
          $("#city").append(content);
        })
      }
    })
  }

  $scope.submit = function(){
    var list = [];
    $("#myAgentArea").find(".clickAgent").each(function(){
      var json = {};
      json.id = $(this).attr("data-id");
      json.level = $(this).attr("data-level");
      json.name = $(this).attr("data-name");
      list.push(json);
    })
    /*if(list.length==0){
     layer.alert("请先选择代理区域!");
     return;
     }*/
    var addData = [];
    var delData = [];
    for(var i in list){
      var type = true;
      for(var j in $scope.areaList){
        if($scope.areaList[j].area_id == list[i].id){
          type = false;
        }
      }
      if(type){
        addData.push(list[i]);
      }
    }
    for(var j in $scope.areaList){
      var type = true;
      for(var i in list){
        if($scope.areaList[j].area_id == list[i].id){
          type = false;
        }
      }
      if(type){
        delData.push($scope.areaList[j]);
      }
    }

    if(addData.length == 0 && delData.length == 0){
      layer.msg("操作成功!")
      $scope.cancel();
      return;
    }
    var index = layer.load(1);
    $.post("agent/updateAgentArea",{addList:JSON.stringify(addData),delList:JSON.stringify(delData),agentId:$scope.agent_id},function(data){
      layer.close(index);
      $scope.cancel();
    })
  }
  $scope.init();
}]);

app.controller('AddAgent',['$state','$scope','$http','$modalInstance',
  function($state,$scope,$http,$modalInstance){
    $scope.moblie_type = 0;
    $scope.moblie = "";
    $scope.money = 0;
    $scope.commission_rate = 0;
    $scope.user = {};
    $scope.init = function(){
      $.post("agent/getAgentCommissionRate",function(data){
        if(data.commission_rate){
          $scope.commission_rate = data.commission_rate;
        }
      })
    }
    $scope.init();
    $scope.ok = function(){
      $modalInstance.close($scope.export_page);
    };
    $scope.moblieChange = function(){
      var sj = new RegExp("^(13|14|15|16|17|18|19)[0-9]{9}$");
      if($scope.moblie.length == 11){
        if(! sj.test($scope.moblie)){
          $scope.moblie_type = 2;
        }else{
          $scope.moblie_type = 1;
          $.post("agent/getUser",{moblie:$scope.moblie},function(data){
            $scope.moblie_type = 4;
            if(data.User){
              $scope.moblie_type = 3;
              $scope.user = data.User;
            }
            if(data.Agent && data.Agent.delete_flag == 0){
              $scope.moblie_type = 5;
              $scope.user = data.User;
            }else if(data.Agent && data.Agent.delete_flag == 1){
              $scope.moblie_type = 6;
              $scope.user = data.User;
            }
            jQuery(".moblie").click();
          })
        }
      }
    }

    $scope.addAgent = function(){
      if($scope.moblie == ""){
        layer.alert("请输人对应的分销商手机号码");
        return;
      }
      var sj = new RegExp("^(13|14|15|16|17|18|19)[0-9]{9}$");
      if(! sj.test($scope.moblie)){
        layer.alert("手机号码格式不正确");
        return;
      }
      $.post("agent/addAgent",{moblie:$scope.moblie,money:$scope.money,commission_rate:$scope.commission_rate},function(data){
        if(data.result == "success"){
          layer.msg("操作成功!");
          $scope.ok();
        }else if(data.moblie_type){
          $scope.moblie_type = data.moblie_type;
          layer.alert(data.message);
        }else{
          layer.alert("操作失败",{icon:2});
        }
      })

    }
    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };
  }
]);

/**
 * 添加拥有平台权限的用户
 */
app.controller('AddPlatformUserCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'chooseMode',
  function($scope,$http,$modalInstance,chooseMode){
    $scope.pageData = {};
    $scope.chooseMode = 2;
    $scope.title = "";
    $scope.selected = [];
    $scope.goods = {};
    $scope.goods.single = {};
    $scope.sArray = [];
    $scope.mobile = '';
    $scope.user = {};

    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.mobileChange = function(){
      var sj = new RegExp("^(13|14|15|16|17|18|19)[0-9]{9}$");
      if($scope.mobile.length == 11){
        if(! sj.test($scope.mobile)){
          $scope.mobile_type = 2;
        }else{
          $scope.mobile_type = 1;

          $http.post('permission/getUser',{mobile:$scope.mobile})
          .success(function(req){
            if(req.result == 'success'){
              $scope.mobile_type = 3;
              $scope.user = req.user;
            }
          })
        }
      }
    }

    $scope.addUser = function(){
      if($scope.mobile == ""){
        layer.alert("请输人对应的分销商手机号码");
        return;
      }
      var sj = new RegExp("^(13|14|15|16|17|18|19)[0-9]{9}$");
      if(! sj.test($scope.mobile)){
        layer.alert("手机号码格式不正确");
        return;
      }
      $http.post('permission/openPlatformForUser',{ids:$scope.user.id})
      .success(function(req){
        if(req.result == 'success'){
          layer.alert('添加平台操作用户成功！');
        }else{
          layer.alert('添加平台操作用户失败！');
        }

        $modalInstance.close();
      })
    }

  }]);

/**
 * 权限列表
 */
app.controller('PermissionListCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'chooseMode',
  'roleId','editableOptions','editableThemes','$filter',
  function($scope,$http,$modalInstance,chooseMode,roleId,editableOptions,editableThemes,$filter){
    $scope.pageData = {};
    $scope.chooseMode = 2;
    $scope.title = "";
    $scope.selected = [];
    $scope.sArray = [];
    $scope.roleId = roleId;
    $scope.newIndex = 0;
    $scope.data = [];

    $scope.loadPermissionTree = function(){
      $http.post('permission/getRoleHavePermissionTree',{roleId:roleId})
      .success(function(req){
        if(req.allPermission){
          var list = req.allPermission;
          $.each(list,function(index,item){
            if(item.havePermissionFlag){
              item.havePermissionFlag = true;
            }else{
              item.havePermissionFlag = false;
            }

            if(! item.parent_id){
              $scope.createTree(item,list);
              $scope.data.push(item);
            }
          });

          console.log($scope.data);
        }
      })
    };

    $scope.loadPermissionTree();

    $scope.selectPermission = function(scope,node){
      scope.$nodeScope.$modelValue.havePermissionFlag = ! scope.$nodeScope.$modelValue.havePermissionFlag;

      if(scope.$nodeScope.$modelValue.havePermissionFlag){  //当前这个元素被选中，则选中它所有上级
        $scope.selectParentNode(scope);
      }else{
        //判断取消所有上级的选中
        $scope.cancelSelectParentNode(scope);

        //取消所有下级的选中
        $scope.cancelSelectAllChildNode(node);
      }
    };

    $scope.cancelSelectAllChildNode = function(node){
      if(node.nodes){
        $.each(node.nodes,function(index,item){
          item.havePermissionFlag = false;
          $scope.cancelSelectAllChildNode(item);
        })
      }
    }

    $scope.cancelSelectParentNode = function(scope){
      if(scope.$parentNodeScope){
        var parentNotHaveChildSelectedlag = true;

        $.each(scope.$parentNodeScope.$modelValue.nodes,function(index,item){
          if(item.havePermissionFlag == true){
            parentNotHaveChildSelectedlag = false;
            return false;
          }
        });

        if(parentNotHaveChildSelectedlag){
          scope.$parentNodeScope.$modelValue.havePermissionFlag = false;
          $scope.cancelSelectParentNode(scope.$parentNodeScope);
        }
      }
    }

    $scope.selectParentNode = function(scope){
      if(scope.$parentNodeScope){
        scope.$parentNodeScope.$modelValue.havePermissionFlag = true;
        $scope.selectParentNode(scope.$parentNodeScope);
      }
    }

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
          var list = req.allPermission;
          $.each(list,function(index,item){
            if(! item.parent_id){
              $scope.createTree(item,list);
              $scope.data.push(item);
            }
          });
        }
      })
    };

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

    $scope.saveSelectPermissionTree = function(){
      $http.post('permission/saveSelectPermissionTree',{roleId:roleId,data:angular.toJson($scope.data)})
      .success(function(req){
        if(req.result == 'success'){
          layer.alert('添加权限成功!');
          $modalInstance.close();
        }
      })
    }

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

  }]);

/**
 * 角色列表
 */
app.controller('RoleListCtrl',[
  '$scope',
  '$http',
  '$modalInstance',
  'chooseMode','userId','type',
  function($scope,$http,$modalInstance,chooseMode,userId,type){
    $scope.pageData = {};
    $scope.chooseMode = 2;
    $scope.title = "";
    $scope.selected = [];
    $scope.goods = {};
    $scope.goods.single = {};
    $scope.sArray = [];

    $scope.ok = function(){
      $modalInstance.close($scope.selected);
    };

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

    $scope.pageChanged = function(){
      if($scope.pageData.list){
        $.each($scope.pageData.list,function(index,ele){
          if(ele.chk){
            $scope.selected.push(ele);
          }
        });
      }
      $http.post("permission/getRoles",{
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
        userId:userId,
        type:type,
        name:$scope.title
      }).success(function(resp){
        if(resp){
          console.log(resp);
          $scope.pageData = resp.page;
        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.checkAll = function(){// 全选
      var flag = ! $scope.isCheckedAll();
      $.each($scope.pageData.list,function(index,ele){
        ele.chk = flag;
        if(flag){
          $scope.selected.push(ele);
        }
      });
      if(! flag){
        $scope.selected = [];
      }
    };

    $scope.isCheckedAll = function(){
      var flag = true;
      if(! $scope.pageData.list){
        return false;
      }
      $.each($scope.pageData.list,function(index,ele){
        if(! ele.chk){
          flag = false;
          return false;
        }
      });
      return flag;
    };

    $scope.setCheckedGoods = function(){
      $.each($scope.pageData.list,function(index,ele){
        if(ele.chk){
          $scope.selected.push(ele);
        }
      });
    };

    $scope.setGoods = function(data){
      $scope.goods = data;
      $scope.selected = [];
      $scope.selected.push($scope.goods);
      $scope.ok();
    };

    $scope.selectGoods = function(){
      $scope.setCheckedGoods();
      $scope.ok();
    };

    $scope.pageChanged();

  }]);
