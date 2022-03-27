<%--
  Created by IntelliJ IDEA.
  User: zjpp
  Date: 2022/2/8
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>哲铭书店用户登录</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>
</head>
<body><!-------------------login-------------------------->

<div class="left">
    <div class="sologan">
        <h1>行万里路，读万卷书</h1>
        <p>&nbsp</p>
        <p>落纸惊风起 摇空见露浓 丹青与文事 舍此复何求</p>
    </div>
    <div class="footer">
        <p>帮助中心 | 2022@zheming.com</p>
    </div>
</div>

<div class="right">
    <form action="login" method="post">
        <div class="post">
            <p>&nbsp</p>
            <p>&nbsp</p>
            <p>&nbsp</p>
            <p>&nbsp</p>
            <p>&nbsp</p>
            <p>&nbsp</p>
            <p><input type="text" name="username" value="" placeholder="用户名"></p>
            <p><input type="password" name="password" value="" placeholder="密码"></p>
            <p>&nbsp</p>
            <p><input type="submit" name="" value="登  录"></p>
            <p><a class="" href="reg.jsp">免费注册&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a><a href="forget.jsp">忘记密码？</a></p></form>
        </div>
    </form>
</div>

</body>
</html>
