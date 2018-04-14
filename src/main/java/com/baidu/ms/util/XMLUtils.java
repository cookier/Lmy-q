package com.baidu.ms.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class XMLUtils {

    public static Map<String, String> doParse(String xml) throws DocumentException {
        Map<String, String> map = new HashMap<String, String>();
        Document doc = DocumentHelper.parseText(xml);
        Element root = doc.getRootElement();
        List<Element> list = root.elements();

        for (Element ele : list) {
            if (ele.getName() != null)
                map.put(ele.getName(), ele.getTextTrim());
        }
        return map;
    }

}
