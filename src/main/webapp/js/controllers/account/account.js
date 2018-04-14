'use strict';

/**
 * 用户账户信息
 */
app.controller('AccountListController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'notifyService',
  'pageService',
  function($scope,$http,$state,$stateParams,notifyService,pageService){
    $scope.pageData = {};
    $scope.accountType = "";
    $scope.nickname = "";
    $scope.mobile = '';

    $scope.setQueryParam = function(){
      if(pageService.type == "AccountListController"){
        if(pageService.open == true){
          $scope.pageData.pageNumber = pageService.queryParam.get("pageNumber");
          $scope.pageData.pageSize = pageService.queryParam.get("pageSize");
          $scope.nickname = pageService.queryParam.get("nickname");
          $scope.mobile = pageService.queryParam.get('mobile');
          $scope.accountType = pageService.queryParam.get("accountType");
        }else{
          if($scope.pageData.pageNumber){
            pageService.queryParam.put("pageNumber",$scope.pageData.pageNumber);
          }
          if($scope.pageData.pageSize){
            pageService.queryParam.put("pageSize",$scope.pageData.pageSize);
          }
          pageService.queryParam.put("nickname",$scope.nickname);
          pageService.queryParam.put("mobile",$scope.mobile);
          pageService.queryParam.put("accountType",$scope.accountType);
        }
      }else{
        pageService.resetParam();
      }
    };

    $scope.pageChanged = function(){
      $scope.setQueryParam();
      pageService.type = "AccountListController";
      $http.post('account/listAccount',
        {
          pageNumber:pageService.queryParam.get("pageNumber"),
          pageSize:pageService.queryParam.get("pageSize"),
          accountType:pageService.queryParam.get("accountType"),
          mobile:pageService.queryParam.get('mobile'),
          nickName:pageService.queryParam.get("nickname"),
        })
      .success(
        function(response){
          $scope.pageData = response;
          pageService.open = false;
        }).error(function(e){
        console.error(e);
      });
    };

    $scope.toAccountBill = function(id){
      pageService.open = true;
      $state.go('console.account_bill',{id:id});
    }

    $scope.pageChanged();
  }]);

app.controller('AccountBillListController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'notifyService',
  function($scope,$http,$state,$stateParams,notifyService){
    $scope.pageData = {};
    $scope.tradeType = "";
    $scope.beginTime = "";
    $scope.endTime = "";

    $scope.pageChanged = function(){
      $http.post('account/listBill',{
        id:$stateParams.id,
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
        tradeType:$scope.tradeType,
        beginTime:$scope.beginTime,
        endTime:$scope.endTime
      }).success(
        function(response){
          $scope.pageData = response;
        }).error(function(e){
        console.error(e);
      });
    };

    $scope.setQueryTime = function(day){
      var curTime = new Date();
      var lastDate = DateUtil.dateAdd('d',day,curTime);
      lastDate.setHours(0,0,0,0);
      $scope.beginTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",lastDate);
      $scope.endTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",curTime);
    };

    $scope.pageChanged();
  }]);

/**
 *
 */
app.controller('setNotificationNumberController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'notifyService',
  function($scope,$http,$state,$stateParams,notifyService){
    $scope.mobile;

    $scope.setNotificationNumber = function(){
      $http.post('account/setNotificationNumber',{mobile:$scope.mobile})
      .success(function(data){
        if(data.result == 'success'){
          notifyService.info('设置成功');
        }else{
          notifyService.info('设置失败');
        }
      });
    };

    $scope.load = function(){
      $http.post('account/getNotificationNumber')
      .success(function(data){
        if(data.mobile){
          $scope.mobile = data.mobile;
        }
      });
    }
    $scope.load();

  }]);

/**
 *
 */
