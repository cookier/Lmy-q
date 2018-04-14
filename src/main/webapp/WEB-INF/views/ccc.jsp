<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<base href="<%=basePath%>">
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/5
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
    <form id="myform" action="saveUserDetails" method="POST" commandName="user">
        <input type="text" name="firstName" path="mobile" />
        <input type="text" name="lastName" path="password" />
        <input type="text" name="email" path="nickname" />
        <input type="submit" value="submit">
    </form>
    </body>
</html>
