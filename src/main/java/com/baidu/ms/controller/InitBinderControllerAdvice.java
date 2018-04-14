package com.baidu.ms.controller;

import com.baidu.ms.initializer.MyEditor;
import com.baidu.ms.pojo.User;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * Created by Administrator on 2017/2/28.
 */
@ControllerAdvice
public class InitBinderControllerAdvice {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(User.class, new MyEditor());
    }

}
