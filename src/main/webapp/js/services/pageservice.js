/**
 * 分页服务,用来保存查询条件
 */
app.service('pageService', [ '$http', function($http) {
	this.queryParam = new Map();
	this.queryParamBack = new Map();
	this.type="";//使用该服务的控制器的类型
	this.open=false;//判断页面是否回滚
	self = this;

	this.resetParam = function() {
		self.queryParam = new Map();
	};

	this.resetParamBack = function() {
		self.queryParamBack = new Map();
	};

	this.back = function() {
		self.queryParam.each(function(key, value, index) {
			self.queryParamBack.put(key, value);
		});
	};

} ]);