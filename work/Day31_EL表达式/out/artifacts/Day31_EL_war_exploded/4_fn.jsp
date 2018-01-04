<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2018/1/4
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fn"
          uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ taglib prefix="lanou3g" uri="http://lanou3g.com" %>
<html>
<head>
    <title>EL函数库</title>
</head>
<body>

        <%--
        判定参数是否以e结尾
        --%>
<%--${fn:endsWith(param.str, "e")}--%>
<%--${lanou3g:reverse("哈哈哈")}--%>
<%--${lanou3g:reverse("abcdefghijklmnopqrstuvwxyz")}--%>
${lanou3g:reverse(param.str)}
</body>
</html>
