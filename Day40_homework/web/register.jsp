<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2018/1/16
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<form action="register.action" method="post"><<br>
    用户名:<input type="text" name="username"><br>
    密码:<input type="text" name="password"><br>
    确认密码:<input type="text" name="password2"><br>
    电话号码:<input type="text" name="phone_number"><br>
    邮箱:<input type="text" name="email"><br>
    验证码:<input type="text" name="ver"><br>
<input type="submit" value="登录">
</form>
</body>
</html>
