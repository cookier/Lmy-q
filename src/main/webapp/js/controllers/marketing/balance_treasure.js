'use strict';

/**
 * 余额宝
 */
app.controller('BalanceTreasureController', ['$scope','$http','$state','$stateParams','notifyService',function($scope, $http, $state, $stateParams, notifyService) {
	// 列表数据
	$scope.pageData = {
		list : [],
		pageNumber : 1,
		pageSize : 10,
		totalPage : 0,
		totalRow : 0
	};
	$scope.mobile = "";
	$scope.beginCreateTime = "";
	$scope.endCreateTime = "";
	$scope.sumMoney={};
    $scope.init = function() {
    	$http.post('balanceTreasure/getYzbUserAccount').success(function(response) {
    		$scope.sumMoney=response.sumUserMoney;
			}).error(function(e) {
			console.error(e);
		});
    }
	$scope.pageChanged = function() {
		if ($("#beginCreateTime").val() == "") {
			$scope.beginCreateTime = "";
		}
		if ($("#endCreateTime").val() == "") {
			$scope.endCreateTime = "";
		}
		var data = $.extend({}, $scope.activity, {
			pageNumber : $scope.pageData.pageNumber,
			pageSize : $scope.pageData.pageSize,
			mobile : $scope.mobile,
			beginCreateTime : $scope.beginCreateTime,
			endCreateTime : $scope.endCreateTime
		});
		var load=layer.load(2);
		$http.post('balanceTreasure/getList', data).success(
			function(response) {
				layer.close(load);
				if (response.list)
					$scope.pageData = response;
				else
					$scope.pageData = {
						list : [],
						pageNumber : 1,
						pageSize : 10,
						totalPage : 0,
						totalRow : 0
					};
			}).error(function(e) {
			console.error(e);
		});
	};

	/*
	 * 设置查询时间
	 */
	$scope.setQueryTime = function(day) {
		var curTime = new Date();
		var lastDate = DateUtil.dateAdd('d', day, curTime);
		lastDate.setHours(0, 0, 0, 0);
		$scope.beginCreateTime = DateUtil.dateToStr(
			"yyyy-MM-dd HH:mm:ss", lastDate);
		$scope.endCreateTime = DateUtil.dateToStr(
			"yyyy-MM-dd HH:mm:ss", curTime);
	};

	$scope.init();
	$scope.pageChanged();
} ]);

app.controller('BalanceTreasureDetailController', ['$scope','$http','$state','$stateParams','notifyService',function($scope, $http, $state, $stateParams, notifyService) {
	// 列表数据
	$scope.pageData = {
		list : [],
		pageNumber : 1,
		pageSize : 10,
		totalPage : 0,
		totalRow : 0
	};	
	$scope.sumMoney={};
	$scope.data={};
	$scope.pageChanged = function() {
		if ($("#beginCreateTime").val() == "") {
			$scope.data.beginCreateTime = "";
		}
		if ($("#endCreateTime").val() == "") {
			$scope.data.endCreateTime = "";
		}
		$scope.data.pageNumber = $scope.pageData.pageNumber;
		$scope.data.pageSize = $scope.pageData.pageSize;
		$scope.data.user_id = $stateParams.user_id;
		console.log($scope.data);
		var load=layer.load(2);
		$http.post('balanceTreasure/getDetailList',$scope.data).success(function(response) {
				layer.close(load);
				if (response.list)
					$scope.pageData = response;
				else
					$scope.pageData = {
						list : [],
						pageNumber : 1,
						pageSize : 10,
						totalPage : 0,
						totalRow : 0
					};
			}).error(function(e) {
			console.error(e);
		});
	};
	$scope.init = function() {
    	$http.post('balanceTreasure/getYzbUserAccount', {user_id:$stateParams.user_id}).success(function(response) {
    		$scope.user=response.user;
    		$scope.sumMoney=response.sumUserMoney;
    		$scope.tradeType=response.tradeType;
		}).error(function(e) {
			console.error(e);
		});
    }
	$scope.init();
	$scope.pageChanged();
	/*
	 * 设置查询时间
	 */
	$scope.setQueryTime = function(day) {
		var curTime = new Date();
		var lastDate = DateUtil.dateAdd('d', day, curTime);
		lastDate.setHours(0, 0, 0, 0);
		$scope.data.beginCreateTime = DateUtil.dateToStr(
			"yyyy-MM-dd HH:mm:ss", lastDate);
		$scope.data.endCreateTime = DateUtil.dateToStr(
			"yyyy-MM-dd HH:mm:ss", curTime);
	};
} ]);
