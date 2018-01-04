<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2018/1/3
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>哈哈哈</h1>
<%--
    请求包含, 动态包含
    会先创建1_Hello.jsp文件的java.文件
    然后在包含进6.jsp
--%>
    <jsp:include  page="4_target.jsp"/>
</body>
</html>
