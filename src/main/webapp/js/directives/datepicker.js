app.directive('datePicker', function() {
	return {
		restrict : 'A',
		require : 'ngModel',
		scope : {
			minDate : '@',
		},
		link : function(scope, element, attr, ngModel) {
			element.val(ngModel.$viewValue);

			function onpicking(dp) {
				var date = dp.cal.getNewDateStr();
				scope.$apply(function() {
					ngModel.$setViewValue(date);
				});
			}

			element.bind('click', function() {
				var att = {
					onpicking : onpicking,
					dateFmt : 'yyyy-MM-dd HH:mm:ss'
				};
				if (attr.datePicker) {
					var d = angular.fromJson(attr.datePicker);
					var a = $.extend({}, att, d);
					WdatePicker(a);
				} else {
					WdatePicker(att);
				}
			});
		}
	};
});