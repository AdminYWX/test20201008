
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求转发与重定向</title>
</head>
<body>
请求转发与重定向结果页面
姓名：${param.name}
年龄：${param.age}
<!--param.name相当于 request.getParameter("name")-->
</body>
</html>
