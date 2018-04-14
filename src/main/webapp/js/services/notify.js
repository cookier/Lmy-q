/**
 * Created by sara on 2015/9/28.
 */
app.service('notifyService', ['$http','$q','$modal','notify', function ($http,$q,$modal,notify) {
    var self = this; // Save reference
    this.success=function(msg,position,templateUrl,scope){
        var args ={
            message: msg,
            classes: "alert-success",
            position: 'right',
            duration: 3000
        };
        if(position){
            args.position = position;
        }
        if(templateUrl){
            args.templateUrl = templateUrl;
        }
        if(scope){
            args.scope = scope;
        }

        notify(args);
    };
    this.error=function(msg,position,templateUrl,scope){
        var args ={
            message: msg,
            classes: "alert-error",
            position: 'right',
            duration: 3000
        };
        if(position){
            args.position = position;
        }
        if(templateUrl){
            args.templateUrl = templateUrl;
        }
        if(scope){
            args.scope = scope;
        }
        notify(args);
    };

    this.info=function(msg,position,templateUrl,scope){
        var args ={
            message: msg,
            classes: "alert-info",
            position: 'right',
            duration: 3000
        };
        if(position){
            args.position = position;
        }
        if(templateUrl){
            args.templateUrl = templateUrl;
        }
        if(scope){
            args.scope = scope;
        }
        notify(args);
    };


}]);