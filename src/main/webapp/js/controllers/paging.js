'use strict';

app.controller('PaginationController',['$scope','$attrs','$parse','pageService',function($scope,$attrs,$parse,pageService){
  $scope.pageSizes = [10,20,30];
  $scope.itemsPerPage = 10;
  $scope.canChangePageSize = "true";
  $scope.textShow = $scope.textShow?$scope.textShow:'true';
  $scope.sumPageData = [1];
  $scope.showPage = $scope.showNum?$scope.showNum:2;//选中的页面前后显示个数shop-num='2'
  $scope.returnId = $scope.returnId?$scope.returnId:'';//----翻页跳转到指定id位置return-id='id名称'  默认为顶部
  if(pageService.queryParam.get("pageSize")){
    $scope.itemsPerPage = pageService.queryParam.get("pageSize");
  }

  var self = this,
    ngModelCtrl = {$setViewValue:angular.noop}, // nullModelCtrl
    setNumPages = $attrs.numPages?$parse($attrs.numPages).assign:angular.noop;

  this.init = function(ngModelCtrl_,config){
    ngModelCtrl = ngModelCtrl_;
    this.config = config;

    ngModelCtrl.$render = function(){
      self.render();
    };

    //$scope.itemsPerPage = $scope.pageSize;

    /*if ($attrs.itemsPerPage) {
     $scope.$parent.$watch($parse($attrs.itemsPerPage), function(value) {
     $scope.itemsPerPage = parseInt(value, 2);
     $scope.totalPages = self.calculateTotalPages();
     });
     } else {
     $scope.itemsPerPage = config.itemsPerPage;
     }*/

  };

  this.calculateTotalPages = function(){
    var totalPages = $scope.itemsPerPage < 1?1:Math.ceil($scope.totalItems / $scope.itemsPerPage);
    return Math.max(totalPages || 0,1);
  };

  this.render = function(){
    $scope.page = parseInt(ngModelCtrl.$viewValue,10) || 1;
  };

  $scope.selectPage = function(page){
    if(isNaN(page)){
      alert("不是一个有效数字");
      page = 1;
    }
    if($scope.page !== page && page > 0 && page <= $scope.totalPages){
      ngModelCtrl.$setViewValue(page);
      ngModelCtrl.$render();
    }
  };

  $scope.changePageSize = function(value){
    $scope.totalPages = self.calculateTotalPages();
    $scope.pageSize = value;
    setTimeout(function(){
      $scope.$parent.$eval($attrs.ngChange);
    },200);
  };

  $scope.changePageNumber = function(){
    var page = $("#input-sm-page").val();
    if(isNaN(page)){
      layer.msg("不是一个有效数字");
      $scope.page = 1;
    }else if(page > $scope.totalPages){
      layer.msg("超出最大页数");
      $scope.page = $scope.totalPages;
    }else{
      $scope.page = page;
    }
    setTimeout(function(){
      ngModelCtrl.$setViewValue($scope.page);
      ngModelCtrl.$render();
    },200);
  };

  $scope.getText = function(key){
    return $scope[key + 'Text'] || self.config[key + 'Text'];
  };
  $scope.noPrevious = function(){
    return $scope.page === 1;
  };
  $scope.noNext = function(){
    return $scope.page === $scope.totalPages;
  };
  $scope.sumPageDataArray = function(){
    var array = [];
    for(var i = 1; i <= $scope.totalPages; i ++){
      array.push(i);
    }
    $scope.sumPageData = array;
  }

  $scope.returnTop = function(){
    //$scope.returnId----翻页跳转到指定id位置return-id='id名称'  默认为顶部
    if($scope.returnId != "" && $scope.returnId && $("#" + $scope.returnId)){
      var height = document.getElementById($scope.returnId).offsetTop;
      if($(".app-header")){
        height = height - $(".app-header").height();
      }
      window.scrollTo(0,height);
    }else{
      window.scrollTo(0,0);
    }
  }

  $scope.$watch('totalItems',function(){
    $scope.totalPages = self.calculateTotalPages();
    $scope.sumPageDataArray();
  });

  $scope.$watch('totalPages',function(value){
    setNumPages($scope.$parent,value); // Readonly variable

    if($scope.page > value){
      $scope.selectPage(value);
    }else{
      ngModelCtrl.$render();
    }
  });
}]);

