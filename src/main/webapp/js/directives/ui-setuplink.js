//noinspection UnterminatedStatementJS
/**
 * Created by yml on 2015/9/15.
 * 链接设置选择标签。用于显示当前连接型类和内容，提供下拉选择菜单。
 */
angular.module('app').controller('UiSetupLinkController', ['$scope', '$attrs','dialogService', function ($scope, $attrs,dialogService) {
    //noinspection UnterminatedStatementJS
    $scope.TYPE_MAP = {
        feature: '微页面',
        category: '微页面分类',
        topic: '专题',
        article: '资讯',
        goods: '商品',
        tag: '商品标签',
        activity: '营销活动',
        guaguale: '营销活动',
        wheel: '营销活动',
        zodiac: '营销活动',
        crazyguess: '营销活动',
        survey: '调查',
        homepage: '店铺主页',
        usercenter: '会员主页',
        history: '历史信息',
        link: '外链',
        checkin: '签到',
        allgoods: "全部商品",
        cart: "购物车"
    };

    $scope.setLinkUrl=function(url)//noinspection UnterminatedStatementJS
    {
    	url.sLU_show=false;
        $scope.link_type='link';
        $scope.link_title = url;
        $scope.link_url = url;
        
    };


    $scope.setFeature = function()//noinspection UnterminatedStatementJS
    {
        dialogService.openFeatureChoser(function (items) {
            var feature = items[0];
            $scope.link_type= feature.data_type;
            $scope.link_id= feature.id;
            $scope.link_title=feature.title;
            $scope.link_url= feature.url;
        },1,'feature');
    };

    $scope.setCategory = function()//noinspection UnterminatedStatementJS
    {
        dialogService.openFeatureChoser(function (items) {
            var feature = items[0];
            $scope.link_type= feature.data_type;
            $scope.link_id= feature.id;
            $scope.link_title=feature.title;
            $scope.link_url= feature.url;
        },1,'category');
    };

    $scope.setGoods=function()//noinspection UnterminatedStatementJS
    {
        dialogService.openGoodsChoser(function(items){
            var goods = items[0];
            $scope.link_type= "goods";
            $scope.link_id= goods.id;
            $scope.link_title=goods.title;
            $scope.link_url= goods.url;
        });
    };

    $scope.setTag=function()//noinspection UnterminatedStatementJS
    {
        dialogService.openGoodsTagChoser(function (items) {
            var goods = items[0];
            $scope.link_type= 'tag';
            $scope.link_id= goods.id;
            $scope.link_title= goods.group_name;
            $scope.link_url=goods.url;
        });
    };

    $scope.setHomepage=function()//noinspection UnterminatedStatementJS
    {
        $scope.link_type= 'homepage';
        $scope.link_title= $scope.TYPE_MAP['homepage'];
        $scope.link_url="homepage";
    };

    $scope.setUsercenter=function()//noinspection UnterminatedStatementJS
    {
        $scope.link_type= 'usercenter';
        $scope.link_title= $scope.TYPE_MAP['usercenter'];
        $scope.link_url="usercenter";
    };

    $scope.setHistory=function()//noinspection UnterminatedStatementJS
    {
        $scope.link_type= 'history';
        $scope.link_title= $scope.TYPE_MAP['history'];
        $scope.link_url="history";
    };

    $scope.setCart=function(){
        $scope.link_type= 'cart';
        $scope.link_title= $scope.TYPE_MAP['cart'];
        $scope.link_url="cart";
    }



}]);


angular.module('app')
    .directive('uiSetupLink', ['$timeout', '$document', function ($timeout, $document) {
        return {
            restrict: 'EA',
            replace: true,
            scope: {
                link_id:'=?linkId',
                link_url: '=linkUrl',
                link_title: '=linkTitle',
                link_type: '=linkType',
                show_delete: '@showDelete',
                show_types:'@?showTypes'
            },
            controller: 'UiSetupLinkController',
            templateUrl: 'tpl/setup_link/render_link.html',
            link: function (scope, element, attr) {
                console.log(scope);
            }
        };
    }]);


angular.module('app')
    .directive('uiSetupLinkDropdownMenu', ['$timeout', '$document', function ($timeout, $document) {
        return {
            restrict: 'EA',
            replace: true,
            templateUrl: 'tpl/setup_link/dropdown_menu.html',
            link: function (scope, element, attr) {

            }
        };
    }]);
