package com.baidu.ms.initializer;

import com.baidu.ms.pojo.User;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2017/2/28.
 */
public class MyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] values = text.split(",");
        User user = new User();
        user.setNickname(values[0]);
        System.out.println(this.hashCode());

        try {
            user.setRegistTime(new SimpleDateFormat("yyyy-MM-dd").parse(values[1]));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        setValue(user);
        super.setAsText(text);
    }

}
