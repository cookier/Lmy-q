app.factory('authService',function($http,$q){

  var userRole = []; // obtained from backend
  var userRoleRouteMap = {
    'ROLE_ADMIN':['/dashboard','/about-us','/authError'],
    'ROLE_USER':['/usersettings','/usersettings/personal','/authError']
  };

  console.log(app.user);

  return {

    userHasRole:function(role){
      for(var j = 0; j < userRole.length; j ++){
        if(role == userRole[j]){
          return true;
        }
      }
      return false;
    },

    isUrlAccessibleForUser:function(route){

      var defer = $q.defer();
      var promise = defer.promise;

      promise.then(function(){
        if(route != '/no_permission_action' || ! _global.user.platformPermissions){
          $http.post('permission/getAllPermissionsForUser',{userId:_global.user.id})
          .success(function(req){
            _global.user.platformPermissions = req.platformPermissions;
          });
        }
      }).then(function(){
        if(route == '/no_permission_action' || _global.user.type == 3){
          _global.routerState = true;
          return;
        }else{
          for(var i = 0; i < _global.user.platformPermissions.length; i ++){
            var url = _global.user.platformPermissions[i].permission_url;

            if(route == url){
              _global.routerState = true;
              return;
            }
          }
          _global.routerState = false;
          return;
        }
      });

      defer.resolve();
    }
  };
});
