'use strict';

app.service('PageData', ['$http','$q', function ($http,$q) {
    var self = this; // Save reference
    this.data = {};
    this.items = [];
    this.curItem = {};
    this.models={};
    this.models.feature_config = {
        type: "config",
        title: "微页面标题",
        category: [],
        background: "",
        color: "#f9f9f9",
        width: "",
        height: "",
        description: ""
    };
    
    this.models.doc_config = {
            type: "config",
            title: "文档标题",
            category: [],
            background: "",
            color: "#f9f9f9",
            width: "",
            height: "",
            description: ""
        };
    
    this.models.category_config={
        type: "config",
        title: "",
        first_priority: "0",
        second_priority: "1",
        show_method: "0",
        content: "",
        is_default: "0",
        sub_entry: []
    };
    this.models.usercenter_config={
        type: "config",
        title: "会员主页",
        image: {
            id: "",
            url: "/assets/img/avatar/default.jpg"
        },
        show_level: "1",
        show_point: "1",
        is_default: !0,
        taobao_order_import:0
    };
    
    this.models.goodstag_config={
        type: "config",
        title: "",
        show_tag_title: "1",
        first_priority: "0",
        second_priority: "1",
        size: "2",
        size_type: "0",
        buy_btn: "1",
        buy_btn_type: "1",
        show_title: "0",
        price: "1",
        cart: "1",
        content: "",
        is_default: "0"
    };
    this.models.goodstemplate_config= {
        type: "config",
        title: "",
        template_style: 1
    };

    this.models.rich_text ={
        // 富文本类型
        type: 'rich_text',

        // 富文本内容区域
        content: '',
        color: '#ffffff',
        fullscreen: 0
    };
    this.models.goods={
        type: 'goods',
        // 商品来源
        goods: null,
        // 列表样式（0: 大图, 1: 小图, 2: 一大两小, 3: 详细列表)
        size: '2',
        // (0: 卡片式, 1: 瀑布流, 2: 极简样式, 3: 促销样式)
        size_type: '0',
        // 显示购买按钮（0: 不显示, 1: 显示）
        buy_btn: '1',
        // 购买按钮样式
        buy_btn_type: '1',
        // 显示商品名（0: 不显示, 1: 显示）
        title: '0',
        // 显示价格（0: 不显示, 1: 显示）
        price: '1',
        // 显示心愿单按钮 (0: 不显示, 1: 显示)
        show_wish_btn: '0',
        // 心愿单购买按钮样式
        wish_btn_type: '1',
        // 显示商品描述
        show_sub_title: '0'
    };
    this.models.goods_list={
        type: 'goods_list',
        // 商品来源
        goods: null,
        goods_number: 6,
        // 显示个数 (0: 6个, 1: 12个, 2: 18个)
        goods_number_type: 0,

        // 列表样式（0: 大图, 1: 小图, 2: 一大两小, 3: 详细列表)
        size: '2',

        // (0: 卡片式, 1: 瀑布流, 2: 极简样式, 3:促销样式)
        size_type: '0',

        // 显示购买按钮（0: 不显示, 1: 显示）
        buy_btn: '1',

        // 购买按钮样式
        buy_btn_type: '1',

        // 显示商品名（0: 不显示, 1: 显示）
        show_title: '0',

        title: '1',

        // 显示价格（0: 不显示, 1: 显示）
        price: '1',

        // 显示购物车图标（0: 不显示, 1: 显示）
        cart: '1',

        show_sub_title: '0'
    };
    this.models.image_ad={
        type: 'image_ad',
        size: '0',
        show_method: '0',
        height: 0,
        sub_entry: []
    };
    this.models.image_ad_item={
        type: 'image_ad_selection',
        title: '',
        image_id: '',
        image_url: '',
        image_thumb_url: '',
        image_width: 0,
        image_height: 0,
        link_id: '',
        link_type: '',
        link_title: '',
        link_url: ''
    };
    this.models.cube2 = {
        type: 'cube2',
        layout_width: 4,
        layout_height: 4,
        // 占位做校验用，不保存任何数据
        layout_map: '',
        tableContent: '',
        sub_entry: []
    };
    this.models.cube2_item = {
        type: 'cube_selection',
        // 起点x坐标
        x: 0,
        // 起点y坐标
        y: 0,
        // 所占的布局宽度
        width: 1,
        // 所占的布局高度
        height: 1,
        title: '',
        image_id: '',
        image_url: '',
        image_thumb_url: '',
        image_width: 0,
        image_height: 0,
        link_id: '',
        link_type: '',
        link_title: '',
        link_url: '',
        show_method: '1'
    };

    this.models.title={
        type: 'title',
        title: '',
        sub_title: '',
        show_method: '0',
        color: '#ffffff',
        sub_entry: [],
        title_template: '0',
        wx_title_date: '',
        wx_title_author: '',
        wx_title_link: '',
        wx_title_link_type: 0,
        wx_link: {},
        wx_link_url: ''
    };

    this.models.title_item = {
        type: 'title_nav_selection',
        title: '',
        link_id: '',
        link_type: '',
        link_title: '',
        link_url: ''
    };
    this.models.text_nav = {
        type: 'text_nav',
        show_method: '0',
        sub_entry: []
    };
    this.models.text_nav_item =  {
        type: 'text_nav_selection',
        title: '',
        link_id: '',
        link_type: '',
        link_title: '',
        link_url: ''
    };
    this.models.nav ={
        type: 'nav',
        sub_entry:[{
            type: 'nav_selection',
            title: '',
            image_id: '',
            image_url: '',
            image_thumb_url: '',
            image_width: 0,
            image_height: 0,
            link_id: '',
            link_type: '',
            link_title: '',
            link_url: ''
        },{type: 'nav_selection',
            title: '',
            image_id: '',
            image_url: '',
            image_thumb_url: '',
            image_width: 0,
            image_height: 0,
            link_id: '',
            link_type: '',
            link_title: '',
            link_url: ''},{type: 'nav_selection',
            title: '',
            image_id: '',
            image_url: '',
            image_thumb_url: '',
            image_width: 0,
            image_height: 0,
            link_id: '',
            link_type: '',
            link_title: '',
            link_url: ''},{type: 'nav_selection',
            title: '',
            image_id: '',
            image_url: '',
            image_thumb_url: '',
            image_width: 0,
            image_height: 0,
            link_id: '',
            link_type: '',
            link_title: '',
            link_url: ''}]
    };
    this.models.nav_item ={
        type: 'nav_selection',
        title: '',
        image_id: '',
        image_url: '',
        image_thumb_url: '',
        image_width: 0,
        image_height: 0,
        link_id: '',
        link_type: '',
        link_title: '',
        link_url: ''
    };
    this.models.link= {
        type: 'link',
        show_method: '0',
        sub_entry: []
    };
    this.models.link_item={
        type: 'link_selection',
        source_type: '',
        source_url: '',
        source_id: '',
        source_title: '',
        source_image: '',
        number: '3'
    };
    this.models.search={
        type: 'search'
    };
    this.models.showcase = {
        type: 'showcase',
        mode: '0',
        title: '',
        body_title: '',
        body_desc: '',
        sub_entry: [{
            type: 'showcase_selection',
            title: '',
            image_id: '',
            image_url: '',
            image_thumb_url: '',
            image_width: 0,
            image_height: 0,
            link_id: '',
            link_type: '',
            link_title: '',
            link_url: ''
        },{
            type: 'showcase_selection',
            title: '',
            image_id: '',
            image_url: '',
            image_thumb_url: '',
            image_width: 0,
            image_height: 0,
            link_id: '',
            link_type: '',
            link_title: '',
            link_url: ''
        },{
            type: 'showcase_selection',
            title: '',
            image_id: '',
            image_url: '',
            image_thumb_url: '',
            image_width: 0,
            image_height: 0,
            link_id: '',
            link_type: '',
            link_title: '',
            link_url: ''
        }]
    };
    this.models.showcase_item = {
        type: 'showcase_selection',
        title: '',
        image_id: '',
        image_url: '',
        image_thumb_url: '',
        image_width: 0,
        image_height: 0,
        link_id: '',
        link_type: '',
        link_title: '',
        link_url: ''
    };
    this.models.line={type: 'line'};
    this.models.white={
        type: 'white',
        height: '30'
    };
    this.models.component ={
        type: 'component',
        _id: '',
        title: '',
        link: ''
    };
    this.models.store = {type: 'store',name:(_global.shop?_global.shop.shop_name:"")};
    this.models.tag_list = {
        type: 'tag_list',
        timestamp: +new Date(),
        sub_entry: []
    };
    this.models.tag_list_item = {
        type: 'tag',
        id: '',
        title: '',
        url: '',
        goods_number: 10,
        timestamp: +new Date()
    };
    this.models.tags= {
        type: 'tags',

        // 是否显示联盟的商品
        show_union_goods: '0',

        // 列表样式（0: 大图, 1: 小图, 2: 一大两小, 3: 详细列表)
        size: '3',

        // (0: 卡片式, 1: 瀑布流, 2: 极简样式, 3:促销样式)
        size_type: '2',

        // 显示购买按钮（0: 不显示, 1: 显示）
        buy_btn: '1',

        // 购买按钮样式
        buy_btn_type: '1',

        // 显示商品名（0: 不显示, 1: 显示）
        title: '0',

        // 显示价格（0: 不显示, 1: 显示）
        price: '1',

        // 显示购物车图标（0: 不显示, 1: 显示）
        cart: '1',

        // 显示心愿单按钮 (0: 不显示, 1: 显示)
        show_wish_btn: '0',

        // 心愿单购买按钮样式
        wish_btn_type: '1',

        // 显示商品描述
        show_sub_title: '0',

        sub_entry: []
    };
    this.models.tags_item = {
        type: 'tag',
        id: '',
        alias: '',
        title: '',
        url: ''
    };
    this.models.audio ={
        // 富文本类型
        type: 'audio',

        // 播放；1 暂停后再恢复播放时，从头开始， 0 暂停后再恢复播放时，从暂停位置开始
        reload: '1',

        // 样式；0 模仿微信对话样式， 1 简易音乐播放器
        style: '0',

        // 音频
        audio: '',

        // 标题
        title: '',

        // 循环
        loop: '0',

        // 头像, 空表示使用店铺logo
        avatar: '',

        // 气泡
        bubble: 'left'
    };
    this.models.notice= {
        type: 'notice',
        content: ''
    };
    this.models.coupon = {
        type: 'coupon',
        coupon: [],
        validate_coupon_is_required: 1
    };


    this.getDefaultConfigModel = function(type){
        return $.extend({},self.models[type+'_config']);
    };

    this.getDefaultModel = function(type){
        return $.extend({},self.models[type]);
    };

    this.getConfigModel = function(arr){
        var d = {};
        $.each(arr,function(index,item){
            if(item.type =='config'){
                d = item;
                return false;
            }
        });
        return d;
    };

    this.load = function (id) {
        var deferred = $q.defer();
        $http({
            method: 'GET',
            url: 'api/feature_item.json?id=' + id
        }).success(function (response) {
            console.log(response);
            self.data = response.data;
            self.items = self.data.data;
            deferred.resolve(self.data);
        }).error(function () {
            deferred.reject("操作失败！");
        });
        return deferred.promise;
    };

}]);


