'use strict';

app.controller('QuestionListController', [
	'$scope',
	'$http',
	'$state',
	'$stateParams',
	'notifyService',
	'$timeout',
	'dialogService',
	'$filter',
	function($scope, $http, $state, $stateParams, notifyService,$timeout,dialogService,$filter) {
		$scope.pageData = {};
		$scope.question = {};
		$scope.content = "";
		$scope.keywordses=[];
		$scope.keywords="";
		$scope.goodsPics=[];
		$scope.lastObject = {};
		$scope.replyText = 'asdfsdfasd';
		$scope.enlargePic = '';
		$scope.yzb_icon = '';
		
		$scope.pageChanged = function() {
			var data = $.extend({}, $scope.question, {
				pageNumber : $scope.pageData.pageNumber,
				pageSize : $scope.pageData.pageSize,
				keywords : $scope.keywords,
				content:$scope.content
			});
			$http.post('question/listQuestion', data)
				.success(
					function(response) {
						if(response){
							$scope.yzb_icon = response.yzb_icon;
							$scope.pageData = response.page;
							$.each($scope.pageData.list,function(index,ques){
								var repliesArr = [];
								if(ques.replies){
									$.each(angular.fromJson(ques.replies),function(index1,replie){
										var temp = angular.fromJson(replie);
										if(temp.userId==0&&temp.content){
											var imgs = [];
											var str = temp.content.replace('\"','"')
											var patter = /<img.*?\/>/gi;
											var regArr = str.match(patter);
											if(regArr){
												$.each(regArr,function(index,a){
													var reg = /src=\"(.*?)\"/gi;
													imgs.push(reg.exec(a)[1]);
												});
											}
											temp.imgs = ['http://www.wed114.cn/jiehun/uploads/allimg/160426/39_160426110638_1.jpg'];
											
											var regForText = /<p>(.*?)<img/gi;
											temp.text = regForText.exec(temp.content)[1];
											repliesArr.push(temp);
										}else{
											repliesArr.push(temp);
										}
									});
									ques.replies = repliesArr;
								}
							});
							console.log($scope.pageData.list);
						}else{
							$scope.pageData={};
						}
					})
				.error(function(e) {
					notifyService.error(e);
			});
		};
		
		$scope.loadKeywords=function(){
			$http.post('keywords/getAllKeywords')
			.success(
				function(response) {
					if(response){
						$scope.keywordses = response;
					}
				})
			.error(function(e) {
				notifyService.error(e);
		});
		};

		$scope.del = function(id) {
 			$http.post("question/deleteQuestion",{id:id})
 			.success(function(response){
 				if(response){
 					notifyService.info(response.message);
 					if(response.result=="success"){
 						$scope.pageChanged();
 					}
 				}else{
 					notifyService.error("系统正忙，请稍后再试!");
 				}
 				
 			})
            .error(function(err){
               console.error(err);
            });
  		};

  		$scope.edit = function(id) {
  			$state.go("console.help_question_edit",{id:id});
  		}
  		
  		$scope.uploadPic = function(){
 			dialogService.openPicUploadDialog(function(data){
 				if(data&&data.length>0){
 					$.each(data,function(n,e){
 						if(e){
 							var d  = $.extend({thumb_url:e.url,pic_id: e.id},e);
 							$scope.goodsPics.push(d);
 						}
 					});
 				}
 			});
 		};
  		
 		$scope.delGoodsPic=function(pic){
			$scope.goodsPics.splice($scope.goodsPics.indexOf(pic),1);
		};
 		
		$scope.reply = function(data,$event){
			if($($event.target).html()=='回复'){
				$scope.goodsPics = [];
				$.each($scope.pageData.list,function(index,l){
					$scope.goodsPics = [];
					l.chk = false;
				});
				data.chk = true;
				$($event.target).html('保存');
			}else if($($event.target).html()=='保存'){
				if(data.replyText&&data.replyText!=''){
				}else{
					layer.alert('回复不能为空');
					return;
				}
				var fileUrls = [];
				$.each($scope.goodsPics,function(index,pics){
					fileUrls.push(pics.thumb_url);
				});
				data.replies.push({userId:0,nickName:'云中邦',text:data.replyText,time:$filter('date')(new Date(),'yyyy-MM-dd HH:mm:ss'),imgs:fileUrls,ico_url:$scope.yzb_icon});
				$($event.target).html('回复');
				$http.post('question/saveRely', {id:data.id,replies:angular.toJson(data.replies)})
					.success(function(resq){
						if(resq.result=='success'){
							layer.alert(resq.message);
						}else{
							layer.alert(resq.message);
							data.replies.splice(data.replies.length-1,1);
						}
						data.chk = false;
					}).error(function(e) {
						notifyService.error(e);
					});
				
			}
		}
		
		$scope.enlarge = function(dialogue,img,index){
			dialogue.enlargePic = img;
			if (typeof(dialogue["chk_"+index]) == "undefined"){
				$.each(dialogue.imgs,function(imgIndex,i){
					if(imgIndex==index){
						dialogue["chk_"+imgIndex] = true;
					}else{
						dialogue["chk_"+imgIndex] = false;
					}
				});
			}else{
				$.each(dialogue.imgs,function(imgIndex,i){
					if(imgIndex==index){
						dialogue["chk_"+imgIndex] = !dialogue["chk_"+imgIndex];
					}else{
						dialogue["chk_"+imgIndex] = false;
					}
				});
			}
			
			dialogue.chk=dialogue["chk_"+index];
			
		}
		
		$scope.bigImgHide = function(dialogue){
			dialogue.chk = false;
			$.each(dialogue.imgs,function(imgIndex,i){
				dialogue["chk_"+imgIndex] = false;
			});
		}
		
  		$scope.loadKeywords();
		$scope.pageChanged();
} ]);

