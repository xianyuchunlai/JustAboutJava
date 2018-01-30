<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2018/1/17
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    如果使用单引号括起来,会认为hello是一个字符串
    如果不用单引号括起来会认为hello是一个表达式
    --%>
<s:property value="'hello'.length()"/>
<%--
使用#,调用request对象使用,
找到request对象中的hello属性
--%>
<s:property value="#request.hello"/>
</body>
</html>