angular.module('app')
    .directive('uiEditor', ['$timeout', '$document','PageData', function ($timeout, $document,pageData) {
        return {
            restrict: 'EA',
            scope:{
            	type:'@',
                items:'=data'
            },
            controller:'PageEditorController',
            templateUrl:'tpl/showcase/editor.html',
            link:function(scope, element, attr){
                scope.$watch('items', function() {
                    console.log("数据集更改事件。数据长度"+scope.items.length);
                    console.log(scope.items);
                    if(scope.items && scope.items.length==0){
                        //scope.items.push(pageData.getDefaultConfigModel($scope.type));
                    }else if(scope.items && scope.items.length>0){
                        //设置默认选择项
                        setTimeout(function () {
                            scope.selectItemByIndex(0);
                        },300);
                    }
                });

            }
        };
    }]);


app.controller('PageEditorController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    //$scope.items =[];
    $scope.appendIndex = -1;
    $scope.curIndex =0;

    $scope.goodsSampleList1 = [{
        image_url: 'http://imgqn.koudaitong.com/upload_files/2013/11/27/138554366971566702.jpg',
        price: '379.00',
        price_tao: '原价：380.00',
        title: '此处显示商品名称',
        sub_title: '此处显示商品描述'
    }, {
        image_url: 'http://imgqn.koudaitong.com/upload_files/2013/09/27/138029081159828528.jpg',
        price: '5.50',
        price_tao: '原价：8.00',
        title: '此处显示商品名称',
        sub_title: '此处显示商品描述'
    }, {
        image_url: 'http://imgqn.koudaitong.com/upload_files/2013/09/27/138029095601969662.jpg',
        price: '32.00',
        price_tao: '原价：60.00',
        title: '此处显示商品名称',
        sub_title: '此处显示商品描述'
    }, {
        image_url: 'http://imgqn.koudaitong.com/upload_files/2013/10/09/138130084954645499.jpg',
        price: '60.00',
        price_tao: '原价：80.00',
        title: '此处显示商品名称',
        sub_title: '此处显示商品描述'
    }];

    $scope.goodsSampleList2 = [{
        image_url: 'http://imgqn.koudaitong.com/upload_files/2013/11/27/138554366971566702.jpg',
        price: '379.00',
        title: '此处显示商品名称',
        sub_title: '此处显示商品描述'
    }, {
        image_url: 'http://imgqn.koudaitong.com/upload_files/2013/09/27/138029081159828528.jpg',
        price: '5.50',
        title: '此处显示商品名称',
        sub_title: '此处显示商品描述'
    }, {
        image_url: 'http://imgqn.koudaitong.com/upload_files/2013/10/09/138130084954645499.jpg',
        price: '60.00',
        title: '此处显示商品名称',
        sub_title: '此处显示商品描述'
    }];

    $scope.images_url = [
        'http://imgqn.koudaitong.com/upload_files/2013/11/27/138554366971566702.jpg!60x60+2x.jpg',
        'http://imgqn.koudaitong.com/upload_files/2013/09/27/138029081159828528.jpg!60x60+2x.jpg',
        'http://imgqn.koudaitong.com/upload_files/2013/09/27/138029095601969662.jpg!60x60+2x.jpg',
        'http://imgqn.koudaitong.com/upload_files/2013/10/09/138130084954645499.jpg!60x60+2x.jpg'
    ];

    $scope.append = function(index,$event){
    	$(".app-sidebar").show();
    	$event.stopPropagation();
        $scope.appendIndex = index;
       
        var t = angular.element($event.target).closest('.app-field')[0];
        console.log(t);
        var top = t.offsetTop;

        var tpl_id = "tpl/showcase/base/add_content.html";
        //直接读取，在页面已经缓存过了。
        var tpl = $templateCache.get(tpl_id);
        var ele = $compile(tpl[1])($scope);
        angular.element('#edit_body').empty();
        angular.element('#edit_body').append(ele);
        if(top>0)
            angular.element('.app-sidebar').css('margin-top',top);
    };

    
    $scope.add = function(type){
        var model = pageData.getDefaultModel(type);
        if(model){
        	if($scope.appendIndex!=-1){
        		$scope.items.splice($scope.appendIndex+1, 0, model);
                setTimeout(function () {
                    $scope.selectItemByIndex($scope.appendIndex+1);
                    $scope.appendIndex=-1;
                },300);
        	}else{
              $scope.items.push(model);
                setTimeout(function () {
                    $scope.selectItemByIndex($scope.items.length-1);
                },300);
        	}
        }
    };
    

    $scope.del = function(item,$event){
    	$(".app-sidebar").hide();
        $event.stopPropagation();
        angular.element('#edit_body').empty();
        var index=$scope.items.indexOf(item);
        if (index>=0){
            $scope.items.splice(index,1);
        }
    };

    $scope.selectItemByIndex=function(index){
        var item  = $scope.items[index];
        var top =0;
        if(item.type=="config"){
            var ele = $('#app-config').children().eq(index);
            top = ele[0].offsetTop;
        }else {
            var ele = $('#app-fields').children().eq(index);
            top = ele[0].offsetTop;
        }
        $scope.showEdit(item,top);
    };
    
    $scope.showEdit = function(item,top){
    	$(".app-sidebar").show();
    	$scope.$broadcast('onClose', "close");
        $scope.curIndex = $scope.items.indexOf(item);
        pageData.curItem = item;
        var tpl_id = "tpl/showcase/" + (item.type=='config'? 'tpl_'+$scope.type:item.type) +"/edit.html";
        var tpl = $templateCache.get(tpl_id);
        if (!tpl) {
            //加载模板
            $http.get(tpl_id)
                .then(function (response) {
                    console.log(response);
                    tpl = response.data;
                    $templateCache.put(tpl_id, response.data);
                    var ele = $compile(tpl)($scope);
                    angular.element('#edit_body').empty();
                    angular.element('#edit_body').append(ele);
                    if(top>0)
                    angular.element('.app-sidebar').css('margin-top',top);
                }, function (x) {
                    $scope.authError = 'Server Error';
                });
        }else{
	        var ele = $compile(tpl)($scope);
	        angular.element('#edit_body').empty();
	        angular.element('#edit_body').append(ele);
	        if(top>0)
	        angular.element('.app-sidebar').css('margin-top',top);
        }
    };

    $scope.onSelected = function (item,$event) {
    	var t = angular.element($event.target).closest('.app-field')[0];
        console.log(t);
        var top = t.offsetTop;
        $scope.showEdit(item,top);
    };
    


    /*if($scope.items.length>0) {
        $scope.showEdit($scope.items[0], 0);
    }*/
    

}]);