app.controller('QuestionEditController', [
  	'$scope',
  	'$http',
  	'$state',
  	'$stateParams',
  	'notifyService',
  	function($scope, $http, $state, $stateParams, notifyService) {
  		$scope.question = {};
  		$scope.replyContent="";
  		$scope.replies=[];
  		$scope.pics=[];
  		$scope.multipleKeywords = {};
	    $scope.multipleKeywords.selectedTags = [];
	    $scope.keywords=[];
	    $scope.selecteTags = [];

  		$scope.load = function() {
  			$http.post('question/getQuestion', {id:$stateParams.id})
  				.success(
  					function(response) {
  						if(response){
  							$scope.question = response.question;
  							if(response.pics){
  								$scope.pics = response.pics;
  							}
  							$scope.selecteTags = $scope.question.keywordses; 
  							if($scope.question.replies!=""){
  								$scope.replies = angular.fromJson($scope.question.replies);
  							}
  						}
  						$scope.getDocCategorys();
  					})
  				.error(function(e) {
  					notifyService.error(e);
  			});
  		};
  		
  		$scope.getDocCategorys = function() {
			$http.post('keywords/getAllKeywords').success(function(data) {
				$scope.keywords = data;
				$scope.multipleKeywords.selectedTags=[];
                $.each($scope.keywords,function(n1,e1){
                	if($scope.selecteTags&&$scope.selecteTags.length>0){
	                    $.each($scope.selecteTags,function(n2,e2){
	                        if(e1.id==e2.id){
	                            $scope.multipleKeywords.selectedTags.push(e1);
	                        }
	                    });
                	}
                });
			}).error(function(e) {
				console.error(e);
			});
		};

  		$scope.save = function(action) {
  			var data = $.extend({replyContent:$scope.replyContent},$scope.question);
  			
  			var kwIds="";
  			if($scope.multipleKeywords.selectedTags.length>0){
  				$.each($scope.multipleKeywords.selectedTags,function(i,e){
  					if(i<$scope.multipleKeywords.selectedTags.length-1){
  						kwIds=kwIds+e.id+",";
  					}else{
  						kwIds=kwIds+e.id;
  					}
  				});
  			}
  			data.keywords=kwIds;
  			if(kwIds==""){
  				layer.alert("请选择标签!");
  				return;
  			}
  			if(!data.content){
  				layer.alert("请输入问题描述!");
  				return;
  			}
  			if(!$scope.replyContent){
  				layer.alert("请输入问题回复!");
  				return;
  			}
  			
 			$http.post("question/saveQuestion",data)
 			.success(function(response){
				if(response.result=="success"){
					 $state.go("console.help_question"); 
				}
            })
            .error(function(err){
               console.error(err);
            });
  		};
  		
  		$scope.cancel=function(){
  			$state.go("console.help_question");
  		}
  		
  		// 页面初始化数据
  		$scope.load();
 } ]);


