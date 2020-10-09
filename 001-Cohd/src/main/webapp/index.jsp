
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() +"/";
%>
<html>
<head>
    <title>验证登录</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<h3>权限登录验证：</h3>
<hr style="background: aqua"  />
<div align="center">
<form action="ex.do" >
    姓名：<input type="text" name="name"/>
    <br/>
    密码：<input type="text" name="age">
    <br/>
    <input type="submit" value="登录">
</form>
</div>
</body>
</html>
