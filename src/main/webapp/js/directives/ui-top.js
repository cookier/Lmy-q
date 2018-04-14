angular.module('app')
.directive('uiTop',function(){
  return function(scope,element,attrs){
    element.bind("click",function(event){
      var tags = document.getElementsByClassName('topMenuClick');

      if(tags.length>0){
        tags[0].setAttribute('class','');
      }

      element.addClass('active topMenuClick');
    });
  };
});