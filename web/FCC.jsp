<%--
  Created by IntelliJ IDEA.
  User: incubus
  Date: 2022/5/5
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #div{
            cursor: pointer;
        }
    </style>
    <script src="js/jquery.js"></script>
    <script>
        $(function () {
            $("#productname").keyup(function () {
                //获得输入框中的数据
                var productname= $("#productname").val();
                //异步请求查询数据
            $.getJSON("ProductServlet",{"productname":productname},function (data) {
                if(data != null){
                    var str = "";
                    for (var i = 0; i < data.length; i++) {
                        str +="<div>"+data[i].productname +"</div>"
                    }
                    $("#div").html(str)
                }
            })
            })
        })
        //点击吧div的值显示到输入框中
        function changeContent(e) {
            //找到事件
            var e = e || event;//浏览器兼容
            var target = e.target || e.srcElement;//不同浏览器获得数据源
            //点击的事件添加到输入框中
            $("#productname").val($(target).html());
            //展示结果的div没有内容
            $("#div").html("")//上边消息已经添加入输入框,清空下边的备选项
        }
    </script>
</head>
<body>
<%--    填写数据的文本框--%>
<input type="text" name="productname" id="productname" style="width: 300px">
<%--展示结果 div--%>
<div id="div" style="width: 300px" onclick="changeContent(event)"></div>
</body>
</html>
