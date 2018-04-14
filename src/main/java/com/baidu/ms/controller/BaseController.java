package com.baidu.ms.controller;

import com.baidu.ms.common.BaiduConstants;
import com.baidu.ms.pojo.Shop;
import com.baidu.ms.pojo.User;
import org.apache.commons.lang.NullArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseController {
    public static final String CODE = "code";
    public static final String MSG = "message";
    public static final String RESULT = "result";
    public static final String RESULT_FAIL = "fail";
    public static final String RESULT_SUCCESS = "success";

    protected Map paramMap = new HashMap();
    protected Map operatorMap = new HashMap();
    protected Map orderByMap = new HashMap();
    protected int pageNumber = 1;
    protected int pageSize = 10;

    @Autowired(required = false)
    HttpServletRequest request;

    @Autowired(required = false)
    HttpSession session;

    /**
     * 获得当前登录用户
     *
     * @return
     */
    public User getCurrentUser() throws Exception {
        Object object = session.getAttribute(BaiduConstants.CURRENT_USER);
        if (object != null)
            return (User) object;
        else
            return null;
    }

    public Shop getCurrentShop() throws Exception {
        Object object = session.getAttribute(BaiduConstants.CURRENT_SHOP);
        if (object != null)
            return (Shop) object;
        else
            return null;
    }

    /**
     * 获得当前页码
     *
     * @return
     */
    public int getPageNumber() throws Exception {
        return getParaToInt("pageNumber", 1);
    }

    /**
     * 获得每页显示条数
     *
     * @return
     */
    public Integer getPageSize() throws Exception {
        return getParaToInt("pageSize", 10);
    }

    public Integer getParaToInt(String name) throws Exception {
        return toInt(request.getParameter(name), null);
    }

    public Integer getParaToInt(String name, Integer defaultValue) throws Exception {
        return toInt(request.getParameter(name), defaultValue);
    }

    /**
     * ThreadLocal确保高并发下每个请求的request，response都是独立的
     */
    private static ThreadLocal<ServletRequest> currentRequest = new ThreadLocal<ServletRequest>();
    private static ThreadLocal<ServletResponse> currentResponse = new ThreadLocal<ServletResponse>();

    /**
     * 线程安全初始化reque，respose对象
     *
     * @param request
     * @param response
     * @date 2015年11月24日
     * @author 漂泊者及其影子
     */
    @ModelAttribute
    public void initReqAndRep(HttpServletRequest request, HttpServletResponse response) throws Exception {
        currentRequest.set(request);
        currentResponse.set(response);
    }

    /**
     * 线程安全
     *
     * @return
     * @date 2015年11月24日
     * @author 漂泊者及其影子
     */
    public HttpServletRequest request() throws Exception {
        return (HttpServletRequest) currentRequest.get();
    }

    /**
     * 线程安全
     *
     * @return
     * @date 2015年11月24日
     * @author 漂泊者及其影子
     */
    public HttpServletResponse response() throws Exception {
        return (HttpServletResponse) currentResponse.get();
    }

    public static final String SUCESS = "success";

    // jsp 返回
    public static final String FAILURE = "failure";

    // app端返回
    public static final String ERROR = "error";

    // 返回json
    public static final String JSON_VIEW = "json/json";

    // ------------------------------------------------------------------constants

    /**
     * 跳转到到登录页面(jsp接口调用)
     *
     * @return
     * @date 2015年11月18日
     * @author 佚名
     */
    public ModelAndView toLoginView() throws Exception {
        return new ModelAndView("leaguer/loginNew");
    }

    private Integer toInt(String value, Integer defaultValue) throws Exception {
        if (value == null || "".equals(value.trim()))
            return defaultValue;
        value = value.trim();
        if (value.startsWith("N") || value.startsWith("n"))
            return -Integer.parseInt(value.substring(1));
        return Integer.parseInt(value);
    }

    /**
     * 异常处理
     */
    @ExceptionHandler
    public String exp(HttpServletRequest request, Exception ex) {

        request.setAttribute("ex", ex);

        // 根据不同错误转向不同页面
        if (ex instanceof ArrayStoreException) {
            return "error-business";
        } else if (ex instanceof NullArgumentException) {
            return "error-parameter";
        } else {
            return "error";
        }
    }
}
