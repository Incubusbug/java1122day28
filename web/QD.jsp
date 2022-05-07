<%--
  Created by IntelliJ IDEA.
  User: bug
  Date: 2022/5/5
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.js"></script>
    <script>
        //当页面加载完成
        $(function () {
            //1 查询出所有国家 将查询到的结果写到countryset中
            $.get("CountryServlet",function (data) {
               //data并不是js的对象 是字符串  <option value="1">中国</option>
                var obj = eval("("+ data +")");
                var str = "";
                for(var i= 0; i < obj.length; i++){
                    str  = str +"<option value = '" +obj[i].id +"'>" +obj[i].name + "</option>";
                }
                $("#countrysel").html($("#countrysel").html()+ str);
            });
            //2 国家选取完毕  异步加载城市     改变事件
            $("#countrysel").change(function () {
                //获得国家id  选择框中的内容
                var countryId =$("#countrysel").val();
                $.getJSON("CityServlet",{"countryId":countryId},function (data) {
                    //data不要使用eval函数处理
                    if(data.length > 0){
                        var str = "";
                        for (var i = 0; i < data.length; i++) {
                            //<option value='1'>北京</option>
                            str += "<option value='"+ data[i].id + "'>" +data[i].name+"</option>";
                        }
                        $("#citysel").html(str);
                    }else {
                        $("#citysel").html("<option value='0'>-请选择-</option>")
                    }
                })
            })
        })
    </script>
</head>
<body>

    <select name="countrysel" id="countrysel">
        <option value="0">-请选择-</option>
    </select>
    <select name="citysel" id="citysel">
        <option value="0">-请选择-</option>
    </select>
</body>
</html>
