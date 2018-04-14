'use strict';

/**
 * 供应商列表控制器
 */
app.controller('SupplierListController', [ '$scope', '$http', '$state','$stateParams','$compile','notifyService','pageService',
	function($scope, $http, $state,$stateParams,$compile,notifyService,pageService) {
		$scope.pageData = {};
		$scope.shop_name = "";
		$scope.auth_status = "";
		$scope.mobile = "";
	
		//设置查询条件
		$scope.setQueryParam = function(){
			if(pageService.type=="SupplierListController"){
				if(pageService.open==true){
					$scope.pageData.pageNumber = pageService.queryParam.get("pageNumber");
					$scope.pageData.pageSize = pageService.queryParam.get("pageSize");
					$scope.shop_name = pageService.queryParam.get("shop_name");
					$scope.auth_status = pageService.queryParam.get("auth_status");
					$scope.mobile = pageService.queryParam.get("mobile");
				}else{
					if($scope.pageData.pageNumber){
						pageService.queryParam.put("pageNumber",$scope.pageData.pageNumber);
					}
					if($scope.pageData.pageSize){
						pageService.queryParam.put("pageSize",$scope.pageData.pageSize);
					}
					pageService.queryParam.put("shop_name",$scope.shop_name);
					pageService.queryParam.put("auth_status",$scope.auth_status);
					pageService.queryParam.put("mobile",$scope.mobile);
				}
			}else{
				pageService.resetParam();
			}
		};
		
		$scope.pageChanged = function() {
			var load = layer.load(1, {shade: [0.1,'#393D49']});
			$scope.setQueryParam();
			pageService.type = "SupplierListController";
			$http.post('supplier/listSupplier', {
				pageNumber : $scope.pageData.pageNumber,
				pageSize : $scope.pageData.pageSize,
				shop_name : $scope.shop_name,
				mobile : $scope.mobile,
				auth_status : $scope.auth_status
			}).success(function(page) {
				layer.close(load);
				$scope.pageData = page;
				$.each($scope.pageData.list,function(i,p){
					if(p.goods_category){
						var str = p.goods_category.split(",");
						var strTemp=[];
						$.each(str,function(i,s){
							switch(s)
							{
								case "1":
								  strTemp.push("时尚女装")
								  break;
								case "2":
	 							  strTemp.push("精品男装")
								  break;
								case "2":
									strTemp.push("流行童装")
									break;
								case "4":
									strTemp.push("女式鞋靴")
									break;
								case "5":
									strTemp.push("男士鞋靴")
									break;
								case "6":
									strTemp.push("内衣综合")
									break;
								case "7":
									strTemp.push("箱包配件")
									break;
							}
						});
					    p.goods_category_name=strTemp.join(",");
					}else{
						p.goods_category_name="";
					}
					
				});
				pageService.open = false;
			}).error(function(e) {
				layer.close(load);
				console.error(e);
			});
		};
		
		$scope.freeze=function(id){
			layer.confirm('确定封号吗?', function(index){
	        	layer.close(index);
				$http.post('supplier/freezeSupplier',{id:id}).success(function(data) {
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
			$http.post('supplier/unfreezeSupplier',{id:id}).success(function(data) {
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
		
		$scope.toSupplierAuth=function(uid){
			pageService.open=true;
			$state.go('console.supplier_auth',{uid:uid});
		};
		
		$scope.toQualificationAuth=function(uid){
			pageService.open=true;
			$state.go('console.supplier_qualification_auth',{uid:uid,category:0});
		};

		$scope.setDeduct = function(supplier){
			supplier.percent_show = false;
			$http.post('supplier/setDeduct',{id:supplier.sid,deduct_percentage:supplier.deduct_percentage})
			.success(function(req){
				if(req.result=='success'){
					layer.msg('设置成功');
				}else{
					layer.alert("设置失败!", {icon: 2});
				}
			});
		};
		
		$scope.pageChanged();
		
	} ]);

/**
 * 供应商认证控制器
 */
app.controller('SupplierAuthController', [ '$scope', '$http', '$state','$stateParams','$compile','notifyService',
   	function($scope, $http, $state,$stateParams,$compile,notifyService) {
   		$scope.supplierInfo={};
   		$scope.goodsCategoryNames="";
   		$scope.status = 0;
   		$scope.audit_remark = "";
   		
   		$scope.loadData=function(){
   			$http.post('supplier/getSupplierInfo',{uid:$stateParams.uid})
   			.success(function(data) {
   				if(data){
   					$scope.supplierInfo = data;
   					$scope.getGoodsCategoryNames();
   					$scope.status = $scope.supplierInfo.uastatus;
   					$scope.audit_remark = $scope.supplierInfo.audit_remark;
   				}
   			}).error(function(e) {
   				console.error(e);
   			});
   		};
   		
   		$scope.getGoodsCategoryNames=function(){
   			$http.post('supplier/getGoodsCategoryNames',{ids:$scope.supplierInfo.goods_category})
   			.success(function(data) {
   				if(data){
   					$scope.goodsCategoryNames = data;
   				}
   			}).error(function(e) {
   				console.error(e);
   			});
   		};
   		
   		$scope.cancel=function(){
   			$state.go("console.supplier");
   		};
   		
   		$scope.save=function(){
   			if($scope.status=="3"||$scope.status=="1"){
   				if(!$scope.audit_remark){
   					alyer.msg("请填写审核不通过原因");
					return;
   				}
   			}
   			$http.post('supplier/saveSupplierAuth',{status:$scope.status,uaid:$scope.supplierInfo.uaid,auditRemark:$scope.audit_remark})
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

/**
 * 供应商资质审核控制器
 */
app.controller('QualificationAuthController', [
   		'$scope',
   		'$http',
   		'$state',
   		'$stateParams',
   		'$compile',
   		'notifyService',
   		function($scope, $http, $state, $stateParams, $compile,	notifyService) {
   			$scope.pageData = {};
   			$scope.ids = [];
   			$scope.curTab = ($stateParams.category?$stateParams.category:0);
   			$scope.category = ($stateParams.category?$stateParams.category:0);
   			$scope.qualification={};

   			$scope.pageChanged = function() {
   				$http.post('supplier/listSupplierQualification', {
   					pageNumber : $scope.pageData.pageNumber,
   					pageSize : $scope.pageData.pageSize,
   					category : $scope.category,
   					user_id : $stateParams.uid
   				}).success(function(data) {
   					if(data){
   						$.each(data.list,function(i,e){
   						if(e.detail!=null){
   							e.detail = angular.fromJson(e.detail);}
   						});
   						$scope.pageData = data;
   					}
   				}).error(function(e) {
   					console.error(e);
   				});
   			};

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

   			$scope.setTab = function(tab) {
   				$("li[id^=tab-]").removeClass();
   				$("#tab-" + tab).addClass("active");

   				$scope.curTab = tab;
   				$scope.category = tab;
   				$scope.pageChanged();
   			};
   			
   			$scope.save=function(id,pop){
   				pop.check_show = false;
   				$http.post('supplier/saveQualificationAuth', {
   					id:id,
   					status:$("#status_"+id).val()
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

   			$scope.setTab($scope.category);
   } ]);
