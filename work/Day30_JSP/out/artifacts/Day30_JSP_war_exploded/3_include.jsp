<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2018/1/3
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求包含</title>
</head>
<body>
<%@include file="4_target.jsp"%>
<%--
    静态包含include指令
    是在4_target.jsp被编译成.java文件之前
    就添加进了3_jnclude.jsp文件中了
    所以只能看到3_jnclude.java文件
--%>
<h1>我就是Include</h1>
</body>
</html>
