<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2018/1/15
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功</title>
    <%--<style type="text/css" >--%>
    <%--table tr td{height: 200px;width: 200px}--%>
    <%--table tr {height: 200px;width: 200px}--%>
    <%--</style>--%>
</head>
<body>

<h1>成功</h1>

<table border="1px">
    <tr>
        <th>username</th>
        <th>age</th>
    </tr>
    <c:forEach items="${requestScope.users}" var="user">

        <tr>
            <td>${user.username}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