app.controller('UIRichTextEditorController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    $scope.data = pageData.curItem;
//    $scope.ue_config = {
//            toolbars: [['bold', 'italic', 'underline', 'strikethrough', 'forecolor', 'backcolor', 'justifyleft', 'justifycenter', 'justifyright', '|', 'insertunorderedlist', 'insertorderedlist', 'blockquote'], ['emotion', 'uploadimage', 'insertvideo', 'link', 'removeformat', '|', 'rowspacingtop', 'rowspacingbottom', 'lineheight', 'paragraph', 'fontsize'], ['inserttable', 'deletetable', 'insertparagraphbeforetable', 'insertrow', 'deleterow', 'insertcol', 'deletecol', 'mergecells', 'mergeright', 'mergedown', 'splittocells', 'splittorows', 'splittocols']],
//            autoClearinitialContent: false,
//            autoFloatEnabled: false,
//            wordCount: true,
//            elementPathEnabled: false,
//            maximumWords: 10000,
//            initialFrameWidth: 458,  //初始化编辑器宽度,默认1000,
//            initialFrameHeight: 600,
//            focus: false,
//            pasteplain: false//是否默认为纯文本粘贴。false为不使用纯文本粘贴，true为使用纯文本粘贴
//        };
    
    $scope._simpleConfig = {};
    
    $scope.saveToCache=function(){
		goodsService.goods = $scope.goods;
		goodsService.goodsDesc = $scope.goods_desc;
		goodsService.goodsCategorys=$scope.goodsCategorys;
		goodsService.goodsSpecs = $scope.stockBackup;
		goodsService.goodsPics = $scope.goodsPics;
		console.log("$scope.stockBackup" + angular.toJson($scope.stockBackup));

	};
	
	$scope.loadData = function(){
		$scope._simpleConfig = {
				//这里可以选择自己需要的工具按钮名称,此处仅选择如下五个
	    		toolbars: [['bold', 'italic', 'underline', 'strikethrough', 'forecolor', 'backcolor', 'justifyleft', 
	    		            'justifycenter', 'justifyright', '|', 'insertunorderedlist', 'insertorderedlist', 'blockquote'], 
	    		            ['emotion', 'uploadimage', 'insertimage', 'link', 'removeformat', '|', 'rowspacingtop', 'rowspacingbottom', 
	    		             'lineheight', 'paragraph', 'fontsize'], ['inserttable', 'deletetable', 'insertparagraphbeforetable', 
	    		             'insertrow', 'deleterow', 'insertcol', 'deletecol', 'mergecells', 'mergeright', 'mergedown', 'splittocells', 'splittorows', 'splittocols']],
				//focus时自动清空初始化时的内容
				autoClearinitialContent:true,
				//关闭字数统计
				wordCount:true,
				//关闭elementPath
				elementPathEnabled:false
			};
	}
	$scope.loadData();
    
}]);

