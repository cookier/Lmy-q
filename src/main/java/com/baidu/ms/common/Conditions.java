package com.baidu.ms.common;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于生成JFinal的SQL查询语句<br>
 * 工具说明： 1.setFiledQuery 指定字段查询的TYPE，通过record或者model对象将查询需要的值传入，并生成sql。<br>
 * 例如：<br>
 * setFiledQuery(FUZZY_LEFT,"name","phone");<br>
 * modelToCondition(new Model().set("name","admin");<br>
 * 此时生成sql为：and name like "%admin" //因为只传了name的值没有phone的，故不生成phone<br>
 * <p>
 * 2.当setValueQuery中字段和BizUser对象中的字段重叠时，以setValueQuery为准.<br>
 * 例如：<br>
 * conditions.setValueQuery(Conditions.FUZZY_LEFT,BizUser.COL_NAME,"admin");<br>
 * //传入name和phone的值<br>
 * modelToCondition(new Model().set("name","admin").set("phone","13012341234"));<br>
 * 此时生成sql为：and name like "%admin" //因为setValueQuery中只有name的查询类型；<br>
 * <p>
 * 3.如果需要以modal中的参数和值为准，请将modelToCondition方法的isAll设为false.
 * <p>
 * Created by konbluesky Date : 14-9-16 下午4:58 Project : JiaYi_WebServer
 * http://my.oschina.net/helloyangxp/blog/294231
 */
public class Conditions {
    static Logger log = Logger.getLogger(Conditions.class);

    public static final String EQUAL = "EQUAL"; // 相等

    public static final String NOT_EQUAL = "NOT_EQUAL"; // 不相等

    public static final String LESS_THEN = "LESS_THEN"; // 小于

    public static final String LESS_EQUAL = "LESS_EQUAL"; // 小于等于

    public static final String GREATER_EQUAL = "GREATER_EQUAL"; // 大于等于

    public static final String GREATER_THEN = "GREATER_THEN"; // 大于

    public static final String FUZZY = "FUZZY"; // 模糊匹配 %xxx%

    public static final String FUZZY_LEFT = "FUZZY_LEFT"; // 左模糊 %xxx

    public static final String FUZZY_RIGHT = "FUZZY_RIGHT"; // 右模糊 xxx%

    public static final String NOT_EMPTY = "NOT_EMPTY"; // 不为空值的情况

    public static final String EMPTY = "EMPTY"; // 空值的情况

    public static final String IN = "IN"; // 在范围内

    public static final String NOT_IN = "NOT_IN"; // 不在范围内

    public static final String AND = "AND"; // 且

    public static final String OR = "OR"; // 或


    /***************************************************************************
     * 构建SQL语句
     *
     * @param sb
     *            用于拼接SQL语句
     * @param unionType
     *            连接类型  and or
     * @param queryType
     *            查询类型
     * @param fieldName
     *            字段名称
     * @param fieldValue
     *            字段值
     * @param alias
     *            别名
     * @return
     */
    @SuppressWarnings("unchecked")
    public static void buildSQL(StringBuilder sb, String unionType, String queryType, String fieldName,
                                Object fieldValue, String alias, ArrayList<Object> params) {
        // 非空的时候进行设置
        if (null != fieldValue && null != fieldName) {
            if (EQUAL.equals(queryType)) {
                sb.append(" " + unionType + " " + alias + fieldName + " = ? ");
                params.add(fieldValue);
            } else if (NOT_EQUAL.equals(queryType)) {
                sb.append(" " + unionType + " " + alias + fieldName + " <> ? ");
                params.add(fieldValue);
            } else if (LESS_THEN.equals(queryType)) {
                sb.append(" " + unionType + " " + alias + fieldName + " < ? ");
                params.add(fieldValue);
            } else if (LESS_EQUAL.equals(queryType)) {
                sb.append(" " + unionType + " " + alias + fieldName + " <= ? ");
                params.add(fieldValue);
            } else if (GREATER_THEN.equals(queryType)) {
                sb.append(" " + unionType + " " + alias + fieldName + " > ? ");
                params.add(fieldValue);
            } else if (GREATER_EQUAL.equals(queryType)) {
                sb.append(" " + unionType + " " + alias + fieldName + " >= ? ");
                params.add(fieldValue);
            } else if (FUZZY.equals(queryType)) {
                sb.append(" " + unionType + " " + alias + fieldName + " like ? ");
                params.add("%" + fieldValue + "%");
            } else if (FUZZY_LEFT.equals(queryType)) {
                sb.append(" " + unionType + " " + alias + fieldName + " like ? ");
                params.add("%" + fieldValue);
            } else if (FUZZY_RIGHT.equals(queryType)) {
                sb.append(" " + unionType + " " + alias + fieldName + " like ? ");
                params.add(fieldValue + "%");
            } else if (IN.equals(queryType)) {
                try {
                    List list = (List) fieldValue;
                    StringBuffer instr = new StringBuffer();
                    sb.append(" " + unionType + " " + alias + fieldName + " in (");
                    for (Object obj : list) {
                        instr
                                .append(StringUtils.isNotBlank(instr) ? ",?"
                                        : "?");
                        params.add(obj);
                    }
                    sb.append(instr + ") ");
                } catch (Exception e) {
                    throw new RuntimeException(
                            "使用IN条件的时候传入的值必须是个List对象，否则将会转换出错!例如将 in('1','2','3')中的'1','2','3'分为三个分别添加到List中做为值传入.",
                            e);
                }
            } else if (NOT_IN.equals(queryType)) {
                try {
                    List list = (List) fieldValue;
                    StringBuffer instr = new StringBuffer();
                    sb.append(" " + unionType + " " + alias + fieldName + " not in (");
                    for (Object obj : list) {
                        instr
                                .append(StringUtils.isNotBlank(instr) ? ",?"
                                        : "?");
                        params.add(obj);
                    }
                    sb.append(instr + ") ");
                } catch (Exception e) {
                    throw new RuntimeException(
                            "使用NOT IN条件的时候传入的值必须是个List对象，否则将会转换出错!例如将 not in('1','2','3')中的'1','2','3'分为三个分别添加到List中做为值传入.",
                            e);
                }
            }
        } else {
            if (EMPTY.equals(queryType)) {
                sb.append(" " + unionType + " " + alias + fieldName + " is null ");
            } else if (NOT_EMPTY.equals(queryType)) {
                sb.append(" " + unionType + " " + alias + fieldName + " is not null ");
            }
        }
    }
}