app.directive('customPagination',['$parse',function($parse){
  return {
    restrict:'EA',
    scope:{
      returnId:'@',
      textShow:'@',
      showNum:'=',
      totalItems:'=',
      pageSize:'=',
      firstText:'@',
      previousText:'@',
      nextText:'@',
      lastText:'@',
      canChangePageSize:'@?'
    },
    require:['customPagination','?ngModel'],
    controller:'PaginationController',
    templateUrl:'html/common/pagination.html',
    replace:true,
    link:function(scope,element,attrs,ctrls){
      var paginationCtrl = ctrls[0],ngModelCtrl = ctrls[1];

      if(! ngModelCtrl){
        return; // do nothing if no ng-model
      }
      var paginationConfig = {
//			  itemsPerPage: (scope.pageSize=='undefined'?10:scope.pageSize),
        itemsPerPage:10,
        boundaryLinks:false,
        directionLinks:true,
        firstText:'First',
        previousText:'Previous',
        nextText:'Next',
        lastText:'Last',
        rotate:true
      };

      // Setup configuration parameters
      var maxSize = angular.isDefined(attrs.maxSize)?scope.$parent.$eval(attrs.maxSize):paginationConfig.maxSize,
        rotate = angular.isDefined(attrs.rotate)?scope.$parent.$eval(attrs.rotate):paginationConfig.rotate;
      scope.boundaryLinks = angular.isDefined(attrs.boundaryLinks)?scope.$parent.$eval(attrs.boundaryLinks):paginationConfig.boundaryLinks;
      scope.directionLinks = angular.isDefined(attrs.directionLinks)?scope.$parent.$eval(attrs.directionLinks):paginationConfig.directionLinks;

      paginationCtrl.init(ngModelCtrl,paginationConfig);

      if(attrs.maxSize){
        scope.$parent.$watch($parse(attrs.maxSize),function(value){
          maxSize = parseInt(value,1);
          paginationCtrl.render();
        });
      }

      // Create page object used in template
      function makePage(number,text,isActive){
        return {
          number:number,
          text:text,
          active:isActive
        };
      }

      function getPages(currentPage,totalPages){
        var pages = [];

        // Default page limits
        var startPage = 1,endPage = totalPages;
        var isMaxSized = ( angular.isDefined(maxSize) && maxSize < totalPages );

        // recompute if maxSize
        if(isMaxSized){
          if(rotate){
            // Current page is displayed in the middle of the visible ones
            startPage = Math.max(currentPage - Math.floor(maxSize / 2),1);
            endPage = startPage + maxSize - 1;

            // Adjust if limit is exceeded
            if(endPage > totalPages){
              endPage = totalPages;
              startPage = endPage - maxSize + 1;
            }
          }else{
            // Visible pages are paginated with maxSize
            startPage = ((Math.ceil(currentPage / maxSize) - 1) * maxSize) + 1;

            // Adjust last page if limit is exceeded
            endPage = Math.min(startPage + maxSize - 1,totalPages);
          }
        }

        // Add page number links
        for(var number = startPage; number <= endPage; number ++){
          var page = makePage(number,number,number === currentPage);
          pages.push(page);
        }

        // Add links to move between page sets
        if(isMaxSized && ! rotate){
          if(startPage > 1){
            var previousPageSet = makePage(startPage - 1,'...',false);
            pages.unshift(previousPageSet);
          }

          if(endPage < totalPages){
            var nextPageSet = makePage(endPage + 1,'...',false);
            pages.push(nextPageSet);
          }
        }

        return pages;
      }

      var originalRender = paginationCtrl.render;
      paginationCtrl.render = function(){
        originalRender();
        if(scope.page > 0 && scope.page <= scope.totalPages){
          scope.pages = getPages(scope.page,scope.totalPages);
        }
      };
    }
  };
}]);