app.controller('UIShopHeaderController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','dialogService', function ($scope, $http, $compile, $templateCache, pageData,dialogService) {
    $scope.data = pageData.curItem;

    $scope.setBackgroundImage = function(){
        dialogService.openPicUploadDialog(function (items) {
            $scope.data.backgroundImage = "res/file/"+items[0].id+"-640-200";
        });
    };

    $scope.setLogo = function(){
        dialogService.openPicUploadDialog(function (items) {
            $scope.data.logo = "res/file/"+items[0].id+"-80-80";
        });
    }
}]);



app.controller('UIGoodsEditorController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','dialogService', function ($scope, $http, $compile, $templateCache, pageData,dialogService) {
    $scope.data = pageData.curItem;
    $scope.setGoodsTag = function(){
    	dialogService.openGoodsTagChoser(function (items) {
            var item = items[0];
            console.log(item);
            $scope.data.goods={
                id: item.id,
                url: item.url,
                title: item.group_name,
                type: 'tag'
            };
        });
    };

    $scope.setGoodsNumber=function(){
        if($scope.goods_number_type=='0'){
            $scope.goods_number = 6;
        }else if($scope.goods_number_type=='1'){
            $scope.goods_number = 12;
        }else if($scope.goods_number_type=='2'){
            $scope.goods_number = 18;
        }
    }

    $scope.addGoods=function(){
        dialogService.openGoodsChoser(function (items) {
            if(!$scope.data.goods){
                $scope.data.goods =[];
            }
            $.each(items,function(index,item){
                $scope.data.goods.push(
                {
                    id: item.id,
                    url: item.url,
                    image_url: item.default_pic_url,
                    image_id: item.id,
                    price: item.discount_price != '0' ? item.discount_price : 0,
                    title: item.title
                }
                );
            })
        },0,$scope.data.goods);
    };

    $scope.delGoods=function(item){
        $scope.data.goods.splice($scope.data.goods.indexOf(item),1);
    }

}]);



app.controller('UIImageAdEditorController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','dialogService', function ($scope, $http, $compile, $templateCache, pageData,dialogService) {
    $scope.data = pageData.curItem;

    $scope.addPic=function(item){
        dialogService.openPicUploadDialog(function (items) {
            var img = items[0];
            item.image_id = img.id;
            item.image_url = "res/file/"+img.id;
            item.image_thumb_url="res/file/"+img.id;
        });
    };

    $scope.add = function(){
        if(!$scope.data.sub_entry){
            $scope.data.sub_entry = [];
        }
        $scope.data.sub_entry.push(
            {
                type: 'image_ad_selection',
                title: '',
                image_id: '',
                image_url: '',
                image_thumb_url: '',
                image_width: 0,
                image_height: 0,
                link_id: '',
                link_type: '',
                link_title: '',
                link_url: ''
            }
        );
    };

    $scope.del=function(item){
        $scope.data.sub_entry.splice($scope.data.sub_entry.indexOf(item),1);
    }




}]);

