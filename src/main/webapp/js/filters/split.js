'use strict';

/**
 * 字符串截取
 */
app.filter('split', function () {
    return function (value,separator) {
        if (!value||value.length==0){
        	return "";
        }
        if(!separator||separator.length==0){
        	return "";
        }

        var array = new Array();
        if(value.indexOf(separator)==-1){
        	array.push(value);
        }else{
        	array = value.split(separator);
        }

        return array;
    };
});
