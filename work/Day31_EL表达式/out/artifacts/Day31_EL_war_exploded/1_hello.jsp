<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2018/1/4
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
使用EL可以获得JSP四大域中的域属性
这与昨天学到的PageContext的全域查找是一个意思
EL表达式的格式
    ${}
--%>

<%

    System.out.println(pageContext.getClass().getName());
%>
<%--${name}--%>
${100+5}
${10-5}
${100*5}
${100/5}
${100%5}
${5==5}
${5!=5}
${5<100}
${5>100}
${5>=5}
${true&&false}
${!true}
${true||false}
${empty""}
</body>
</html>