app.controller('UICubeEditorController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','$modal','dialogService', function ($scope, $http, $compile, $templateCache, pageData,$modal,dialogService) {

    $scope.data = pageData.curItem;
    $scope.layoutMap = [];
    $scope.curCell = null;



    $scope.denerateLayoutMap=function(){
        var defaults = $scope.data;
        var enties = $scope.data.sub_entry;
        var layoutWidth = new Array(defaults.layout_width);
        var layoutMap = [];
        for(var i=0;i<defaults.layout_height;i++){
            layoutMap.push(new Array(defaults.layout_width));
        }
        $.each(enties, function(index,entry){
            entry.index = index;
            for(var i = entry.y; i < entry.height + entry.y; i++){
                for(var j = entry.x; j < entry.width + entry.x; j++){
                    layoutMap[i][j] = entry;
                }
            }
        });
        return layoutMap;
    };

    $scope.setImage=function(item){
        dialogService.openPicUploadDialog(function (items) {
            var img = items[0];
            item.image_id = img.id;
            item.image_url = "res/file/"+img.id;
            item.image_thumb_url= "res/file/"+img.id;
        });
    };

    $scope.currentSelection = null;

    $scope.del=function(item){
        $scope.data.sub_entry.splice($scope.data.sub_entry.indexOf(item),1);
        $scope.currentSelection=-1;
        $scope.curCell = null;
        $scope.layoutMap = $scope.denerateLayoutMap();
    }


    $scope.add = function(x,y){
        var item = {
            type: 'cube_selection',
            // 起点x坐标
            x: x,
            // 起点y坐标
            y: y,
            // 所占的布局宽度
            width: 1,
            // 所占的布局高度
            height: 1,
            title: '',
            image_id: '',
            image_url: '',
            image_thumb_url: '',
            image_width: 0,
            image_height: 0,
            link_id: '',
            link_type: '',
            link_title: '',
            link_url: '',
            show_method: '1'
        };
        var layout =  $scope.layout($scope.layoutMap,x,y);

        var callback = function(data){
            item.width = data.width;
            item.height = data.height;
            $scope.data.sub_entry.push(item);
            $scope.layoutMap = $scope.denerateLayoutMap();
            $scope.editCell($scope.data.sub_entry.length - 1);
        };

        if(layout.length === 1){
            callback({width: 1, height: 1});
            return;
        }

        var modalInstance = $modal.open({
            templateUrl : 'tpl/showcase/cube2/layout_modal.html',
            controller : 'UICubeLayoutChoserCtrl',
            backdrop : false,
            size : 'lg',
            resolve : {
                layout:function(){
                  return layout;
                },
                x : function() {
                    return x;
                },
                y : function() {
                    return y;
                }
            }
        });
        modalInstance.result.then(function(data) {
            callback(data);
        }, function() {
        });

    };

    $scope.editCell=function(i){
        $scope.currentSelection=i;
        $scope.curCell = $scope.data.sub_entry[i];
        $scope.curCell.layout = $scope.layout($scope.layoutMap,$scope.curCell.x,$scope.curCell.y);
    }

    $scope.changeCellLayout = function(rows,cols){
        $scope.curCell.height = rows;
        $scope.curCell.width = cols;
        $scope.layoutMap = $scope.denerateLayoutMap();
    }


    $scope.edit = function(x,y,e){
       /*var $target = $(e.target),
            x = +$target.data('x'),
            y = +$target.data('y');*/



        if($scope.layoutMap[y][x]){
            //$scope.currentSelection=$scope.layoutMap[y][x].index;
            console.log('edit:'+x+","+y);
            $scope.editCell($scope.layoutMap[y][x].index);
        }else{
            console.log('add:'+x+","+y);
            $scope.add(x,y);
        }
    };

    $scope.layout= function(layoutMap,x,y){
        var
            data = {x:x,y:y},
            layout = [],
            temp = [];

        for(var i = data.y; i < layoutMap.length; i++){
            for(var j = data.x; j < layoutMap[i].length; j++){
                var _data = layoutMap[i][j];
                if(!_data || (data.x === _data.x && data.y === _data.y)){
                    if(i - data.y > 0){
                        // 搜索上一行，看是否能找到对应的列数
                        var found = $.grep(layout, function(obj){
                            return obj.rows === i - data.y && obj.cols === j - data.x + 1;
                        });
                        if(!found ||found.length==0){
                            // 如果没有找到，则表明上行或更上行已有障碍物
                            break;
                        }
                    }
                    temp.push({
                        cols: j - data.x + 1,
                        rows: i - data.y + 1
                    });
                } else {
                    break;
                }
            }
            if(temp.length){
                layout = layout.concat(temp);
                temp = [];
            } else {
                break;
            }
        }
        return layout;
    };



    //$scope.denerateTableContent();
    $scope.rows =[0,1,2,3];
    $scope.cols =[0,1,2,3];
    $scope.initlayoutMap=function(){
        $scope.rows = [];
        for(var i=0;i<$scope.data.layout_height;i++) {
            $scope.rows.push(i);
        }
        $scope.cols = [];
        for(var i=0;i<$scope.data.layout_width;i++) {
            $scope.cols.push(i);
        }
        $scope.layoutMap = $scope.denerateLayoutMap();
        console.log($scope.layoutMap);
    }

    $scope.initlayoutMap();
}]);

app.filter('range', function() {
    return function(input, total) {
        total = parseInt(total);

        for (var i=0; i<total; i++) {
            input.push(i);
        }

        return input;
    };
});


app.controller('UICubeLayoutChoserCtrl', ['$scope', '$http','$modalInstance','layout','x','y',
    function($scope, $http,$modalInstance,layout,x,y) {

        $scope.result = [];
        for(var i = 0; i < layout.length; i++){
            $scope.result[layout[i].cols] = layout[i].rows;
        }


        $scope.chooseLayout = function(cols,rows){
            $modalInstance.close({
                width: cols,
                height: rows
            });
        }


        $scope.cancel = function () {
            $modalInstance.dismiss('cancel');
        };

        $scope.mouseenter=function(e){
            var $target = $(e.target),
                cols = +$target.data('cols'),
                rows = +$target.data('rows');
            var listItems = $('.layout-table li').removeClass('selected');

            listItems.filter(function(index, item){
                item = $(item);
                return +item.data('cols') <= cols && +item.data('rows') <= rows;
            }).addClass('selected');
        }

    }
]);

app.controller('UICubeController', ['$scope', function ($scope) {
    $scope.layoutMap = [];
    $scope.denerateTableContent= function(){
        var defaults = $scope.data;
        var layoutMap = $scope.layoutMap;
        var result = [];
        for(var i = 0; i < defaults.layout_height; i++){
            result.push('<tr>');
            for(var j = 0; j < defaults.layout_width; j++){
                var entry = layoutMap[i][j];
                if(!entry){
                    result.push('<td class="empty" data-x="' + j + '" data-y="' + i + '"></td>');
                } else if(i === entry.y && j === entry.x){
                    var url = entry.image_url;
                    if(url){
                        //url = Utils.fullfillImage(url, '!730x0.jpg', {toWebp: false});
                    }
                    entry.image_url = url;
                    entry.image_thumb_url = url;
                    var td = '<td class="not-empty cols-'+entry.width
                        +' rows-'+entry.height;
                    td += entry.image_url?'':'index-'+entry.index;
                    td += '"';
                    td += ' colspan="'+entry.width+'"';
                    td += ' rowspan="'+entry.height+'"';
                    td += ' data-index="'+entry.index+'"';
                    td += '>';
                    if(entry.link_url){
                        td += '<a><img src="'+ entry.image_url+'"></a>';
                    }else{
                        td += '<img src="'+entry.image_url +'">';
                    }
                    td += '</td>';
                    result.push(td);
                }
            }
            result.push('</tr>');
        }
        $scope.cubeContent=result.join('');
    };

    $scope.denerateLayoutMap=function(){
        var defaults = $scope.data;
        var enties = $scope.data.sub_entry;
        var layoutWidth = new Array(defaults.layout_width);
        var layoutMap = [];
        for(var i=0;i<defaults.layout_height;i++){
            layoutMap.push(new Array(defaults.layout_width));
        }
        $.each(enties, function(index,entry){
            entry.index = index;
            for(var i = entry.y; i < entry.height + entry.y; i++){
                for(var j = entry.x; j < entry.width + entry.x; j++){
                    layoutMap[i][j] = entry;
                }
            }
        });
        return layoutMap;
    };



}]);


