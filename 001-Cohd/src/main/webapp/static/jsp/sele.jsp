
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() +"/";
%>
<html>
<head>
    <title>学生查询</title>
    <base href="<%=basePath%>">
</head>
<script type="text/javascript" src="static/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
    $(function(){
        $("#btn").click(function(){
            $.ajax({
                url:"seleStudents.do",
                type:"post",
                dataType:"json",
                success:function(data){
                    $("#info").html("");
                    $.each(data,function(index,mth){
                        $("#info").append("<tr>")
                        .append("<td>"+mth.id+"</td>")
                        .append("<td>"+mth.name+"</td>")
                        .append("<td>"+mth.age+"</td>")
                        .append("</tr>")
                    })

                }
            })
        })
    })
</script>
<body>
<div id="mydiv" align="center">
    <h3>目前只支持查询所有用户</h3>
    <button id="btn">一键查询</button>
    <table id="myTable">
        <thead>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
        </tr>
        </thead>
        <tbody id="info">

        </tbody>
    </table>
</div>
</body>
</html>
