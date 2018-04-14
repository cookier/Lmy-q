//满减送
'use strict';

app.controller('ActivityFullSubGiveListController', [
		'$scope',
		'$http',
		'$state',
		'$stateParams',
		'notifyService',
		function($scope, $http, $state, $stateParams, notifyService) {
			$scope.pageData = {};
			$scope.curTab = 0;
			$scope.name = "";
			$scope.status = "-1";

			$scope.setTab = function(tab) {
				$("li[id^=tab-]").removeClass();
				$("#tab-" + tab).addClass("active");

				$scope.curTab = tab;
				$scope.status = tab;
				$scope.pageChanged();
			};

			$scope.pageChanged = function() {
				$http.post('activityFullSubGive/listActivityFullSubGive', {
					pageNumber : $scope.pageData.pageNumber,
					pageSize : $scope.pageData.pageSize,
					name : $scope.name,
					status : $scope.status
				}).success(function(page) {
					$scope.pageData = page;
				}).error(function(e) {
					layer.alert("操作失败",{icon:2});
				});
			};

			$scope.setInvalid = function(item) {
				layer.confirm("确定使该满减送失效吗?",function(index){
					layer.close(index);
					var load = layer.load(1, {shade: [0.1,'#393D49']});
					$http.post('activityFullSubGive/updateActivityFullSubGiveInvalid', item)
							.success(function(data) {
								layer.close(load);
								layer.msg(data.message);
								if (data.result == "success") {
									$scope.pageChanged();
								}
							}).error(function(e) {
								layer.close(load);
								layer.alert("操作失败",{icon:2});
							});
				});
			};

			$scope.del = function(id) {
				layer.confirm("确定删除吗?",function(index){
					layer.close(index);
					var load = layer.load(1, {shade: [0.1,'#393D49']});
					$http.post('activityFullSubGive/deleteActivityFullSubGive', {
						id : id
					}).success(function(data) {
						layer.close(load);
						layer.msg(data.message);
						if (data.result == "success") {
							$scope.pageChanged();
						}
					}).error(function(e) {
						console.error(e);
					});
				});
			};
			
			$scope.start = function(id) {
				$http.post('activityFullSubGive/startActivityFullSubGive', {
					id : id
				}).success(function(data) {
					layer.msg(data.message);
					if (data.result == "success") {
						$scope.pageChanged();
					}
				}).error(function(e) {
					console.error(e);
				});
			};
			
			$scope.stop = function(id) {
				$http.post('activityFullSubGive/stopActivityFullSubGive', {
					id : id
				}).success(function(data) {
					layer.msg(data.message);
					if (data.result == "success") {
						$scope.pageChanged();
					}
				}).error(function(e) {
					console.error(e);
				});
			};

			$scope.pageChanged();

		} ]);

