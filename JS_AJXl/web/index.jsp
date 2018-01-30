<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2018/1/24
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<script type="text/javascript">

    function success(allData) {
        $("#input~div").remove();

        $(allData).each(function (index, data) {
            $("#input").after($("<div>").text(data));

        })
    }


    function error() {
        alert("加载失败")
    }

    function send() {
        $("#input").after($("<h1>").text("正在加载"))
    }

    function final() {
        $("#input~h1").remove();

    }


</script>

</body>
</html>
