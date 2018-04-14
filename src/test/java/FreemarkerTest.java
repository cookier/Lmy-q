import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lmy on 2017/7/24.
 */
public class FreemarkerTest {
    public Template getTemplate(String name) {
        try {
            Configuration configuration = new Configuration(Configuration.VERSION_2_3_21);
            configuration.setClassForTemplateLoading(this.getClass(), "/ftl");
            Template template = configuration.getTemplate(name);

            return template;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    public void print(String name,Map<String,Object> root){
        Template template = this.getTemplate(name);
        try {
            template.process(root,new PrintWriter(System.out));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void fprint(String name,Map<String,Object> root,String outFile){
        FileWriter out = null;
        
        try {
            out = new FileWriter(new File("D:/new_works/freeMarker/src/static/" + outFile));
            Template temp = this.getTemplate(name);
            temp.process(root,out);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            if(out != null){
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FreemarkerTest freemarkerTest = new FreemarkerTest();
        if(freemarkerTest ==null){
            freemarkerTest = new FreemarkerTest();
        }
        Map<String,Object> root = new HashMap<String,Object>();
        root.put("user_name", "胖先生");
        freemarkerTest.print("demo.ftl",root);
    }
}
