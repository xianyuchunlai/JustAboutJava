<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2017/12/29
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <script src="jquery-3.2.1.min.js"></script>
  </head>
  <body>

  <form action="user" method="post">
      <label for="username">用户名:</label>
      <input id="username" type="text" name="username">
      <label for="loc">城市</label>
      <input id="loc" type="text" name="loc">

      <label for="age">年龄</label>
      <input id="age" type="text" name="age">


      <input type="submit">
  </form>

  <br>
  <button id="btn">点击获取用户信息</button>
  <table border="1">

  </table>


  </body>
  <script type="text/javascript">

      $('#btn').click(function () {
          $.getJSON("http://localhost:8080/show",function (data, status) {
              if(status == "success"){
                  $.each(data,function (index, obj) {
                      var id = obj['uid'];
                      var username = obj['uname'];
                      var age = obj['age'];
                      var loc = obj['loc'];
                      console.log(obj['uid']);
                      console.log(obj['age']);
                      console.log(obj['loc']);
                      console.log(obj['uname']);

                      $('table').append(
                          $('<tr>').append(
                              $('<td>').text(id)
                          ).append($('<td>').text(username))
                              .append($('<td>').text(age))
                              .append($('<td>').text(loc))
                      )

                  })
              }
          })
      })


  </script>

</html>