angular.module('app')
    .directive('uiCube', ['$timeout', '$document', function ($timeout, $document) {
        return {
            restrict: 'EA',
            scope: {
                data: '=data'
            },
            controller: 'UICubeController',
            templateUrl:'tpl/showcase/cube2/table.html',
            link:function(scope, element, attr){
                var update = function(){
                    scope.layoutMap = scope.denerateLayoutMap();
                    scope.denerateTableContent();
                }
                scope.$watch('data', function() {
                    update();
                },true);
            }
        };
    }]);



app.controller('UITitleController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    $scope.data = pageData.curItem;

    $scope.add = function(){
        if(!$scope.data.sub_entry){
            $scope.data.sub_entry = [];
        }
        $scope.data.sub_entry.push(
            {
                type: 'title_nav_selection',
                title: '',
                link_id: '',
                link_type: '',
                link_title: '',
                link_url: ''
            }
        );
    };

    $scope.del=function(item){
        $scope.data.sub_entry.splice($scope.data.sub_entry.indexOf(item),1);
    }


}]);

app.controller('UITextNavController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    $scope.data = pageData.curItem;

    $scope.addItem=function(){
        if(!$scope.data.sub_entry){
            $scope.data.sub_entry =[];
        }
        $scope.data.sub_entry.push({
            type: 'text_nav_selection',
            title: '',
            link_id: '',
            link_type: '',
            link_title: '',
            link_url: ''
        });
    };

    $scope.delItem=function(item){
        $scope.data.sub_entry.splice($scope.data.sub_entry.indexOf(item),1);
    }

}]);

app.controller('UINavController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','dialogService', function ($scope, $http, $compile, $templateCache, pageData,dialogService) {
    $scope.data = pageData.curItem;

    $scope.setPic=function(item){
        dialogService.openPicUploadDialog(function (items) {
            var img = items[0];
            item.image_id = img.id;
            item.image_url = "res/file/"+img.id;
            item.image_thumb_url="res/file/"+img.id;
        });
    }

}]);

app.controller('UILinkController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','dialogService', function ($scope, $http, $compile, $templateCache, pageData,dialogService) {
    $scope.data = pageData.curItem;

    $scope.addItem=function(){
        if(!$scope.data.sub_entry){
            $scope.data.sub_entry =[];
        }
        $scope.data.sub_entry.push({
            type: 'link_selection',
            source_type: '',
            source_url: '',
            source_id: '',
            source_title: '',
            source_image: '',
            number: '3'
        });
    };

    $scope.delItem=function(item){
        $scope.data.sub_entry.splice($scope.data.sub_entry.indexOf(item),1);
    }

}]);


app.controller('UIShowcaseController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','dialogService', function ($scope, $http, $compile, $templateCache, pageData,dialogService) {
    $scope.data = pageData.curItem;

    $scope.setPic=function(item){
        dialogService.openPicUploadDialog(function (items) {
            var img = items[0];
            item.image_id = img.id;
            item.image_url = "res/"+img.id;
            item.image_thumb_url="res/"+img.id+"-80-80";
        });
    }

}]);

app.controller('UIComponentController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','dialogService', function ($scope, $http, $compile, $templateCache, pageData,dialogService) {
    $scope.data = pageData.curItem;

    $scope.setComponent = function(){
        dialogService.openComponentChoser(function (items) {
            var c = items[0];
            $scope.data._id = c.id;
            $scope.data.title= c.temp_name
        });
    };

}]);

app.controller('UITagListController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','dialogService', function ($scope, $http, $compile, $templateCache, pageData,dialogService) {
    $scope.data = pageData.curItem;

    $scope.setGoodsNumber=function(item,num){
        item.goods_number=num;
    };

    $scope.editGoodsTag = function(item){
        dialogService.openGoodsTagChoser(function (items) {
            var goods = items[0];
            item.type= 'tag';
            item.id= goods.id;
            item.title= goods.group_name;
            item.url=goods.url;
            item.goods_number= 10;
            item.timestamp=+new Date() +$scope.data.sub_entry.length;
        });
    };

    $scope.addGoodsTag = function(){
        dialogService.openGoodsTagChoser(function (items) {
            var item = items[0];
            console.log(item);
            if(!$scope.data.sub_entry){
                $scope.data.sub_entry =[];
            }
            $.each(items,function(index,item){
                $scope.data.sub_entry.push({
                    type: 'tag',
                    id: item.id,
                    title: item.group_name,
                    url: item.url,
                    goods_number: 10,
                    timestamp: +new Date() +$scope.data.sub_entry.length
                });
            })
        },0);
    };

    $scope.delGoodsTag=function(item){
        $scope.data.sub_entry.splice($scope.data.sub_entry.indexOf(item),1);
    }

}]);


app.controller('UIAudioController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','dialogService', function ($scope, $http, $compile, $templateCache, pageData,dialogService) {
    $scope.data = pageData.curItem;

    $scope.setAvatarLogo = function(){
        dialogService.openPicUploadDialog(function (items) {
            $scope.data.avatar = "res/file/"+items[0].id+"-80-80";
        });
    };

    $scope.setAvatar=function(){
        dialogService.openPicUploadDialog(function (items) {
            $scope.data.avatar = "res/file/"+items[0].id+"-80-80";
        });
    };

    $scope.setAudio=function(){
        dialogService.openVoiceUploadDialog(function (items) {
            $scope.data.audio = "res/file/"+items[0].id;
        });
    };

}]);

app.controller('UINoticeController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    $scope.data = pageData.curItem;

}]);

