<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2018/1/23
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
$END$
</body>
<script type="text/javascript">
    function show() {
        var jsontext = new XMLHttpRequest();
        jsontext.open("get", "show.action", true);
        jsontext.send(null);
        jsontext.onreadystatechange = function () {
            if (this.readyState == 4 && this.status == 200) {
                var text = jsontext.responseText;
                document.write(text);
            }
        }
    }

    window.onload = function () {
        show();
    }
</script>
</html>
