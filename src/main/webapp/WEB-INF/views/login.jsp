<%--
  Created by IntelliJ IDEA.
  User: lmy
  Date: 2017/2/26
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
    <h1>login page</h1>
    <form id="" action="dologin" method="post">
        <label>User Name</label> <input tyep="text" name="userName" maxLength="40" />
        <label>Password</label><input type="password" name="password" /> <input type="submit" value="login" />
    </form>
    <%--用于输入后台返回的验证错误信息 --%>
    <P><c:out value="${message }" /></P>
    </body>
</html>
