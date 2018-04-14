package com.baidu.ms.aop;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by lmy on 2017/2/19.
 */
@Aspect
@Component
public class ActionReport {

//    @Value("${environment}")
//    private String environment;

    private HttpServletRequest request;

    public Log logger = LogFactory.getLog(this.getClass());

    @Pointcut("execution(* com.bak.controller.*.*(..))")
    public void log() {
        logger.info(request.getParameterMap());
    }

    @Before("log()")
    public void before(JoinPoint joinPoint) {
        request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
//        if (StringUtils.equals(environment, Environment.DEV)) {
        if (true && request != null) {
            StringBuilder sb = new StringBuilder("\nSpringMVC action report -------- ")
                    .append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))
                    .append(" ------------------------------\n");

            sb.append("Controller  : ").append(joinPoint.getTarget().getClass().getName()).append(".(")
                    .append(joinPoint.getTarget().getClass().getSimpleName()).append(".java:1)");
            sb.append("\nMethod      : ").append(joinPoint.getSignature().getName()).append("\n");

            String uri = request.getRequestURI();
            if (uri != null) {
                sb.append("url         : ").append(uri).append("\n");
            }

            Enumeration<String> e = request.getParameterNames();
            if (e.hasMoreElements()) {
                sb.append("Parameter   : ");
                while (e.hasMoreElements()) {
                    String name = e.nextElement();
                    String[] values = request.getParameterValues(name);
                    if (values.length == 1) {
                        sb.append(name).append("=").append(values[0]);
                    } else {
                        sb.append(name).append("[]={");
                        for (int i = 0; i < values.length; i++) {
                            if (i > 0)
                                sb.append(",");
                            sb.append(values[i]);
                        }
                        sb.append("}");
                    }
                    sb.append("  ");
                }
                sb.append("\n");
            }
            sb.append("--------------------------------------------------------------------------------\n");
            System.out.print(sb.toString());
        } else {
            StringBuilder sb = new StringBuilder();

            sb.append(request.getRequestURI()).append(", ");
            sb.append("IP: " + request.getRemoteAddr()).append(", [");

            Map<String, String[]> parameters = request.getParameterMap();

            for (Map.Entry<String, String[]> entity : parameters.entrySet()) {

                sb.append(String.format("%s = %s, ", entity.getKey(), StringUtils.join(entity.getValue(), ',')));
            }

            sb.delete(sb.length() - 2, sb.length()).append("]");

            logger.info(sb.toString());
        }
    }

    @AfterReturning(pointcut = "log()", returning = "returnValue")
    public void afterReturning(JoinPoint joinPoint, Object returnValue) {
        logger.info("return value is " + returnValue);
    }

}
