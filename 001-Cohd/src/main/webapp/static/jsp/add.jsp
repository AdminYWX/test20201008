
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() +"/";
%>
<html>
<head>
    <title>SSM整合-注册页面</title>
    <base href="<%=basePath%>">
</head>
<script type="text/javascript" src="static/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
    $(function(){
        $("#btn").click(function(){
            $.ajax({
                url:"addstudent.do",
                data:{
                    name:$("#Name").val(),
                    age:$("#age").val()
                },
                type:"post",
                dataType:"text",
                success:function(data){
                    alert(data);
                }
            })
        })
    })
</script>
<body>
    <form >
        姓名：<input type="text" id="Name" /><br/>
        年龄：<input type="text" id="Age" /><br/>
        <input type="button" id="btn" value="提交"><br/>
        <a href="index.jsp">返回主页</a>&nbsp;&nbsp;&nbsp;
        <a href="static/jsp/sele.jsp">学生查询</a>

    </form>
</body>
</html>