app.controller('ActivityFullSubGiveEditController', [
		'$scope',
		'$http',
		'$state',
		'$stateParams',
		'notifyService',
		function($scope, $http, $state, $stateParams, notifyService) {
			$scope.activityFullSubGive = {
				discount_type : 0,
				goods_range : 0,
				status :0
			};
			$scope.goodses = [];
			$scope.selected = [];
			$scope.goodsTags = [];
			$scope.goodsTag = "";
			$scope.title = "";
			$scope.pageData = [];
			$scope.discount_settings = [{id:0,list:[],orderMinLimit:0.0,isFreePostage:0,isGiveScore:0,isGiveCoupon:0,isGiveGift:0,isSubtractCash:0,subtractCash:0,giveScore:0}];
			$scope.coupons=[];
			$scope.gifts=[];

			$scope.loadActivityFullSubGive = function() {
				$http.post('activityFullSubGive/getActivityFullSubGive', {
					id : $stateParams.id
				}).success(
						function(data) {
							if (data) {
								$scope.activityFullSubGive = data;
								$scope.goodses = angular
										.fromJson(data.goods_info);
								$scope.discount_settings = angular
										.fromJson(data.discount_setting);
							}else{
								if($stateParams.id>0)
								layer("数据加载失败，请稍后再试!",{icon:2});
							}
						}).error(function(e) {
					console.error(e);
				});
			};
			
			$scope.loadCoupons=function(){
				$http.post('coupon/getUseableCoupons').success(
						function(data) {
							if (data) {
								$scope.coupons = data;
							}
						}).error(function(e) {
					console.error(e);
				});
			};
			
			$scope.loadGifts=function(){
				$http.post('gift/getUseableGifts').success(
						function(data) {
							if (data) {
								$scope.gifts = data;
							}
						}).error(function(e) {
					console.error(e);
				});
			};
			
			$scope.loadGoodsTags = function() {
				$http.post("goodsTags/getGoodsTags").success(function(data) {
					if (data) {
						$scope.goodsTags = data;
					}
				}).error(function(e) {
					console.error(e);
				});
			};

			$scope.pageChanged = function() {
				$scope.selected = [];
				if($scope.goodses&&$scope.goodses.length>0){
					$.each($scope.goodses, function(i, e) {
						$scope.selected.push(e.id);
					});
				}
				$http.post("goods/listGoods", {
					title : $scope.title,
					goodsTagId : $scope.goodsTag,
					pageNumber : $scope.pageData.pageNumber,
					pageSize : $scope.pageData.pageSize,
					ids : $scope.selected.join(",")
				}).success(function(data) {
					if (data) {
						$scope.pageData = data;
					}
				}).error(function(e) {
					console.error(e);
				});
			};

			$scope.selectGoods = function() {
				if ($scope.goodsTags.length == 0) {
					$scope.loadGoodsTags();
				}
				if ($scope.pageData.length == 0) {
					$scope.pageChanged();
				}
				$("#div_goods").show();
			};

			$scope.unselectGoods = function() {
				$("#div_goods").hide();
				$scope.goodses = [];
				$scope.pageChanged();
			};

			$scope.join = function(goods) {
				if(!$scope.goodses){
					$scope.goodses=[];
				}
				$scope.goodses.push(goods);
				$scope.pageChanged();
			};

			$scope.quit = function(goods) {
				$scope.goodses.splice($scope.goodses.indexOf(goods), 1);
				$scope.pageChanged();
			};

			$scope.save = function() {
				$("#div_goods").hide();
				var a1= [];
				$.each($scope.discount_settings,function(i,e){
					a1.push(e.orderMinLimit);
					
					if(e.isGiveCoupon&&e.isGiveCoupon==1&&e.coupon){
						$.each($scope.coupons,function(i1,e1){
							if(e.coupon==e1.id){
								e.coupon_name = e1.name;
								e.coupon_amount = e1.amount;
								e.coupon_valid_time = e1.valid_time;
								e.coupon_expire_time = e1.expire_time;
							}
						});
					}else{
						e.coupon="";
						e.coupon_name="";
						e.coupon_amount = 0;
						e.coupon_valid_time = "";
						e.coupon_expire_time = "";
					}
					
					if(e.isSubtractCash&&e.isSubtractCash==0){
						e.subtractCash = 0;
					}
					
					if(e.isGiveScore&&e.isGiveScore==0){
						e.giveScore=0;
					}
					
				});
				var a2=a1.sort(); 

				for(var i=0;i<a2.length;i++){ 
					if (a2[i]==a2[i+1]){ 
					alert("重复的优惠门槛："+a2[i]); 
					return;
					} 
				}

				var data = $.extend($scope.activityFullSubGive, {
					goods_info : angular.toJson($scope.goodses),
					discount_setting:angular.toJson($scope.discount_settings)
				});
				
				$http.post("activityFullSubGive/saveActivityFullSubGive", data).success(
						function(data) {
							layer.msg(data.message);
							if (data.result == "success") {
								$state.go("console.ump_activityfullsubgive_list");
							}
						}).error(function(e) {
					console.error(e);
				});

			};

			$scope.cancel = function() {
				$state.go("console.ump_activityfullsubgive_list");
			};

			$scope.removeMoreYouhui = function() {
				$("#tfoot").hide();
				var youhui1 = $scope.discount_settings[0];
				$scope.discount_settings= [];
				$scope.discount_settings.push(youhui1);
			};

			$scope.addMoreYouhui = function() {
				$("#tfoot").show();
			};
			
			$scope.addYouhui=function(){
				var row = {id:$scope.discount_settings.length,orderMinLimit:0.0,isFreePostage:0,isGiveScore:0,isGiveCoupon:0,isGiveGift:0,isSubtractCash:0,subtractCash:0,giveScore:0};
				$scope.discount_settings.push(row);
			};
			
			$scope.removeYouhui=function(item){
				$scope.discount_settings.splice($scope.discount_settings.indexOf(item),1);
			};

			$scope.loadCoupons();
			$scope.loadGifts();
			$scope.loadActivityFullSubGive();

		} ]);