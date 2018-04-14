'use strict';

/**
 * 分销商列表控制器
 */
app.controller('ProxyListController', [ '$scope', '$http', '$state','$stateParams','$compile','notifyService','pageService',
	function($scope, $http, $state,$stateParams,$compile,notifyService,pageService) {
		$scope.pageData = {};
		$scope.shop_name = "";
		$scope.nickname = "";
		$scope.auth_status = "";
		$scope.mobile = "";
		
		//设置查询条件
		$scope.setQueryParam = function(){
			if(pageService.type=="ProxyListController"){
				if(pageService.open==true){
					$scope.pageData.pageNumber = pageService.queryParam.get("pageNumber");
					$scope.pageData.pageSize = pageService.queryParam.get("pageSize");
					$scope.nickname = pageService.queryParam.get("nickname");
					$scope.auth_status = pageService.queryParam.get("auth_status");
					$scope.mobile = pageService.queryParam.get("mobile");
				}else{
					if($scope.pageData.pageNumber){
						pageService.queryParam.put("pageNumber",$scope.pageData.pageNumber);
					}
					if($scope.pageData.pageSize){
						pageService.queryParam.put("pageSize",$scope.pageData.pageSize);
					}
					pageService.queryParam.put("nickname",$scope.nickname);
					pageService.queryParam.put("auth_status",$scope.auth_status);
					pageService.queryParam.put("mobile",$scope.mobile);
				}
			}else{
				pageService.resetParam();
			}
		};
	
		$scope.pageChanged = function() {
			$scope.setQueryParam();
			pageService.type = "ProxyListController";
			var loading = layer.load(1,{shade:[0.1,'#393D49']});
			$http.post('proxy/listProxy', {
				pageNumber : $scope.pageData.pageNumber,
				pageSize : $scope.pageData.pageSize,
				shop_name : $scope.shop_name,
				nickname : $scope.nickname,
				mobile : $scope.mobile,
				auth_status : $scope.auth_status
			}).success(function(page) {
				layer.close(loading);
				$scope.pageData = page;
				$.each($scope.pageData.list,function(i,p){
					var drz=0;
					var rzz=0;
					var yrz=0;
					var rzbtg=0;
					if(p.shops.length>0){
						var drzStr=[];
						var rzzStr=[];
						var yrzStr=[];
						var rzbtgStr=[];
						$.each(p.shops,function(i,s){
							if(s.certification_status<=0){
								drzStr.push(s.shop_name);
								drz++;
							}else if(s.certification_status==1){
								rzzStr.push(s.shop_name);
								rzz++;
							}else if(s.certification_status==2){
								yrzStr.push(s.shop_name);
								yrz++;
							}else if(s.certification_status==3){
								rzbtgStr.push(s.shop_name);
								rzbtg++;
							}
						});
						var str="";
						if(drz!=0){
							str=str+"待认证:";
							$.each(drzStr,function(i,d){
								str=str+d+" ";
								if(i==drzStr.length-1){
									str = str.substring(0,str.length-1);
									str = str+";";
								}
							});
						}
						if(rzz!=0){
							str=str+"认证中:";
							$.each(rzzStr,function(i,d){
								str=str+d+" ";
								if(i==rzzStr.length-1){
									str = str.substring(0,str.length-1);
									str = str+";";
								}
						});
						}
						if(yrz!=0){
							str=str+"已认证:";
							$.each(yrzStr,function(i,d){
								str=str+d+" ";
								if(i==yrzStr.length-1){
									str = str.substring(0,str.length-1);
									str = str+";";
								}
							});
						}
						if(rzbtg!=0){
							str=str+"认证未通过:";
							$.each(rzbtgStr,function(i,d){
								str=str+d+" ";
								if(i==rzbtgStr.length-1){
									str = str.substring(0,str.length-1);
									str = str+";";
								}
							});
						}
						p.str=str;
					}else{
						p.str="用户没有注册店铺";
					}
				});
				pageService.open = false;
			}).error(function(e) {
				console.error(e);
				layer.close(loading);
			});
		};
		
		$scope.freeze=function(id){
			layer.confirm('确定封号吗?', function(index){
				layer.close(index);
				$http.post('proxy/freezeProxy',{id:id}).success(function(data) {
					if(data.result=='success'){
						layer.msg(data.message);
						$scope.pageChanged();
					}else{
						layer.alert(data.message, {icon: 2});
					}
				}).error(function(e) {
					console.error(e);
				});
			});
		};
		
		$scope.unfreeze=function(id){
			$http.post('proxy/unfreezeProxy',{id:id}).success(function(data) {
				if(data.result=='success'){
					layer.msg(data.message);
					$scope.pageChanged();
				}else{
					layer.alert(data.message, {icon: 2});
				}
			}).error(function(e) {
				console.error(e);
			});
		};
		
		$scope.toProxyShopList=function(uid){
			pageService.open = true;
			$state.go('console.proxy_shop_auth',{uid:uid});
		};
		
		$scope.pageChanged();
		
	} ]);

/**
 * 分销商店铺审核控制器
 */
