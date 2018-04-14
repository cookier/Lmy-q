(function(w){
  var myJq = {};
  w.myJq = myJq;
  var types = {};

  var optionsCache = {};

  function createOptions(options){
    var object = optionsCache[options] = {};
    jQuery.each(options.match(/\S+/) || [],function(_,flag){
      object[flag] = true;
    });
    return object;
  }

  myJq.callback = function(options){
    //这样节约了一个变量
    options = typeof options == 'string'?optionsCache[options] || createOptions(options):$.extend({},options);

    var memory,fired,firing,firingStart,firingLength,firingIndex,list = [],stack = ! options.once && [],
      fire = function(data){
        memory = options.memory && data;
        fired = true;
        firingIndex = firingStart || 0;
        firingStart = 0;
        firingLength = list.length;
        firing = true;
        for(; list && firingIndex < firingLength; firingIndex ++){
          if(false === list[firingIndex].apply(data[0],data[1]) && options.stopOnFalse){
            memory = false; // To prevent further calls using add
            break;
          }
        }
        firing = false;
        if(list){
          if(stack){
            if(stack.length){
              fire(stack.shift());
            }
          }else if(memory){
            list = [];
          }else{
            self.disable();
          }
        }
      },
      self = {
        add:function(fn){

          if(list){
            var start = list.length;
            (function add(args){
              $.each(args,function(_,arg){
                var type = $.type(arg);
                if(type == 'function'){
                  if(! options.unique || ! self.has(arg)){
                    list.push(arg);
                  }
                }else if(arg && arg.length && type !== 'string'){ //数组的情况
                  add(arg);  //递归调用
                }
              })
            })(arguments);

            if(firing){
              firingLength = list.length;
            }else if(memory){
              firingStart = start;
              fire(memory);
            }
          }

        },
        fire:function(data){
          $.each(list,function(index,item){
            item.call(this,data);
          })
        },
        remove:function(){
          if(list){
            $.each(arguments,function(_,arg){
              var index;
              while((index = $.inArray(list,arg)) > - 1){
                list.splice(index,1);

                if(firing){
                  if(index <= firingLength){
                    firingLength --;
                  }
                  if(index <= firingIndex){
                    firingIndex --;
                  }
                }
              }

            })

            return this;
          }
        },

        has:function(fn){
          return fn?$.inArray(fn,list) > - 1:! ! (list && list.length);
        },

        //置空
        empty:function(){
          list = [];
          firingLength = 0;
          return this;
        },

        disable:function(){
          list = stack = memory = undefined;
          return this;
        },

        lock:function(){
          stack = undefined;
          if(! memory){
            self.disable();
          }
          return this;
        },

        locked:function(){
          return ! stack;
        },

        fired:function(){
          return ! ! fired;
        },

        fire:function(){
          self.fireWith(this,arguments);
          return this;
        },

        fireWith:function(context,args){
          if(list && (! fired || stack)){
            args = args || [];
            args = [context,args.slice?args.slice():args];
            if(firing){
              stack.push(args);
            }else{
              fire(args);
            }
          }

          return this;

        },
      };

    return self;

  };
})(window)