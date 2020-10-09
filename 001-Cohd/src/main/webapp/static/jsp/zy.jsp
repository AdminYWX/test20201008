
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() +"/";
%>
<html>
<head>
    <title>主页</title>
<base href="<%=basePath%>">
</head>
<body>

<div align="center">
    <h3>学生注册查询系统</h3><br/>
    <img src="../img/IMG_0800.JPG"><br/>
    <a href="static/jsp/add.jsp">在线注册</a>
    <a href="static/jsp/sele.jsp">学生查询</a>
    <br/>
    <a href="que.do">请求转发</a>
    <a href="que2.do">重定向</a>
    <a href="index.jsp">登录验证</a>
</div>


</body>
</html>
