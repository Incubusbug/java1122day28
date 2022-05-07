<%--
  Created by IntelliJ IDEA.
  User: incubus
  Date: 2022/4/28
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="button" value="异步请求" onclick="fun()">
<input type="button" value="异步请求" onclick="fun2()">
</body>
<script src="js/jquery.js"></script>
<script>
    <%--    $.getJSON(url,[data],[success],[returnType])--%>
<%--路径,数据,成功后执行的方法,返回值类型--%>
    function fun() {
        $.get(
        "AjaxServlet","username=lisi",function (data) {
                alert(data);
            },"text");
    }
    function fun2() {
        $.post(
            "AjaxServlet","username=wangwu",function (data) {
                alert(data);
            },"text");
    }
</script>
</html>
