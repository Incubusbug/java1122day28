<%--
  Created by IntelliJ IDEA.
  User: incubus
  Date: 2022/4/28
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
</head>
<body>
    <input type="button" value="异步请求" onclick="fun()">
</body>
<script src="js/jquery.js"></script>
<script>
    function fun() {
        $.ajax({
            //请求资源路径
           url:"AjaxServlet",
            //请求参数
           data:"username=张三",
            //请求方法
           type:"post",
            //数据形式 text
           dataType:"text",
            //请求成功后执行方法
            //data是一个形参 服务器端返回数据
           success:function (data) {
                alert(data);
           },
           error:function () {
                alert("失败")
           }
        });
    }
</script>
</html>
