'use strict';

/**
 * 分销商礼品列表控制器
 */
app.controller('ProxyGoodsListController',['$scope','$http','$state','$stateParams','$compile','notifyService','pageService',
  function($scope,$http,$state,$stateParams,$compile,notifyService,pageService){
    $scope.pageData = {};
    $scope.title = "";
    $scope.auth_status = "";

    $scope.setQueryParam = function(){
      if(pageService.type == "ProxyGoodsListController"){
        if(pageService.open == true){
          $scope.pageData.pageNumber = pageService.queryParam.get("pageNumber");
          $scope.pageData.pageSize = pageService.queryParam.get("pageSize");
          $scope.title = pageService.queryParam.get("title");
          $scope.auth_status = pageService.queryParam.get("auth_status");
        }else{
          if($scope.pageData.pageNumber){
            pageService.queryParam.put("pageNumber",$scope.pageData.pageNumber);
          }
          if($scope.pageData.pageSize){
            pageService.queryParam.put("pageSize",$scope.pageData.pageSize);
          }
          pageService.queryParam.put("title",$scope.title);
          pageService.queryParam.put("auth_status",$scope.auth_status);
        }
      }else{
        pageService.resetParam();
      }
    };

    $scope.pageChanged = function(){
      $scope.setQueryParam();
      pageService.type = "ProxyGoodsListController";

      var loading = layer.load(1,{shade:[0.1,'#393D49']});
      $http.post('goods/listGoods',{
        pageNumber:pageService.queryParam.get("pageNumber"),
        pageSize:pageService.queryParam.get("pageSize"),
        title:pageService.queryParam.get("title"),
        auth_status:pageService.queryParam.get("auth_status"),
        product_type:0
      }).success(function(page){
        $scope.pageData = page;
        pageService.open = false;
        layer.close(loading);
      }).error(function(e){
        console.error(e);
        layer.close(loading);
      });
    };

    $scope.pageChanged();

    $scope.toAuthGoods = function(id){
      pageService.open = true;
      $state.go("console.proxy_goods_auth",{id:id});
    };

  }]);

/**
 * 分销商商品审核认证控制器
 */
