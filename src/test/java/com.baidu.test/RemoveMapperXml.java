package com.baidu.test;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lmy on 2017/2/18.
 */
public class RemoveMapperXml {
    @Test
    public void remove() throws IOException {
        File fileList = new File("C:\\YZB\\Lmy\\src\\main\\resources\\com\\baidu\\ms\\mapper");
        for (File f : fileList.listFiles()) {
            System.out.println(f.delete());
        }

        File fileList1 = new File("C:\\YZB\\Lmy\\src\\main\\java\\com\\baidu\\ms\\mapper");
        for (File f : fileList1.listFiles()) {
            System.out.println(f.delete());
        }

        Runtime.getRuntime().exec("cmd /k cd /d C:\\software\\IntelliJ IDEA 2016.1.1\\plugins\\maven\\lib\\maven3 mybatis-generator:generate -e ");
    }

    @Test
    public void removeLine() {
        List<String> list = new ArrayList<>();
        List<String> copy = new ArrayList<>();

        File file = new File("C:\\YZB\\Lmy\\src\\main\\resources\\fe");

        try {
            list = FileUtils.readLines(file, "utf-8");
            for (String str : list) {
                if (!str.startsWith("#")) {
                    copy.add(str);
                }
            }

            FileUtils.writeLines(new File("c:/bb.txt"), copy);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
