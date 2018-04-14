package com.baidu.ms.initializer;

import com.baidu.ms.pojo.User;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * Created by Administrator on 2017/2/27.
 */
public class MyWebBindingInitializer implements WebBindingInitializer {

    @Override
    public void initBinder(WebDataBinder binder, WebRequest request) {
        // TODO Auto-generated method stub
        binder.registerCustomEditor(User.class, new MyEditor());
    }

}
