<%--
  Created by IntelliJ IDEA.
  User: zwh
  Date: 2021/5/17
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springmvc</title>
</head>
<body>
<a href="some.do">发送do请求</a>
<form action="check.do" method="get">
    <input type="submit" value="get请求">
</form>
<form action="check.do" method="post">
    <input type="submit" value="post请求">
</form>
<br/>
<form action="receive.do" method="post">
    姓名：<input type="text" value="请输入姓名" name="name"> <br/>
    年龄：<input type="text" value="请输入年龄" name="age">
    <input type="submit" value="提交">
</form>
<br/>
<form action="receive-param.do" method="post">
    姓名：<input type="text" value="姓名" name="n"> <br/>
    年龄：<input type="text" value="年龄" name="a">
    <input type="submit" value="提交">
</form>
</body>
</html>