app.controller('ProxyShopAuthController', [
   		'$scope',
   		'$http',
   		'$state',
   		'$stateParams',
   		'$compile',
   		'notifyService',
   		function($scope, $http, $state, $stateParams, $compile,	notifyService) {
   			$scope.pageData = [];
   			$scope.mobile="";
   			
   			$scope.pageChanged = function() {
   				$http.post('proxy/listProxyShop',{
   					uid : $stateParams.uid
   				}).success(function(data) {
   					console.log(data);
   					if(data){
   						$scope.pageData = data;
   						$.each($scope.pageData,function(i,d){
   							if(!d.contact_mobile){
   								if(d.service_phone){
   									d.contact_mobile=d.service_phone;
   								}else{
   									d.contact_mobile=d.userMobile;
   								}
   							}
   							if(d.auth){
	   							if(d.auth.identity_num){
	   								d.authShow=true;
	   							}else{
	   								d.authShow=false;
	   							}
   							}else{
   								d.authShow=false;
   							}
   						});
   					}
   				}).error(function(e) {
   					console.error(e);
   				});
   			};
   			
   			$scope.loadSelect = function(){
   				$.each($scope.pageData,function(i,d){
					var str = "#status_"+d.auth.id+" option[value='"+d.auth.status+"']";
					$(str).attr("selected",true);
				});
   			}

   			$scope.checkAll = function() {// 全选
   				var flag = !$scope.isCheckedAll();
   				$.each($scope.pageData.list, function(index, ele) {
   					ele.chk = flag;
   					if (flag) {
   						$scope.ids.push(ele.id);
   					}
   				});
   				if (!flag) {
   					$scope.ids = [];
   				}
   			};

   			$scope.isCheckedAll = function() {
   				var flag = true;
   				if (!$scope.pageData.list) {
   					return false;
   				}
   				$.each($scope.pageData.list, function(index, ele) {
   					if (!ele.chk) {
   						flag = false;
   						return false;
   					}
   				});
   				return flag;
   			};

   			$scope.getCheckIds = function() {
   				$scope.ids = [];
   				$.each($scope.pageData.list, function(index, ele) {
   					if (ele.chk) {
   						$scope.ids.push(ele.id);
   					}
   				});
   			};

   			$scope.save=function(id){
   				if($("#status_"+id).val()=="3"||$("#status_"+id).val()=="1"){
   					var str = $("#audit_remark_"+id).val();
   					if(str==""){
   						layer.alert("请填写备注");
   						return;
   					}
   				}
   				$http.post('proxy/saveProxyShopAuth',{
   					uaid:id,
   					status:$("#status_"+id).val(),
   					auditRemark:$("#audit_remark_"+id).val()
   				}).success(function(data) {
   					if(data.result=="success"){
   						layer.msg(data.message);
   						$scope.pageChanged();
   					}else{
   						layer.alert(data.message, {icon: 2});
   					}
   				}).error(function(e) {
   					console.error(e);
   				});
   			};
   			
   			$scope.toQualificationAuth=function(sid){
   				$state.go('console.proxy_qualification_auth',{sid:sid,category:0});
   			};
   			
   			$scope.pageChanged();

   } ]);

/**
 * 供应商资质审核控制器
 */
app.controller('ProxyQualificationAuthController', [
   		'$scope',
   		'$http',
   		'$state',
   		'$stateParams',
   		'$compile',
   		'notifyService',
   		function($scope, $http, $state,$stateParams,$compile,notifyService) {
   	   		$scope.proxy={};
   	   		$scope.goodsCategoryNames="";
   	   		$scope.status = 0;
   	   		$scope.audit_remark = "";
   	   		
   	   		$scope.loadData=function(){
   	   			$http.post('proxy/getProxyInfo',{sid:$stateParams.sid})
   	   			.success(function(data) {
   	   				if(data){
   	   					$scope.proxy = data;
   	   					$scope.getGoodsCategoryNames();
   	   					$scope.status = $scope.proxy.uastatus;
   	   					$scope.audit_remark = $scope.proxy.audit_remark;
   	   				}
   	   			}).error(function(e) {
   	   				console.error(e);
   	   			});
   	   		};
   	   		
   	   		$scope.getGoodsCategoryNames=function(){
   	   			$http.post('supplier/getGoodsCategoryNames',{ids:$scope.proxy.goods_category})
   	   			.success(function(data) {
   	   				if(data){
   	   					$scope.goodsCategoryNames = data;
   	   				}
   	   			}).error(function(e) {
   	   				console.error(e);
   	   			});
   	   		};
   	   		
   	   		$scope.cancel=function(){
   	   			$state.go("console.proxy");
   	   		};
   	   		
   	   		$scope.save=function(){
   	   			if($scope.status=="3"||$scope.status=="1"){
   	   				if(!$scope.audit_remark){
   	   					layer.alert("请填写审核不通过原因");
   						return;
   	   				}
   	   			}
   	   			$http.post('proxy/saveProxyShopAuth',{status:$scope.status,uaid:$scope.proxy.uaid,auditRemark:$scope.audit_remark})
   	   			.success(function(data) {
   	   				if(data.result=="success"){
   	   					layer.msg(data.message);
   	   					$scope.cancel();
   	   				}else{
   	   					layer.alert(data.message, {icon: 2});
   	   				}
   	   			}).error(function(e) {
   	   				console.error(e);
   	   			});
   	   		};
   	   		
   	   		$scope.loadData();
   	   		
   	   	} ]);
