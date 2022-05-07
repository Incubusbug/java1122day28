<%--
  Created by IntelliJ IDEA.
  User: incubus
  Date: 2022/4/28
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册系统</title>
</head>
<body>
<form action="TextServlet" method="post">
    <table border="1px" cellspacing="0" align="center" width="500px" height="400px">
        <tr>
            <td align="right">用户名</td>
            <td>

                <input type="text" name="username" id="username" >
                <span id="usernamespan"></span>
            </td>
        </tr>
        <tr>
            <td align="right">密码</td>
            <td>
                <input type="password" name="password" id="password" >
            </td>
        </tr>
        <tr>
            <td align="right">电话</td>
            <td>
                <input type="text" name="telephone" id="telephone" >
            </td>
        </tr>
        <tr>
            <td align="right">出生日期</td>
            <td>
                <input type="text" name="birthday" id="birthday">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="添加用户">
            </td>
        </tr>
    </table>
</form>
</body>
<script src="js/jquery.js"></script>
<script>
    //页面加载完
    $(function () {
            //失去焦点时校验
            $("#username").blur(
                function () {
                    $.ajax({
                        //请求路径
                        url:"CheckUsername",
                        //给服务端的参数(数据)
                        data:{"username":$(this).val()},
                        //请求方式
                        type:"post",
                        success:function (obj) {
                            if(obj == "yes"){
                                $("#usernamespan").html("用户名可用");
                                $("#usernamespan").css({color:"green",fontsize:"14px"});
                            }else {
                                $("#usernamespan").html("用户名不可用");
                                $("#usernamespan").css({color:"red",fontsize:"14px"});
                            }
                        }
                    })
                }
            )
        })
</script>

</html>
