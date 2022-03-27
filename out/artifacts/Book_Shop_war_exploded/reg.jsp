<%--
  Created by IntelliJ IDEA.
  User: zjpp
  Date: 2022/3/6
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>哲铭书店注册页面</title>
    <link rel="stylesheet" href="css\style.css">
    <script src="js/calendar.js"></script>
    <script src="js/function.js"></script>
    <script src="js/jquery-1.12.4.min.js"></script>

</head>
<body>
<div class="left">
    <div class="sologan">
        <h1>行万里路，读万卷书</h1>
        <p>落纸惊风起 摇空见露浓 丹青与文事 舍此复何求</p>
    </div>
    <div class="footer">
        <p>帮助中心 | 2022@zheming.com</p>
    </div>
</div>

<div class="right">
    <form action="register" method="post" onsubmit="return checkForm(this)">
        <table>
            <caption>欢迎注册</caption>
            <tr>
                <td>已经有账号？<a href="login.jsp">登录</a></td>
            </tr>
            <div class="post">
            <p><input type="text" name="username" value="" onfocus="FocusItem(this)" onblur="CheckItem(this)" placeholder="请输入用户名"><span></span></p>
            <p><input type="text" name="name" value="" onfocus="FocusItem(this)" onblur="CheckItem(this)" placeholder="请输入姓名"><span></span></p>
            <p><input type="password" name="password" value="" onfocus="FocusItem(this)" onblur="CheckItem(this)" placeholder="请输入密码"><span></span></p>
            <p>
                <input type="password" name="rePassword" value="" onfocus="FocusItem(this)" onblur="CheckItem(this)" placeholder="请确认密码"><span></span>
            </p>
            <p>
                <input style="width: 15px;height: 15px" type="radio" name="sex" value="T" checked="checked">男
                <input style="width: 15px;height: 15px" type="radio" name="sex" value="F" >女
            </p>
            <p><input type="text" name="birthday" value="" onfocus="c.show(this)" placeholder="请输入出生日期"><span></span></p>
            <p><input type="text" name="email" value="" placeholder="请输入邮箱"><span></span></p>
            <p><input type="text" name="phone" value="" placeholder="请输入手机号"><span></span></p>
            <p><input type="text" name="address" value="" onfocus="FocusItem(this)" onblur="CheckItem(this)" placeholder="请输入送货地址"><span></span></p>
            <p><input class="code" type="text" name="veryCode" value="" onfocus="FocusItem(this)" onblur="CheckItem(this)" placeholder="请输入验证码">
                <img src="getcode" alt="看不清？换一张" onclick="change(this)"><span></span></p>

            <p><input type="submit" name="" value="注册"></p>
            </div>
        </table>

    </form>
</div>
</body>
</html>