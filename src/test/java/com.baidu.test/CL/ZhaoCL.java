package com.baidu.test.CL;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lmy on 2016/9/14.
 */
public class ZhaoCL {
    @Test
    public void zhaoCL() {
        List<String> list = new ArrayList();
        list.add("<html><head></head><body>");
        HttpUtils httpUtils = new HttpUtils();
        int index = 1;
        int yeShu = 1;

        for (int i = 1; i <= 2; i++) {

            String url = "http://www.btdao.biz/list/MCB3DBD-05-s1d-";
            url = url + i + ".html";
            String desc = httpUtils.invorkHttpClientGetRequest(url, null);

            String pattern = "\"(magnet.*?)\"";
            Pattern r = Pattern.compile(pattern);

            Matcher m = r.matcher(desc);

            while (m.find()) {
                list.add("<a href=\"" + m.group(1) + "\">cili" + index++ + "</a><br>");
            }
        }


        try {
            list.add("</body></html>");
            FileUtils.writeLines(new File("c:/aa.html"), list);
        } catch (Exception e) {
        }
    }

}
