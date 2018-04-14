'use strict';

/**
 * 活动管理控制器
 */
app.controller('ActivityListController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'notifyService',
  function($scope,$http,$state,$stateParams,notifyService){
    // 列表数据
    $scope.pageData = {
      list:[],
      pageNumber:1,
      pageSize:10,
      totalPage:0,
      totalRow:0
    };
    $scope.activity = {};
    $scope.name = "";
    $scope.beginCreateTime = "";
    $scope.endCreateTime = "";
    $scope.months = [];

    $scope.dateAssigned = function(){
      var date = new Date;
      var m = date.getMonth();
      if(m == 0){
        var month = {};
        month.name = '12月';
        month.value = 12;
        $scope.months.push(month);
      }else{
        for(var i = 0; i < 5; i ++){
          var month = {};
          month.name = m - i + "月";
          month.value = m - i;
          if(month.value > 0){
            $scope.months.push(month);
          }else{
            break;
          }
        }
      }
    };

    $scope.pageChanged = function(){
      if($("#beginCreateTime").val() == ""){
        $scope.beginCreateTime = "";
      }
      if($("#endCreateTime").val() == ""){
        $scope.endCreateTime = "";
      }
      var data = $.extend({},$scope.activity,{
        pageNumber:$scope.pageData.pageNumber,
        pageSize:$scope.pageData.pageSize,
        name:$scope.name,
        beginCreateTime:$scope.beginCreateTime,
        endCreateTime:$scope.endCreateTime
      });
      $http.post('activity/listActivity',data).success(
        function(response){
          if(response.page)
            $scope.pageData = response.page;
          else
            $scope.pageData = {
              list:[],
              pageNumber:1,
              pageSize:10,
              totalPage:0,
              totalRow:0
            };
        }).error(function(e){
        console.error(e);
      });
    };

    /*
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

    $scope.save = function(id){
      $http.post('activity/saveActivity',{
        id:id,
        status:$("#status_" + id).val()
      }).success(function(response){
        if(response.result == 'success'){
          layer.msg(response.message);
          $scope.pageChanged();
        }else{
          layer.alert(response.message,{icon:2});
        }
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.delActivity = function(id,data){
      layer.confirm('确认删除该活动吗?',function(index){
        layer.close(index);
        $http.post('activity/delActivity',{
          id:id
        }).success(function(response){
          if(response.result == 'success'){
            layer.msg(response.message);
            angular.element('div.popover-inner').remove();
            $scope.pageChanged();
          }else{
            layer.alert(response.message,{icon:2});
          }
        }).error(function(e){
          console.error(e);
        });
      });
    };

    $scope.stopActivity = function(id){
      $http.post('activity/stopActivity',{
        id:id
      }).success(function(response){
        if(response.result == 'success'){
          layer.msg(response.message);
          $scope.pageChanged();
        }else{
          layer.alert(response.message,{icon:2});
        }
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.invalidActivity = function(id){
      $http.post('activity/invalidActivity',{
        id:id
      }).success(function(response){
        if(response.result == 'success'){
          layer.msg(response.message);
          $scope.pageChanged();
        }else{
          layer.alert(response.message,{icon:2});
        }
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.suspendActivity = function(id){
      $http.post('activity/suspendActivity',{
        id:id
      }).success(function(response){
        if(response.result == 'success'){
          layer.msg(response.message);
          $scope.pageChanged();
        }else{
          layer.alert(response.message,{icon:2});
        }
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.resumeActivity = function(id){
      $http.post('activity/resumeActivity',{
        id:id
      }).success(function(response){
        if(response.result == 'success'){
          layer.msg(response.message);
          $scope.pageChanged();
        }else{
          layer.alert(response.message,{icon:2});
        }
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.pageChanged();
    $scope.dateAssigned();

  }]);

app.controller('ActivityEditController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'dialogService',
  '$compile',
  '$modal',
  'notifyService',
  function($scope,$http,$state,$stateParams,dialogService,$compile,
           $modal,notifyService){
    $scope.curTab = 1;
    $scope.activity = {};
    $scope.list = [];

    $scope.uploadPic = function(){
      dialogService.openPicUploadDialog(function(data){
        if(data){
          layer.msg('图片上传成功!');
          $("#logo").html("<img src='" + data[0].url + "'>");
          $("#logo").show();
          $scope.activity.logo_path = data[0].file_url;
          $scope.activity.logo_url = data[0].url;
        }else{
          layer.alert("图片上传失败",{icon:2});
        }
      },0,0,"myfile");
    };

    $scope.save = function(action){
      if(action == "activity"){
        if($scope.activity == null
          || $scope.activity.title == null
          || $scope.activity.begin_time == null
          || $scope.activity.end_time == null){
          layer.alert("表单数据不完整",{icon:2});
          return;
        }
        $http.post('activity/saveActivity',$scope.activity)
        .success(function(response){
          if(response.result == 'success'){
            layer.msg(response.message);
            $scope.activity = response.activity;
          }else{
            layer.alert(response.message,{icon:2});
          }
        }).error(function(e){
          console.error(e);
        });
      }
    };

    $scope.back = function(){
      $state.go('console.activity');
    };

    $scope.delRule = function(id,pop){
      layer.confirm('确认删除该活动吗?',function(index){
        layer.close(index);
        $http.post('activityRule/delRule',{
          'id':id
        }).success(function(response){
          if(response && response.result == "success"){
            layer.msg(response.message);
          }else{
            layer.alert("删除失败",{icon:2});
          }
          $scope.loadRules();
        }).error(function(e){
          console.error(e);
        });
      });
    };

    $scope.invalidRule = function(id){
      layer.confirm('确认删除该活动吗?',function(index){
        layer.close(index);
        $http.post('activityRule/invalidRule',{
          'id':id
        }).success(function(response){
          layer.msg(response.message);
          $scope.loadRules();
        }).error(function(e){
          console.error(e);
        });
      });
    };

    $scope.load = function(){
      if($stateParams.id > 0){
        $http.post('activity/getActivity',{
          'id':$stateParams.id
        }).success(
          function(response){
            if(response){
              $scope.activity = response.activity;
              $("#logo").html(
                "<img src='"
                + $scope.activity.logo_url
                + "'/>");
              $("#logo").show();
            }

          }).error(function(e){
          console.error(e);
        });
      }
    };

    $scope.loadRules = function(){
      if($scope.activity.id){
        $http.post('activityRule/getActivityRules',{
          'id':$scope.activity.id
        }).success(function(response){
          $scope.list = response;
          if(response){
            $.each($scope.list,function(i,d){
              if(d.prize){
                var prize = angular.fromJson(d.prize)
                d.context = prize.name;
              }
            });
          }
        }).error(function(e){
          console.error(e);
        });
      }
    };

    $scope.addRuleByActivity = function(){
      if(! $scope.activity.id){
        layer.alert('请先填加和保存活动！');
        return;
      }

      dialogService.openRuleDialog(function(data){
        if(data.extr_content){
          data.extr_content = angular.toJson(data.extr_content);
        }
        $http.post('activityRule/saveActivityRule',data).success(
          function(response){
            if(response.result == "success"){
              layer.msg(response.message);
              $scope.loadRules();
            }else if(response.result == "fail"){
              layer.alert(response.message);
            }else{
              layer.alert(response.message);
            }
          }).error(function(e){
          console.error(e);
        });
      },$.extend(true,{},$scope.activity));
    };

    $scope.editRuleByActivity = function(ruleId){
      if(! $scope.activity.id){
        layer.alert('请先填加和保存活动！');
        return;
      }
      dialogService.openRuleDialog(function(data){
        data.extr_content = angular.toJson(data.extr_content);
        $http.post('activityRule/saveActivityRule',data).success(
          function(response){
            if(response.result == "success"){
              layer.msg(response.message);
              $scope.loadRules();
            }else if(response.result == "fail"){
              layer.alert(response.message);
            }else{
              layer.alert(response.message);
            }
          }).error(function(e){
          console.error(e);
        });
      },$.extend(true,{
        ruleId:ruleId
      },$scope.activity));
    };

    $scope.editInfo = function(){
      $scope.curTab = 1;
    };

    $scope.editRule = function(){
      $scope.curTab = 2;
      $scope.loadRules();
    };

    $scope.load();

  }]);

app.controller('ActivityAwardsController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'dialogService',
  '$compile',
  'notifyService',
  function($scope,$http,$state,$stateParams,dialogService,$compile,notifyService){
    $scope.userAwards = [];
    $scope.pageData = {};
    $scope.load = function(){

      if($stateParams.id > 0){
        var data = $.extend({},$scope.activity,{
          pageNumber:$scope.pageData.pageNumber,
          pageSize:$scope.pageData.pageSize,
          'id':$stateParams.id,
          'cycle':$stateParams.cycle
        });
        $http.post('activity/getActivityAwards',data).success(
          function(response){
            $scope.list = response.list;
            $scope.completedList = angular.fromJson(response.distribution_details);
            $.each($scope.list,function(index,o){
              o.completed_flag = false;
              o.bonus = 0;
              if($scope.completedList){
                $.each($scope.completedList,function(index,c){
                  if(o.user_id == c.user_id){
                    o.completed_flag = true;
                    o.bonus = c.money;
                  }
                });
              }

            });

          }).error(function(e){
          console.error(e);
        });
      }
    };

    $scope.loadAward = function(rowdata){
      dialogService.openActivityAwardsDialog(function(){
        $scope.load();
      },$.extend(true,{cycle:$stateParams.cycle,activity_id:$stateParams.id},rowdata));
    }

    $scope.load();

  }]);

app.controller('ActivityParticipationController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'dialogService',
  '$compile',
  'notifyService',
  function($scope,$http,$state,$stateParams,dialogService,$compile,
           notifyService){
    $scope.pageData = {};
    $scope.nickname = "";
    $scope.mobile = "";
    $scope.role = "";
    $scope.rules = [];
    $scope.userBlanklist = {};
    $scope.option = "";

    $scope.pageChanged = function(){
      if($stateParams.id > 0){
        var data = $.extend({},{
          pageNumber:$scope.pageData.pageNumber,
          pageSize:$scope.pageData.pageSize,
          nickname:$scope.nickname,
          mobile:$scope.mobile,
          role:$scope.role,
          'id':$stateParams.id
        });
        $http.post('activity/listActivityParticipation',data).success(
          function(response){
            $scope.pageData = response.page;
            $scope.rules = response.rules;
          }).error(function(e){
          console.error(e);
        });
      }
    };

    $scope.setRole = function(apId,role){
      if(role == 0){
        layer.confirm("推广者不参与排名,确认设置为推广者吗?",function(index){
          layer.close(index);
          $http.post('activity/setActivityParticipationRole',{apId:apId,role:role}).success(
            function(response){
              layer.msg(response.message);
              $scope.pageChanged();
            }).error(function(e){
            console.error(e);
          });
        })
      }else{
        $http.post('activity/setActivityParticipationRole',{apId:apId,role:role}).success(
          function(response){
            layer.msg(response.message);
            $scope.pageChanged();
          }).error(function(e){
          console.error(e);
        });
      }

    };

    $scope.showBlanklistDialog = function(ap,option){
      $scope.option = option;
      $http.post('activity/getActivityParticipationBlanklist',{apId:ap.id})
      .success(
        function(response){
          if(option == 'remove' || (option == 'join' && response.blanklist && response.blanklist.invalid_status == 0)){
            $scope.userBlanklist = response.blanklist;
            if($scope.userBlanklist && $scope.userBlanklist.exclude_rule_ids){
              var ruleIds = $scope.userBlanklist.exclude_rule_ids.split(",");
              var newRuleIds = new Array(ruleIds.length);
              $.each(ruleIds,function(i,e){
                newRuleIds.push(parseInt(e));
              });
              $scope.userBlanklist.exclude_rule_ids = newRuleIds;
            }
          }else{
            $scope.userBlanklist = {};
          }
          ap.blanklist_show = true;
        }).error(function(e){
        console.error(e);
      });
    };

    $scope.joinBlanklist = function(userBlanklist,ap){
      if(userBlanklist.exclude_rule_ids && (userBlanklist.exclude_rule_ids instanceof Array)){
        userBlanklist.exclude_rule_ids = userBlanklist.exclude_rule_ids.join(",");
      }
      var data = $.extend(userBlanklist,{
        ap_id:ap.id,
        user_id:ap.user_id,
        activity_id:ap.activity_id
      });
      $http.post('activity/setActivityParticipationBlanklist',data).success(
        function(response){
          layer.msg(response.message);
          $scope.load();
        }).error(function(e){
        console.error(e);
      });
      ap.blanklist_show = false;
      location.reload();
    };

    $scope.removeBlanklist = function(ap){
      $http.post('activity/removeActivityParticipationBlanklist',{apId:ap.id}).success(
        function(response){
          layer.msg(response.message);
          $scope.load();
        }).error(function(e){
        console.error(e);
      });
      ap.blanklist_show = false;
      location.reload();
    };

    $scope.pageChanged();

  }]);

app.controller('ActivityParticipationRecommendController',[
  '$scope',
  '$http',
  '$state',
  '$stateParams',
  'dialogService',
  '$compile',
  'notifyService',
  function($scope,$http,$state,$stateParams,dialogService,$compile,
           notifyService){
    $scope.pageData = [];

    $scope.load = function(){
      if($stateParams.uid > 0 && $stateParams.aid > 0){
        var data = $.extend({},{
          'userId':$stateParams.uid,
          'activityId':$stateParams.aid,
        });
        var loading = layer.load(1,{shade:[0.1,'#393D49']});
        $http.post('activity/listActivityParticipationRecommend',data).success(
          function(response){
            layer.close(loading);
            $scope.pageData = response;
          }).error(function(e){
          layer.close(loading);
          console.error(e);
        });
      }
    };

    $scope.load();

  }]);

app.controller('AccountIncomeController',['$scope','$http','$state','$stateParams','dialogService','$compile','notifyService',
  function($scope,$http,$state,$stateParams,dialogService,$compile,notifyService){
    //列表数据
    $scope.pageData = {list:[],pageNumber:1,pageSize:10,totalPage:0,totalRow:0};
    $scope.account = {};
    //过滤条件
    $scope.q = {};
    $scope.uid = $stateParams.uid;
    $scope.nickname = $stateParams.nickname;

    $scope.load = function(){
      $http.post('activity/income',{uid:$scope.uid}).success(function(resp){
        $scope.account = resp.account;
        if(resp.pageData){
          $.each(resp.pageData.list,function(i,d){
            if(d.detail){
              d.detail = angular.fromJson(d.detail);
            }
          });
        }
        $scope.pageData = resp.pageData;
      }).error(function(e){
        console.error(e);
      })
    };

    $scope.load();
  }]);

