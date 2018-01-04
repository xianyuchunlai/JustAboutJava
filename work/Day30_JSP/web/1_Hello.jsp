<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2018/1/3
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
设置错误处理页面
当1_Hello 页面出现异常时,会自动转发到2_ERROR
--%>
<%@page errorPage="2_ERROR.jsp" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //是在Service方法中的
    Object attribute =
            request.getAttribute("users");

    int a = 10/0;
    System.out.println(a);
%>

a的值为:<%=a%>
<%!
    //是在类中的
    public void dodo(){

    }

    //这就是在定义成员变量
    private String name;
%>

</body>
</html>