app.controller('UICouponController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','dialogService', function ($scope, $http, $compile, $templateCache, pageData,dialogService) {
    $scope.data = pageData.curItem;

    $scope.addItem=function(){
        dialogService.openCouponChoser(function (items) {
            if(!$scope.data.coupon){
                $scope.data.coupon =[];
            }
            $.each(items,function(index,data){
                $scope.data.coupon.push({
                    id: data.id,
                    alias: data.id,
                    name: data.name,
                    value: data.amount,
                    is_at_least: data.order_limit_flag,
                    at_least: data.order_money_limit
                });
            })
        },0);
    };

    $scope.delItem=function(item){
        $scope.data.coupon.splice($scope.data.coupon.indexOf(item),1);
    }

}]);

app.controller('UIWhiteController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    $scope.data = pageData.curItem;

}]);

app.controller('UIFeatureConfigController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    $scope.data = pageData.curItem;
    $scope.categoryList =[];
    $scope.choices ={};
    $scope.choices.categorys=[];

    $scope.getShopPageCategory = function() {
        $http.post('shopPageCategory/getAllShopPageCategory').success(
            function(shopPageCategories) {
                $scope.categoryList = shopPageCategories;
                $scope.initCategorys();
                $scope.$watch('choices.categorys', function() {
                    $scope.syncCategorys();
                });
            }).error(function(e) {
                console.error(e);
            })
    };

    $scope.syncCategorys=function(){
            var p = [];
            $.each($scope.choices.categorys,function(index,t){
                p.push(t.id);
            });
            $scope.data.category = p.join(',');
    }


    $scope.getCategoryById = function(id)//noinspection UnterminatedStatementJS
    {
        var d=null;
        $.each($scope.categoryList,function(index,t){
            if(t.id == id){
                d = t;
                return false;
            }
        });
        return d;
    };

    $scope.initCategorys=function()//noinspection UnterminatedStatementJS
    {
        if(!$scope.data.category || $scope.data.category==''){
            return;
        }
        var arr = $scope.data.category;
        if(!angular.isArray(arr)){
            arr = arr.split(",");
        }
        $.each(arr,function(index,id){
            var t = $scope.getCategoryById(id);
            if(t){
                $scope.choices.categorys.push(t);
            }
        });

    };

    $scope.getShopPageCategory();
}]);

app.controller('UICategoryConfigController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    $scope.data = pageData.curItem;

}]);

app.controller('UIUserCenterConfigController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','dialogService', function ($scope, $http, $compile, $templateCache, pageData,dialogService) {
    $scope.data = pageData.curItem;

    $scope.setImage=function(){
        dialogService.openPicUploadDialog(function(images){
            console.log(images);
            var img = images[0];
            if(!$scope.data.image){
                $scope.data.image = {};
            }
            $scope.data.image.id = img.id;
            $scope.data.image.url="res/file/"+img.id;
        });
    }

}]);

app.controller('UIGoodsTagConfigController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    $scope.data = pageData.curItem;

}]);

app.controller('UIGoodsTemplateConfigController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    $scope.data = pageData.curItem;

}]);

app.controller('UIShopAdvConfigController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    $scope.data = pageData.curItem;
    $scope.page =$scope.data.page;
    $scope.weiPage = false;
    $scope.weiPageCategory = false;
    $scope.goods = false;
    $scope.goodsTag = false;
    $scope.shopHome = false;
    $scope.memberHome = false;
    
    $scope.setOnPages = function(onpage,onpageValue){
			if(onpage){
				if($scope.page.indexOf(onpageValue+",")==-1){
					$scope.page = $scope.page.concat(onpageValue).concat(",");
				}
			}else{
				if($scope.page.indexOf(onpageValue+",")>-1){
					$scope.page = $scope.page.replace((onpageValue+","),"");
				}
			}
			console.log( $scope.page );
			$scope.data.page = $scope.page;
		}
}]);

app.controller('UIShopNavConfigController', ['$scope', '$http', '$compile', '$templateCache', 'PageData','$modal','dialogService', function ($scope, $http, $compile, $templateCache, pageData,$modal,dialogService) {
    $scope.data = pageData.curItem;

    $scope.chooseStyle=function(){
        var modalInstance = $modal.open({
            templateUrl: 'tpl/showcase/tpl_shopnav/nav_style_select_modal.html',
            controller: 'UIShopNavStyleChoserCtrl',
            backdrop: false,
            size:'lg',
            resolve: {
                defaultStyle: function () {
                    return $scope.data.nav_style;
                }
            }
        });
        modalInstance.result.then(function (styleValue) {
            $scope.data.nav_style=styleValue;
        }, function () {
        });
    };

    $scope.setOnPages=function($event){
        var t = angular.element($event.target);
        console.log(t);
        console.log("checked:"+t.is(':checked')+" value:"+ t.val());
        var value = parseInt(t.val());
        if(t.is(':checked')){
            //添加
            if($scope.data.on_page.indexOf(value) ==-1){
                $scope.data.on_page.push(value);
            }
        }else{
            //移除
            if($scope.data.on_page.indexOf(value) !=-1){
                $scope.data.on_page.splice($scope.data.on_page.indexOf(value),1);
            }
        }
        console.log($scope.data.on_page);
    };

    $scope.resetBackgroundColor= function() {
        $scope.data.background_color='#18171D';
    };

    $scope.addAppNav=function(){
        var d = {
            image_url: "https://dn-kdt-img.qbox.me/public_files/image/shopnav/01.png",
            image_width: 128,
            image_height: 100,
            actived_image_url: "https://dn-kdt-img.qbox.me/public_files/image/shopnav/01_on.png",
            actived_image_width: 128,
            actived_image_height: 100,
            link_title: "",
            link_type: "homepage",
            link_url: "http://www.yunzhongbang.com/v2/showcase/homepage?alias=193fgwej1",
            image_id: "",
            image_thumb_url: "",
            actived_image_id: "",
            actived_image_thumb_url: ""
        };
        $scope.data.app_nav.push(d);
    };

    $scope.addFirstNav=function() {
        if($scope.data.nav_style == 1) {
            $scope.data.nav.push({
                title: "标题",
                link_title: "",
                link_type: "",
                link_url: "javascript:;",
                second: []
            });
        }else{
            $scope.addAppNav();
        }
    };

    $scope.addSecondNav=function(item) {
        item.second.push({title: "标题",
            link_title: "",
            link_type: "",
            link_url: "javascript:;"
        });
    };


    $scope.setImage=function(item){
        dialogService.openPicUploadDialog(function(images){
            console.log(images);
            var img = images[0];
            item.image_id = img.id;
            item.image_width = 128;
            item.image_height=100;
            item.image_url="res/file/"+img.id;
        });
    };

    $scope.delActiviedImage=function(item){
        item.actived_image_url="";
    };

    $scope.setActivedImage=function(item){
        dialogService.openPicUploadDialog(function(images){
            console.log(images);
            var img = images[0];
            item.image_id = img.id;
            item.actived_image_width = 128;
            item.actived_image_height=100;
            item.actived_image_url="res/file/"+img.id;
        });
    };

    $scope.delFirstNav = function(item){
        $scope.data.nav.splice($scope.data.nav.indexOf(item),1);
    };

    $scope.delSecondNav = function(p,item){
        console.log(p);
        var i = p.$parent.$parent.$index;
        console.log(i);
        var f = $scope.data.nav[i];
        f.second.splice(f.second.indexOf(item),1);
    };

    $scope.delAppNav=function(item){
        $scope.data.app_nav.splice($scope.data.app_nav.indexOf(item),1);
    };

    $scope.editTitle = function(item,pop){
    	pop.del_show=false;
        
    }

}]);