app.controller('GoodsAuthController',['$scope','$http','$state','$stateParams','$compile','notifyService',
  function($scope,$http,$state,$stateParams,$compile,notifyService){
    $scope.goods = {
      stock:0,
      sale_price:0.00,
      have_invoice:1,
      can_repair:1,
      product_type:1,
      quota:0,
      sale_model:1,
      show_stock_flag:0,
      sale_time_model:0,
      delivery_model:0,
      proxy_flag:0,
      discount_flag:0,
      postage:0,
      on_shelf_status:0,
      extra_content:''
    };
    $scope.goods_content = [];
    $scope.goodsCategorys = [];
    $scope.specs = {};
    $scope.goodsSpecs = [];
    $scope.goodsPics = [];
    $scope.status = 0;
    $scope.brandName = "";
    $scope.deliveryTpl = [];
    $scope.memberGrades = [];
    $scope.references={};
    $scope.loadGoods = function(){
      $http.post("goods/getGoods",{id:$stateParams.id})
      .success(function(data){
        if(data){
          $scope.goods = data.goods;
          $scope.goodsCategorys = data.goodsCategorys;
          $scope.goodsTags = data.goodsTags;
          $scope.goodsPics = data.goodsPics;
          $scope.status = data.goods.auditing_status;
          $scope.specs = data.specs;
          $scope.references=JSON.parse(data.goods.references);
          $scope.goods_content = JSON.parse($scope.goods.extra_content);
          if($scope.goods.extra_content.indexOf("组图")<0){
        	  $("#goods_detail").html($scope.goods_content[0].content);
          }else{
        	  var img_sub_entry=angular.fromJson($scope.goods_content[0].sub_entry);
        	  var html="";
    		  for(var i=0;i<img_sub_entry.length;i++){
    			  if($scope.goods_content[0].mode=="0"){
    				  html+='<div><img  onerror="this.src=\'./img/404.jpg\'" src="'+img_sub_entry[i].url+'"  width="100%"></div>';
            	  }else if($scope.goods_content[0].mode=="1"){
            		  if((i+3)%3==0){
            			  html+='<div style="min-height:216px;">';
            			  if(img_sub_entry[i+1]){
            				 html+='<img  src="'+img_sub_entry[i+1].url+'" onerror="this.src=\'./img/404.jpg\'" style="width:110px;height:105px;float: right;" >';
           			      }   	 	
						  html+='<img  src="'+img_sub_entry[i].url+'" style="width:210px;height:210px;float:left;" onerror="this.src=\'./img/404.jpg\'">';
            			  if(img_sub_entry[i+2]){
            				  html+='<img  src="'+img_sub_entry[i+2].url+'" style="width:110px;height:105px;float: right;padding-top:5px;" onerror="this.src=\'./img/404.jpg\'">';
            			  }
            			  html+='</div>';
            		  }
            	  }else if($scope.goods_content[0].mode=="2"){
            		  if((i+3)%3==0){
            			  html+='<div style="min-height:216px;"><img  src="'+img_sub_entry[i].url+'" onerror="this.src=\'./img/404.jpg\'" style="width:110px;height:105px;float: left;" >';
            			  if(img_sub_entry[i+2]){
            				  html+='<img  src="'+img_sub_entry[i+2].url+'" style="width:210px;height:210px;float:right;" onerror="this.src=\'./img/404.jpg\'">';
            			  }else{
            				  html+='<img   style="width:210px;height:210px;float:right;" onerror="this.src=\'./img/404.jpg\'">';
            			  }
            			  if(img_sub_entry[i+1]){
            				  html+='<img  src="'+img_sub_entry[i+1].url+'}" style="width:110px;height:105px;float: left;padding-top:5px;" onerror="this.src=\'./img/404.jpg\'">';
            			  }
            			  html+='</div>';
            		  }
            	  }else{
            		  html+='<img  onerror="this.src=\'./img/404.jpg\'" src="'+img_sub_entry[i].url+'"  width="33%">';
            	  } 
    		  }
        	  $("#goods_detail").html(html);
          }

          if(data.goodsSpecs.length > 0){
            $scope.loadGoodsSpecs(data.goodsSpecs);
            $scope.stockBackup = $scope.generateStockData($scope.goodsSpecs);
            $.each($scope.stockBackup,function(i,stock){
              var stockID = $scope.getSpecsFilterKeys("v",stock);
              $.each(data.goodsSpecs,function(k,specs){
                var specsID = $scope.getSpecsFilterKeys("sku_value",specs);
                if(specsID == stockID){
                  $.extend(stock,specs);
                  stock.stock_num = specs.stock;
                  return false;
                }
              })
            })
            $scope.updataStockData();
          }

          $scope.loadDt();
          $scope.loadProxyGrade();
        }
      })
      .error(function(e){
        console.error(e);
      });
    };

    $scope.loadAllSpec = function(){
      $http.get("goods/getAllSpec")
      .success(function(data){
        if(data){
          $scope.specs = data;
        }
      })
      .error(function(e){
        console.error(e);
      });
    };

    $scope.loadGoodsBrandName = function(){
      $http.post("goods/getGoodsBrandsName",{id:$scope.goods.brand_id})
      .success(function(data){
        if(data){
          $scope.brandName = data;
        }
      })
      .error(function(e){
        console.error(e);
      });
    };

    $scope.updataStockData = function(){
      $scope.combine = $scope.calcCombine($scope.goodsSpecs);
      $scope.stocks = $scope.generateStockData($scope.goodsSpecs);
      $scope.recoverBackup($scope.stocks);
      $scope.updateStockBackup($scope.stocks);
    };

    $scope.generateStockData = function(specs){
      var stocks = [];
      $.each(specs,function(index,item){
        if(stocks.length == 0){
          stocks = $scope.initSkuData(item,index);
        }else{
          stocks = $scope.appendSkuInfo(stocks,item,index);
        }
      });
      return stocks;
    };

    $scope.initSkuData = function(sku,index){
      var stocks = [],s = {};
      $.each(sku.list,function(i,t){
          var o = {
            id:0,
            fx_price:"0",
            max_retail_price:"0",
            min_retail_price:"0",
            price:"0",
            stock_num:"0",
            sold_num:"0",
            product_code:"",
            is_sell:0,
            supply_price:0,
            product_price:0
          }
            ,num = index + 1;
          o["k" + num + "_id"] = sku.id;
          o["k" + num] = sku.text;
          o["v" + num + "_id"] = t.id;
          o["v" + num] = t.text;
          var l = "v" + num + "_id";
          s[l] = t.id;
          stocks.push(o);
        }
      );
      return stocks;
    };

    $scope.appendSkuInfo = function(oldStocks,sku,index){
      if(! sku.list || sku.list.length == 0)
        return oldStocks;
      var newStocks = [],o = {};
      $.each(oldStocks,function(i,e){
          $.each(sku.list,function(i2,a){
              var l = $.extend({},e);
              var c = index + 1;
              l["k" + c + "_id"] = sku.id;
              l["k" + c] = sku.text;
              l["v" + c + "_id"] = a.id;
              l["v" + c] = a.text;
              newStocks.push(l);
            }
          )
        }
      );
      return newStocks;
    };

    $scope.calcCombine = function(specs){
      for(var t = [],n = specs.length,i = 0; n > i; i ++){
        t[i] = 1;
        for(var s = i + 1; n > s; s ++)
          t[i] = t[i] * specs[s].list.length;
      }
      return t;
    };

    $scope.recoverBackup = function(stocks){
      if(! $scope.stockBackup || $scope.stockBackup.length == 0){
        return stocks;
      }
      $.each(stocks,function(i,t){
        var s = $scope.findStockInBackup(t);
        if(s && s.id){
          $.extend(stocks[i],s);
          if((s.sold_num == "" || s.sold_num == undefined)){
            stocks[i].sold_num = 0;
          }
        }
      });
      return stocks;
    };

    $scope.findStockInBackup = function(stock){
      var i = $scope.getFilterKeys(stock);
      var t,o = $scope.stockBackup.length;
      for(var s = 0; s < o; s ++){
        var a = $scope.stockBackup[s];
        var l = $scope.getFilterKeys(a);
        if(i === l){
          t = a;
          break;
        }
      }
      return t;
    };

    $scope.getSpecsFilterKeys = function(prefix,specs){
      if(! specs){
        return null;
      }
      var t = [];
      for(var n = 1; n <= 3; n ++){
        var i = prefix + n;
        var s = specs[i];
        if(s != undefined){
          t.push(s);
        }
      }
      return t.join("-");
    };

    $scope.getFilterKeys = function(stock){
      if(! stock){
        stock = {};
      }
      var t = [];
      for(var n = 1; n <= 5; n ++){
        var i = "v" + n;
        var s = stock[i];
        if(s != undefined){
          t.push(i + "_" + s);
        }
      }
      return t.join("-");
    };

    $scope.updateStockBackup = function(stocks){
      $scope.stockBackup = stocks;
    };

    // 平面数据立体化
    $scope.loadGoodsSpecs = function(goodsSpecs){
      var specRow1 = goodsSpecs[0];
      var sku_name1 = specRow1.sku_name1;
      var sku_name2 = specRow1.sku_name2;
      var sku_name3 = specRow1.sku_name3;
      var sku_id1,sku_id2,sku_id3;
      var sku_valueList1 = [];
      var sku_valueList2 = [];
      var sku_valueList3 = [];
      var sku_nameList1 = [];
      var sku_nameList2 = [];
      var sku_nameList3 = [];

      $.each($scope.specs,function(n,e){
        if(e.s_name == sku_name1){
          sku_id1 = e.id;
        }
        if(e.s_name == sku_name2){
          sku_id2 = e.id;
        }
        if(e.s_name == sku_name3){
          sku_id3 = e.id;
        }
      });

      $.each(goodsSpecs,function(n,e){
        if(sku_id1){
          var flag = true;
          if(sku_nameList1.length > 0){
            $.each(sku_nameList1,function(nn,ee){
              if(ee.name == e.sku_name1 && ee.text == e.sku_value1){
                flag = false;
                return;
              }
            });
          }
          if(flag == true){
            sku_valueList1.push({id:n,text:e.sku_value1});
            sku_nameList1.push({name:e.sku_name1,text:e.sku_value1});
          }
        }
        if(sku_id2){
          var flag = true;
          if(sku_nameList2.length > 0){
            $.each(sku_nameList2,function(nn,ee){
              if(ee.name == e.sku_name2 && ee.text == e.sku_value2){
                flag = false;
                return;
              }
            });
          }
          if(flag == true){
            sku_valueList2.push({id:n,text:e.sku_value2});
            sku_nameList2.push({name:e.sku_name2,text:e.sku_value2});
          }
        }
        if(sku_id3){
          var flag = true;
          if(sku_nameList3.length > 0){
            $.each(sku_nameList3,function(nn,ee){
              if(ee.name == e.sku_name3 && ee.text == e.sku_value3){
                flag = false;
                return;
              }
            });
          }
          if(flag == true){
            sku_valueList3.push({id:n,text:e.sku_value3});
            sku_nameList3.push({name:e.sku_name3,text:e.sku_value3});
          }
        }
      });

      if(sku_id1){
        var goodsSpec1 = {id:sku_id1,text:sku_name1,list:sku_valueList1};
        $scope.goodsSpecs.push(goodsSpec1);
      }
      if(sku_id2){
        var goodsSpec2 = {id:sku_id2,text:sku_name2,list:sku_valueList2};
        $scope.goodsSpecs.push(goodsSpec2);
      }
      if(sku_id3){
        var goodsSpec3 = {id:sku_id3,text:sku_name3,list:sku_valueList3};
        $scope.goodsSpecs.push(goodsSpec3);
      }
    };

    $scope.cancel = function(){
      $state.go("console.proxy_goods");
    };

    $scope.save = function(){
      $http.post('goods/saveGoodsAuth',{status:$scope.status,id:$scope.goods.id})
      .success(function(data){
        if(data.result == "success"){
          notifyService.info(data.message,"center");
          $scope.cancel();
        }else{
          notifyService.error(data.message,"center");
        }
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.loadDt = function(){
      $http.post('goods/getDeliveryTpl',{id:$scope.goods.trans_template_id})
      .success(function(data){
	    	if(data){
	            var send=angular.fromJson(data.send_area);
	            console.log(send);
	            for(var i in send){
	          	     $scope.deliveryTpl.push(send[i]);
	            }
	        }
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.loadProxyGrade = function(){
      $http.post('goods/getMemberGrade',{id:$scope.goods.shop_id})
      .success(function(data){
        if(data){
          $scope.memberGrades = data;
        }
      }).error(function(e){
        console.error(e);
      });
    };

    $scope.loadAllSpec();
    $scope.loadGoods();

  }]);