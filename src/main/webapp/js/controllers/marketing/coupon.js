'use strict';

app.controller('CouponListController',['$scope','$http','$state','$stateParams','notifyService','dialogService',
  function($scope,$http,$state,$stateParams,notifyService,dialogService){
    $scope.pageData = {};
    $scope.curTab = 0;
    $scope.name = "";
    $scope.mobile = "";
    $scope.status = "0";
    $scope.selected = [];
    $scope.tab = - 1;

    $scope.failure = function(){
      if($scope.selected && $scope.selected.length > 0){
        var str = "";
        $.each($scope.selected,function(i,p){
          str = str + p.id + ",";
        });
        str = str.slice(0,str.length - 1);
        $http.post('coupon/failure',{ids:str})
        .success(function(data){
          if(data.result == "success"){
            layer.msg(data.message);
            $.each($scope.pageData.list,function(i,d){
              d.status = 3;
            });
          }else{
            layer.alert(data.message,{icon:2});
          }
        }).error(function(e){
          console.error(e);
        });
      }else{
        layer.alert('没有选择用户',{icon:2});
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

    $scope.setTab = function(tab){
      $scope.tab = tab;
      $("li[id^=tab-]").removeClass();
      $("#tab-" + tab).addClass("active");

      $scope.curTab = tab;
      $scope.status = tab;
      if($scope.curTab == '4'){
        $scope.pageChanged1();
      }else{
        $scope.pageChanged();
      }

    };

    $scope.pageChanged1 = function(){
      $http.post('coupon/listUserCouponLogs',{
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
        name:$scope.name,
        mobile:$scope.mobile
      }).success(function(req){
        if(req.page){
          $scope.pageData = req.page;
        }else{
          $scope.pageData = {};
        }
      }).error(function(e){
      });

    }

    $scope.pageChanged = function(){
      $http.post('coupon/listCoupons',{
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
        name:$scope.name,
        status:$scope.status
      }).success(function(page){
        $scope.pageData = page;
        console.log(page);
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.setInvalid = function(item){
      layer.confirm("确定使该优惠劵失效吗?",function(index){
        layer.close(index);
        var load = layer.load(1,{shade:[0.1,'#393D49']});
        $http.post('coupon/updateCouponInvalid',item).success(function(data){
          layer.close(load);
          layer.msg(data.message);
          if(data.result == "success"){
            $scope.pageChanged();
          }
        }).error(function(e){
          console.error(e);
        });
      })
    };

    $scope.setStopGrant = function(item){
      layer.confirm("确定停止发放吗?",function(index){
        layer.close(index);
        var load = layer.load(1,{shade:[0.1,'#393D49']});
        $http.post('coupon/updateCouponStopGrant',item).success(function(data){
          layer.close(load);
          layer.msg(data.message);
          if(data.result == "success"){
            $scope.pageChanged();
          }
        }).error(function(e){
          console.error(e);
        });
      })
    };

    $scope.fallback = function(){
      layer.msg('复制成功！');
    };

    $scope.grant = function(allocator_obj,id,type){
      var data = {type:type};

      switch(allocator_obj){
        //0=所有会员
        case 0:
          data.id = id;
          data.allocator_obj = 0;
          $http.post('coupon/updataPrizeAllocate',data)
          .success(function(data){
            if(data.exceed){
              layer.msg(data.exceed);
              $scope.pageChanged();
            }else{
              if(data.result == "success"){
                layer.msg(data.message);

                $scope.pageChanged();
              }else{
                layer.alert(data.message,{icon:2});
              }
              if(data.exceed){
                layer.alert(data.exceed);
              }
            }
          }).error(function(e){
            console.error(e);
          });
          break;
        //1=平台
        case 1:
          data.id = id;
          data.allocator_obj = 1;
          $http.post('coupon/updataPrizeAllocate',data)
          .success(function(data){
            if(data.result == "success"){
              layer.msg(data.message);
              $scope.pageChanged();
            }else{
              layer.alert(data.message,{icon:2});
            }
          }).error(function(e){
            console.error(e);
          });
          break;
        //2=所有店铺
        case 2:
          data.id = id;
          data.allocator_obj = 2;
          $http.post('coupon/updataPrizeAllocate',data)
          .success(function(data){
            if(data.result == "success"){
              layer.msg(data.message);
              $scope.pageChanged();
            }else{
              layer.alert(data.message,{icon:2});
            }
          }).error(function(e){
            console.error(e);
          });
          break;
        //3=所有分销商店铺
        case 3:
          data.id = id;
          data.allocator_obj = 3;
          $http.post('coupon/updataPrizeAllocate',data)
          .success(function(data){
            if(data.result == "success"){
              layer.msg(data.message);
              $scope.pageChanged();
            }else{
              layer.alert(data.message,{icon:2});
            }
          }).error(function(e){
            console.error(e);
          });
          break;
        //4=指定分销商店铺
        case 4:
          data.id = id;
          data.allocator_obj = 4;
          dialogService.openProxyChoser(function(proxy){
            if(proxy){
              var str = "";
              $.each(proxy,function(i,p){
                str = str + p.id + ",";
              });
              data.allocator_id = str;
              $http.post('coupon/updataPrizeAllocate',data)
              .success(function(data){
                if(data.result == "success"){
                  layer.msg(data.message);
                  $scope.pageChanged();
                }else{
                  layer.alert(data.message,{icon:2});
                }
              }).error(function(e){
                console.error(e);
              });
            }
          },id);
          break;
        //5=所有供应商店铺
        case 5:
          data.id = id;
          data.allocator_obj = 5;
          $http.post('coupon/updataPrizeAllocate',data)
          .success(function(data){
            if(data.result == "success"){
              layer.msg(data.message);
              $scope.pageChanged();
            }else{
              layer.alert(data.message,{icon:2});
            }
          }).error(function(e){
            console.error(e);
          });
          break;
        //6=指定供应商店铺
        case 6:
          data.id = id;
          data.allocator_obj = 6;
          dialogService.openSupplierChoser(function(user){
            if(user){
              var str = "";
              $.each(user,function(i,p){
                str = str + p.sid + ",";
              });
              data.allocator_id = str;
              $http.post('coupon/updataPrizeAllocate',data)
              .success(function(data){
                if(data.result == "success"){
                  layer.msg(data.message);
                  $scope.pageChanged();
                }else{
                  layer.alert(data.message,{icon:2});
                }
              }).error(function(e){
                console.error(e);
              });
            }
          },id);
          break;
        //7=指定会员
        case 7:
          data.id = id;
          data.allocator_obj = 7;
          dialogService.openMemberChoser(function(user){
            if(user){
              var str = "";
              $.each(user,function(i,p){
                str = str + p.id + ",";
              });
              str = str.substring(0,str.length - 1);
              data.allocator_id = str;
              $http.post('coupon/updataPrizeAllocate',data)
              .success(function(data){
                if(data.exceed){
                  layer.alert(data.exceed);
                  $scope.pageChanged();
                }else{
                  if(data.result == "success"){
                    layer.msg(data.message);
                    $scope.pageChanged();
                  }else{
                    layer.alert(data.message,{icon:2});
                  }
                }
              }).error(function(e){
                console.error(e);
              });
            }
          },id);
          break;
        //8=活动参与者
        case 8:
          data.id = id;
          data.allocator_obj = 8;
          dialogService.openActivityChoser(function(activity){
            if(activity){
              data.allocator_id = activity.id;
              $http.post('coupon/updataPrizeAllocate',data)
              .success(function(data){
                if(data.result == "success"){
                  layer.msg(data.message);
                  $scope.pageChanged();
                }else{
                  layer.alert(data.message,{icon:2});
                }
              }).error(function(e){
                console.error(e);
              });
            }
          },id);
          break;
        //9=活动推广者
        case 9:
          data.id = id;
          data.allocator_obj = 9;
          dialogService.openActivityChoser(function(activity){
            if(activity){
              data.allocator_id = activity.id;
              $http.post('coupon/updataPrizeAllocate',data)
              .success(function(data){
                if(data.result == "success"){
                  layer.msg(data.message);
                  $scope.pageChanged();
                }else{
                  layer.alert(data.message,{icon:2});
                }
              }).error(function(e){
                console.error(e);
              });
            }
          },id);
          break;
        //10=指定分销商用户
        case 10:
          data.id = id;
          data.allocator_obj = 10;
          dialogService.openProxyChoser(function(proxy){
            if(proxy){
              var str = "";
              $.each(proxy,function(i,p){
                str = str + p.id + ",";
              });
              data.allocator_id = str;
              $http.post('coupon/updataPrizeAllocate',data)
              .success(function(data){
                if(data.result == "success"){
                  layer.msg(data.message);
                }else{
                  layer.alert(data.message,{icon:2});
                }
                $scope.pageChanged();
              }).error(function(e){
                console.error(e);
              });
            }
          },id);
          break;
      }
    }

    $scope.pageChanged();

  }]);

app.filter('memberTagPropsFilter',function(){
  return function(items,props){
    var out = [];
    if(angular.isArray(items)){
      items.forEach(function(item){
        var itemMatches = false;
        var keys = Object.keys(props);
        for(var i = 0; i < keys.length; i ++){
          var prop = keys[i];
          var text = props[prop].toLowerCase();
          if(item[prop].toString().toLowerCase().indexOf(text) !== - 1){
            itemMatches = true;
            break;
          }
        }

        if(itemMatches){
          out.push(item);
        }
      });
    }else{
      out = items;
    }

    return out;
  };
});

app.controller('CouponEditController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'dialogService',
  function($scope,$http,$state,$stateParams,dialogService){
    $scope.coupon = {
      type:1,
      issue_quantity:0,
      amount:0,
      order_limit_flag:0,
      order_money_limit:0,
      vip_level_limit:0,
      each_one_limit_count:0,
      sync_wechat_flag:0,
      extend_setting:1,
      expire_flag:1,
      used_by_fullrates:1,
      use_range:1,
      background_value:'#cf3e36',
      wechat_card_title:'',
      wechat_card_sub_title:''
    };
    $scope.memberCards = [];
    $scope.memberTags = [];
    $scope.multipleTags = {};
    $scope.multipleTags.selectedTags = [];
    $scope.selectedGoods = [];
    $scope.isNew = true;

    $scope.loadCoupon = function(){
      $http.post('memberCard/getShopMemberCards')
      .success(function(data){
        if(data){
          $scope.memberCards = data;
        }
        $http.post('memberTag/getShopMemberTags')
        .success(function(data){
          if(data){
            $scope.memberTags = data;
          }
          $http.post('coupon/getCoupon',{
            id:$stateParams.id
          }).success(
            function(data){
              if(data){
                $("#input_Total").attr("disabled",true);
                $("#input_face").attr("disabled",true);
                $scope.isNew = false;
                $scope.coupon = data;
                if($scope.memberTags.length > 0){
                  $.each($scope.memberTags,function(n1,e1){
                    $.each(angular.fromJson($scope.coupon.vip_label),function(n2,e2){
                      if(e1.id == e2.id){
                        $scope.multipleTags.selectedTags.push(e1);
                      }
                    })
                  });
                }
                $scope.selectedGoods = angular.fromJson($scope.coupon.range_goods);
              }
            })
          .error(function(e){
            console.error(e);
          });
        }).error(function(e){
          console.error(e);
        });
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.resetLimit = function(){
      $scope.coupon.order_money_limit = 0;
    };

    $scope.selectGoods = function(data){
      dialogService.openGoodsChoser(function(data){
        if(data && data.length > 0){
          console.log(data);
          $.each(data,function(n,e){
            $scope.selectedGoods.push(e);
          });
        }
        console.log($scope.selectedGoods);
      },0,$scope.selectedGoods);
    };

    $scope.delGoods = function(goods){
      layer.confirm("确定要删除吗?",function(index){
        layer.close(index);
        $scope.selectedGoods.splice($scope.selectedGoods.indexOf(goods),1);
      })
    };

    $scope.cancel = function(){
      $state.go("console.ump_coupon_list");
    };

    $scope.save = function(){
      var load = layer.load(1,{shade:[0.1,'#393D49']});
      if($scope.coupon.use_range == 2 && $scope.selectedGoods.length == 0){
        layer.alert("请选择商品!");
        console.error(e);
        return;
      }else{
        $scope.coupon.vip_label = angular.toJson($scope.multipleTags.selectedTags);
        $scope.coupon.range_goods = angular.toJson($scope.selectedGoods);
        if($scope.coupon.sync_wechat_flag == 0){
          $scope.coupon.wechat_card_title = "";
          $scope.coupon.wechat_card_sub_title = "";
        }
        $scope.coupon.source = "0";//将来源设置为平台
        $http.post('coupon/saveCoupon',$scope.coupon)
        .success(
          function(data){
            layer.alert(data.message);
            if(data.result = "success"){
              layer.close(load);
              $state.go("console.ump_coupon_list");
            }
          }).error(function(e){
          layer.close(load);
          console.error(e);
        });
      }
    };

    $scope.setBgColor = function(color){
      $scope.coupon.background_value = color;
    };

    $scope.loadCoupon();

  }]);

app.controller('CouponLogListController',
  ['$scope','$http','$state','$stateParams','notifyService',
    function($scope,$http,$state,$stateParams,notifyService){
      $scope.pageData = {};
      $scope.couponId = $stateParams.couponId;
      $scope.status = $stateParams.status;
      $scope.coupon = {};
      $scope.user_mobile = '';
      $scope.user_nickname = '';

      $scope.pageChanged = function(){
        $http.post('couponLog/listCouponLog',{
          pageNumber:$scope.pageData.pageNumber,
          pageSize:$scope.pageData.pageSize,
          couponId:$scope.couponId,
          status:$scope.status,
          nickname:$scope.user_nickname,
          mobile:$scope.user_mobile
        }).success(function(data){
          console.log(data);
          $scope.pageData = data.page;
          $scope.coupon = data.coupon;
        }).error(function(e){
          console.error(e);
        });
      };

      $scope.pageChanged();
    }]);