app.controller('UIShopNavStyleChoserCtrl', ['$scope', '$http','$modalInstance','defaultStyle',
    function($scope, $http,$modalInstance,defaultStyle) {
        $scope.nav_style = defaultStyle;

        $scope.ok = function () {
            $modalInstance.close($scope.nav_style);
        };

        $scope.cancel = function () {
            $modalInstance.dismiss('cancel');
        };
    }
]);

app.controller('UIGoodsConfigController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    $scope.data = pageData.curItem;

    $scope.goods_template=[{id:-1,name:'普通版'},{id:-2,name:'简洁流畅版'}];

    $scope.loadGoodsTemplate= function () {
        $http.post('goodsTemplate', {
            pageNumber: 1,
            pageSize: 50
        }).success(function (page) {
            var l = page.list;
            $.each(l,function(index,d){
                var item = {id: d.id,name: d.name};
                $scope.goods_template.push(item);
            });
        }).error(function (e) {
            console.error(e);
        })
    };

    $scope.loadGoodsTemplate();

}]);

app.controller('UIDocConfigController', ['$scope', '$http', '$compile', '$templateCache', 'PageData', function ($scope, $http, $compile, $templateCache, pageData) {
    $scope.data = pageData.curItem;
    $scope.categoryList =[];
    $scope.choices ={};
    $scope.choices.categorys=[];
    
    $scope.keywordses=[];
    $scope.choices.keywords=[];
    
    $scope.questions=[];
    $scope.choices.questions=[];

    $scope.getDocCategory = function() {
        $http.post('doc/getDocCategorys').success(
            function(docCategories) {
            	console.log(docCategories);
                $scope.categoryList = docCategories;
                $scope.initCategorys();
                $scope.$watch('choices.categorys', function() {
                    $scope.syncCategorys();
                });
            }).error(function(e) {
                console.error(e);
            })
    };

    $scope.syncCategorys=function(){
            var p = [];
            $.each($scope.choices.categorys,function(index,t){
                p.push(t.id);
            });
            $scope.data.category = p.join(',');
    }

    $scope.getCategoryById = function(id){
        var d=null;
        $.each($scope.categoryList,function(index,t){
            if(t.id == id){
                d = t;
                return false;
            }
        });
        return d;
    };

    $scope.initCategorys=function(){
        if(!$scope.data.category || $scope.data.category==''){
            return;
        }
        var arr = $scope.data.category;
        if(!angular.isArray(arr)){
            arr = arr.split(",");
        }
        $.each(arr,function(index,id){
            var t = $scope.getCategoryById(id);
            if(t){
                $scope.choices.categorys.push(t);
            }
        });
    };

    $scope.getDocCategory();
    
    $scope.getKeywords = function() {
        $http.post('keywords/getAllKeywords').success(
            function(data) {
                $scope.keywordses = data;
                $scope.initKeywords();
                $scope.$watch('choices.keywords', function() {
                    $scope.syncKeywords();
                });
            }).error(function(e) {
                console.error(e);
            })
    };
    
    $scope.syncKeywords=function(){
        var p = [];
        $.each($scope.choices.keywords,function(index,t){
            p.push(t.id);
        });
        $scope.data.keywords = p.join(',');
    }
    
    $scope.initKeywords=function(){
        if(!$scope.data.keywords || $scope.data.keywords==''){
            return;
        }
        var arr = $scope.data.keywords;
        if(!angular.isArray(arr)){
            arr = arr.split(",");
        }
        $.each(arr,function(index,id){
            var t = $scope.getKeywordsById(id);
            if(t){
                $scope.choices.keywords.push(t);
            }
        });
    };
    
    $scope.getKeywordsById = function(id){
        var d=null;
        $.each($scope.keywordses,function(index,t){
            if(t.id == id){
                d = t;
                return false;
            }
        });
        return d;
    };
    $scope.getKeywords();
    
    $scope.getQuestions = function() {
        $http.post('question/getAllSysQuestion').success(
            function(data) {
                $scope.questions = data;
                $scope.initQuestions();
                $scope.$watch('choices.questions', function() {
                    $scope.syncQuestions();
                });
            }).error(function(e) {
                console.error(e);
            })
    };
    
    $scope.syncQuestions=function(){
        var p = [];
        $.each($scope.choices.questions,function(index,t){
            p.push(t.id);
        });
        $scope.data.questions = p.join(',');
    }
    
    $scope.initQuestions=function(){
        if(!$scope.data.questions || $scope.data.questions==''){
            return;
        }
        var arr = $scope.data.questions;
        if(!angular.isArray(arr)){
            arr = arr.split(",");
        }
        $.each(arr,function(index,id){
            var t = $scope.getQuestionById(id);
            if(t){
                $scope.choices.questions.push(t);
            }
        });
    };
    
    $scope.getQuestionById = function(id){
        var d=null;
        $.each($scope.questions,function(index,t){
            if(t.id == id){
                d = t;
                return false;
            }
        });
        return d;
    };
    $scope.getQuestions();
    
}]);