app.controller('consoleTransfersController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'notifyService',
  '$timeout',
  function($scope,$http,$state,$stateParams,notifyService,$timeout){
    $scope.mobile = '';
    $scope.userName;
    $scope.money;
    $scope.user = {};
    $scope.smsCode;

    $scope.setNotificationNumber = function(){
      $http.post('account/setNotificationNumber',{mobile:$scope.mobile})
      .success(function(data){
        if(data.result == 'success'){
          notifyService.info('设置成功');
        }else{
          notifyService.info('设置失败');
        }
      });
    };

    $scope.verifyMobile = function(){
      if($scope.mobile.length == 11){
        if((/^1[3|4|5|7|8]\d{9}$/.test($scope.mobile))){
          $http.post('account/getUserNameByMobile',{mobile:$scope.mobile})
          .success(function(req){
            if(req.user){
              $scope.userName = req.user.nickname;
              $scope.user = req.user;
            }
          });
        }
      }
    }

    $scope.getSMSCode = function(){
      if($scope.money > 0){
        var seed = 60;
        $("#btn_sms").attr("disabled","true");
        $.post("account/getSMSCode",{money:$scope.money,userName:$scope.userName,tplId:'18067'},
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
            var seed = 60;
            var timer;
            timer = setInterval(function setSeed(){
              if(seed > 0){
                $("#btn_sms").text(seed + "s后重新获取");
                seed --;
              }else{
                $("#btn_sms").removeAttr("disabled");
                $("#btn_sms").text("获取");
                seed = 60;
                clearInterval(timer);
              }
            },1000);
          });
      }else{
        notifyService.info('请填写奖励金额','center');
      }
    }

    $scope.doGenerator = function(){
      $http.post('account/sendMoney',{
        userName:$scope.userName,
        userId:$scope.user.id,
        money:$scope.money,
        smsCode:$scope.smsCode,
        userMobile:$scope.user.mobile
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

/**
 * 提现申请
 */
app.controller('withdrawcashListController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'notifyService',
  function($scope,$http,$state,$stateParams,notifyService){
    $scope.pageData = {};
    $scope.status = "";
    $scope.beginTime = "";
    $scope.endTime = "";

    $scope.pageChanged = function(){
      $http.post('account/listWithdrawcash',{
        id:$stateParams.id,
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
        status:$scope.status,
        beginTime:$scope.beginTime,
        endTime:$scope.endTime
      }).success(
        function(page){
          $scope.pageData = page;
          if($scope.pageData.list){
            $.each($scope.pageData.list,function(i,e){
              e.detail = angular.fromJson(e.detail);
            });
          }
        }).error(function(e){
        console.error(e);
      });
    };

    $scope.setQueryTime = function(day){
      var curTime = new Date();
      var lastDate = DateUtil.dateAdd('d',day,curTime);
      lastDate.setHours(0,0,0,0);
      $scope.beginTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",lastDate);
      $scope.endTime = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",curTime);
    };

    $scope.agree = function(id){
      $http.post('account/agreeWithdrawcash',{
        billId:id
      }).success(
        function(data){
          if(data.result == "success"){
            notifyService.info(data.message,"center");
            $scope.pageChanged();
          }else{
            notifyService.error(data.message,"center");
          }
        }).error(function(e){
        console.error(e);
      });
    };

    $scope.reject = function(id,pop){
      pop.reject_show = false;
      $http.post('account/rejectWithdrawcash',{
        billId:id,
        remark:$("#remark_" + id).val()
      }).success(
        function(data){
          if(data.result == "success"){
            notifyService.info(data.message,"center");
            $scope.pageChanged();
          }else{
            notifyService.error(data.message,"center");
          }
        }).error(function(e){
        console.error(e);
      });
    };

    $scope.success = function(id){
      $http.post('account/withdrawcashResult',{
        billId:id,
        status:2
      }).success(
        function(data){
          if(data.result == "success"){
            notifyService.info(data.message,"center");
            $scope.pageChanged();
          }else{
            notifyService.error(data.message,"center");
          }
        }).error(function(e){
        console.error(e);
      });
    };

    $scope.fail = function(id,pop){
      pop.fail_show = false;
      $http.post('account/withdrawcashResult',{
        billId:id,
        status:3,
        remark:$("#fail_" + id).val()
      }).success(
        function(data){
          if(data.result == "success"){
            notifyService.info(data.message,"center");
            $scope.pageChanged();
          }else{
            notifyService.error(data.message,"center");
          }
        }).error(function(e){
        console.error(e);
      });
    };

    $scope.remark = function(id,data){
      data.rek_show = false;
      $http.post('account/billRemark',{
        billId:id,
        remark:$("#remark_c_" + id).val()
      }).success(
        function(data){
          if(data.result == "success"){
            notifyService.info(data.message,"center");
            $scope.pageChanged();
          }else{
            notifyService.error(data.message,"center");
          }
        }).error(function(e){
        console.error(e);
      });
    };

    $scope.pageChanged();
  }]);

app.controller('AccountIncomeController',['$scope','$http','$state','$stateParams','dialogService','$compile','notifyService',
  function($scope,$http,$state,$stateParams,dialogService,$compile,notifyService){
    //列表数据
    $scope.pageData = {list:[],pageNumber:1,pageSize:20,totalPage:0,totalRow:0};
    $scope.account = {};
    $scope.shop = {};
    //过滤条件
    $scope.q = {};

    $scope.load = function(){
      $http.post('account/income').success(function(resp){
        $scope.account = resp.account;
        $scope.shop = resp.shop;
        $.each(resp.pageData.list,function(i,d){
          if(d.detail){
            d.detail = angular.fromJson(d.detail);
          }
        });
        $scope.pageData = resp.pageData;
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.load();
  }]);

app.controller('AccountTradeListController',['$scope','$http','$state','$stateParams','dialogService','$compile','notifyService',
  function($scope,$http,$state,$stateParams,dialogService,$compile,notifyService){
    $scope.url = 'account/tradeList';
    if($state.current.name == 'console.trading_list'){
      $scope.url = 'account/tradeList';
    }else if($state.current.name == 'console.income_detail'){
      $scope.url = 'account/inoutdetail';
    }else if($state.current.name == 'console.withdrawals_record'){
      $scope.url = 'account/withdraw';
    }else if($state.current.name == 'console.available_balance'){
      $scope.url = 'account/freeze';
    }
    //列表数据
    $scope.pageData = {list:[],pageNumber:1,pageSize:20,totalPage:0,totalRow:0};
    //过滤条件
    $scope.q = {state:- 1,time_type:"create_time",trade_type:0};
    $scope.state = - 1;
    $scope.pageChanged = function(){
      var d = {
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize
      };
      d = $.extend(d,$scope.q);

      $http.post($scope.url,d).success(function(resp){
        $.each(resp.page.list,function(i,d){
          if(d.detail){
            d.detail = angular.fromJson(d.detail);
          }
        });
        $scope.pageData = resp.page;
        $scope.state = $scope.q.state;
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.doSearch = function(state){
      var d = {
        pageNumber:1,
        pageSize:$scope.pageData.pageSize
      };
      d = $.extend(d,$scope.q);

      if(arguments.length > 0){
        d.state = state;
      }
      $http.post($scope.url,d).success(function(resp){
        $.each(resp.page.list,function(i,d){
          if(d.detail){
            d.detail = angular.fromJson(d.detail);
          }
        });
        $scope.pageData = resp.page;
        if(arguments.length > 0){
          $scope.q.state = state;
        }
        $scope.state = $scope.q.state;
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.setQueryTime = function(day){
      var curTime = new Date();
      var lastDate = DateUtil.dateAdd('d',day,curTime);
      lastDate.setHours(0,0,0,0);
      $scope.q.start_time = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",lastDate);
      $scope.q.end_time = DateUtil.dateToStr(
        "yyyy-MM-dd HH:mm:ss",curTime);
    };

    $scope.pageChanged();
  }]);

/**
 * 提现
 */
app.controller('AccountApplyWithDrawalController',['$scope','$http','$state','$stateParams','dialogService','$compile','notifyService',
  function($scope,$http,$state,$stateParams,dialogService,$compile,notifyService){
    //列表数据
    $scope.bankList = [];
    $scope.account = {};
    $scope.shop = {};
    $scope.data = {id:0,money:0.0};

    $scope.selectBankCard = function(item){
      $scope.data.id = item.id;
    };

    $scope.load = function(){
      $http.post('account/getUserAccountInfo',{account:1,bankList:1,shop:1}).success(function(resp){
        console.log(resp);
        $scope.account = resp.account;
        $scope.shop = resp.shop;
        $scope.bankList = resp.bankList;
        if($scope.bankList.length > 0){
          $scope.data.id = $scope.bankList[0].id;
        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.canSubmit = function(){
      return $scope.data.money > 0 && $scope.data.money <= $scope.account.available_money;
    };

    $scope.setDefaultBankCard = function(item){
      var load = layer.load(1,{shade:[0.1,'#393D49']});
      $http.post('account/setDefaultBankCard',{id:item.id}).success(function(resp){
        layer.close(load);
        if(resp.result == 'success'){
          $.each($scope.bankList,function(i,d){
            d.is_default = 0;
          });
          item.is_default = 1;
          notifyService.info("默认银行卡修改成功！");
        }else{
          notifyService.error(resp.message);
        }
      }).error(function(e){
        console.error(e);
        layer.close(load);
      });
    };

    $scope.deleteBankCard = function(item){
      $http.post('account/delBankCardInfo',{id:item.id}).success(function(resp){
        $scope.load();
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.submitApply = function(){
      if(! $scope.canSubmit()){
        return;
      }
      var load = layer.load(1,{shade:[0.1,'#393D49']});
      $http.post('account/applyWithdrawal',$scope.data).success(function(resp){
        layer.close(load);
        if(resp.result == 'success'){
          notifyService.info("提现申请提交成功！");
          $state.go('console.order_withdrawals_record');
        }else{
          notifyService.error(resp.message);
        }
      }).error(function(e){
        console.error(e);
        layer.close(load);
      })
    };

    $scope.load();
  }]);

/**
 * 提现银行卡设置
 */
app.controller('AccountSettingWithdrawalController',['$scope','$http','$state','$stateParams','dialogService','$compile','notifyService',
  function($scope,$http,$state,$stateParams,dialogService,$compile,notifyService){
    //列表数据
    $scope.account = {};
    $scope.data = {account_type:0};
    $scope.bankList = [];
    $scope.provinceList = [];
    $scope.cityList = [];
    $scope.areaList = [];

    $scope.load = function(id){
      var d = {account:1,bankList:1,shop:1,province:1};
      if($stateParams.id && $stateParams.id > 0){
        d.bank_card_id = $stateParams.id;
      }
      $http.post('account/getUserAccountInfo',d).success(function(resp){
        console.log(resp);
        $scope.account = resp.account;
        $scope.shop = resp.shop;

        if(resp.provinceList){
          $scope.provinceList = resp.provinceList;
        }
        if(resp.cityList){
          $scope.cityList = resp.cityList;
        }
        if(resp.areaList){
          $scope.areaList = resp.areaList;
        }
        if(resp.bankCard){
          $scope.data = resp.bankCard;
          if(resp.bankCard.city_id){
            $scope.data.city_id = resp.bankCard.city_id;
          }
        }
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.loadAreaByPid = function(pid,leve){
      $http.post('area/getSubArea',{parentId:pid}).success(function(resp){
        console.log(resp);
        if(resp.areaList && leve == 2){
          $scope.cityList = resp.areaList;
        }
        if(resp.areaList && leve == 3){
          $scope.areaList = resp.areaList;
        }
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.loadBankList = function(){
      $http.get('api/bank_map.json').success(function(resp){
        console.log(resp);
        $scope.bankList = resp.data.bank_map;
        if(! $scope.data.bank_code){
          $scope.data.bank_code = $scope.bankList[0].bank_code;
        }
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.save = function(){
      var bank = {};
      $.each($scope.bankList,function(i,d){
        if(d.bank_code == $scope.data.bank_code){
          bank = d;
          return false;
        }
      });
      if($scope.data.province_id){
        $.each($scope.provinceList,function(i,d){
          if(d.id == $scope.data.province_id){
            $scope.data.province_name = d.name;
            return false;
          }
        });
      }
      if($scope.data.city_id){
        $.each($scope.cityList,function(i,d){
          if(d.id == $scope.data.city_id){
            $scope.data.city_name = d.name;
            return false;
          }
        });
      }
      if($scope.data.area_id){
        $.each($scope.areaList,function(i,d){
          if(d.id == $scope.data.area_id){
            $scope.data.area_name = d.name;
            return false;
          }
        });
      }

      var load = layer.load(1,{shade:[0.1,'#393D49']});
      $http.post('account/saveBankCardInfo',$.extend($scope.data,bank)).success(function(resp){
        layer.close(load);
        if(resp.result == 'success'){
          notifyService.info("提现申请提交成功！");
          $state.go('console.applyWithdrawal');
        }else{
          notifyService.error(resp.message);
        }
      }).error(function(e){
        console.error(e);
        layer.close(load);
      });
    };

    $scope.load();
    $scope.loadBankList();

  }]);

/**
 * 微信充值.
 */
app.controller('RechargeMoneyAction',['$scope','$http','$state','$stateParams','$compile','$modal','dialogService','notifyService',
  function($scope,$http,$state,$stateParams,$compile,$modal,dialogService,notifyService){
    //列表数据
    $scope.data = {account_type:0,trade_type:9};
    $scope.bankList = [];
    $scope.provinceList = [];
    $scope.cityList = [];
    $scope.areaList = [];

    //列表数据
    $scope.pageData = {list:[],pageNumber:1,pageSize:10,totalPage:0,totalRow:0};
    $scope.account = {};
    $scope.shop = {};
    //过滤条件
    $scope.q = {};

    $scope.load = function(){
      $http.post('account/income').success(function(resp){
        console.log(resp);
        $scope.account = resp.account;
        $scope.shop = resp.shop;
        if($scope.shop.certification_info){
          $scope.shop.certification_info = angular.fromJson($scope.shop.certification_info);
        }
        $.each(resp.pageData.list,function(i,d){
          if(d.detail){
            d.detail = angular.fromJson(d.detail);
          }
        });
        $scope.pageData = resp.pageData;
      }).error(function(e){
        console.error(e);
      })
    };
    $scope.load();

    $scope.doGenerator = function(){
      var money = $scope.data.money;
      if(money == null || money < 0){
        notifyService.error('充值金额不能小于0！','center');
        return;
      }
      var rm = Math.random() + Math.random();

      //订单类型 - 1:订单交易, 2:提现, 3:返现, 4:返现退回, 5:退款, 6:交易手续费, 7:交易补贴, 8:系统退款, 9:充值 , 10:冻结保证金.
      var tradeType = $scope.data.trade_type;

      var modalInstance = $modal.open({
        templateUrl:'html/account/rechargeMoneyCz.html',
        controller:'RechargeMoneyActionWindow',
        backdrop:false,
        size:'sm',
        resolve:{
          money:function(){
            return money;
          },
          rm:function(){
            return rm;
          },
          tradeType:function(){
            return tradeType;
          }
        },
        scope:$scope
      });
      modalInstance.result.then(function(tplId){
        //alert('hi');
        //$state.go("app.shoppe_wei_create",{tplId:tplId});
      },function(){

      });

      // 支付宝支付.
//        	if(rechargeType==2)
//        	{
//        		document.getElementById("taobaoRecharge").submit();
//        	}
    }

  }]);

/**
 * 提示框编辑控制器.
 */
app.controller('RechargeMoneyActionWindow',['$scope','$http','$modalInstance','money','rm','tradeType',
  function($scope,$http,$modalInstance,money,rm,tradeType){

    $scope.money = money;
    $scope.rm = rm;
    $scope.tradeType = tradeType;

    $scope.cancel = function(){
      $modalInstance.dismiss('cancel');
    };

  }
]);
