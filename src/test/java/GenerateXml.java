import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lmy on 2017/2/21.
 */
public class GenerateXml {

    @Test
    public void generate() {
        File file = new File("C:\\YZB\\com.yzb.service\\src\\com\\yzb\\model");
        List<String> list = new ArrayList<>();

        for (File f : file.listFiles()) {
            String name = f.getName().substring(0, f.getName().length() - 5);
            StringBuffer stringBuffer = new StringBuffer("");

            stringBuffer.append("<table tableName=\"").append("t" + humpToLine(name)).append("\" domainObjectName=\"")
                    .append(name).append("\"></table>");
            list.add(stringBuffer.toString());
        }

        try {
            FileUtils.writeLines(new File("e:/2.txt"), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String humpToLine(String str) {
        return str.replaceAll("[A-Z]", "_$0").toLowerCase();
    }
}
