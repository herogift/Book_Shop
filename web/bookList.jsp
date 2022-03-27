<%--
  Created by IntelliJ IDEA.
  User: zjpp
  Date: 2022/2/12
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head lang="en">
    <meta charset="utf-8"/>
    <title>${title}</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/proList.css"/>
</head>
<body><!------------------------------head------------------------------>
<%@ include file="header.jsp" %>
<div class="banner"><a href="#"><img src="img/temp/banner1.jpg"/></a></div>
<!-------------------current---------------------->
<div class="current">
    <div class="wrapper clearfix"><h3 class="fl">${title}</h3>
        <div class="fr choice"><p class="default">排序方式</p>
            <ul class="select">
                <li>新品上市</li>
                <li>销量从高到低</li>
                <li>销量从低到高</li>
                <li>价格从高到低</li>
                <li>价格从低到高</li>
            </ul>
        </div>
    </div>
</div><!----------------proList------------------------->
<ul class="proList wrapper clearfix">
    <c:forEach var="b" items="${list}">
        <li><a href="selectBookView?id=${b.b_ID}">
            <dl>
                <dt><img src="img/book/${b.b_FileName}"></dt>
                <dd>${b.b_Name}</dd>
                <dd>￥${b.b_Price}</dd>
            </dl>
        </a></li>
    </c:forEach>
</ul>
<!--返回顶部-->
<div class="gotop">
    <c:if test="${isLogin==1}">
    <a href="showCart">
    <dl class="goCart">
        <dt><img src="img/gt1.png"/></dt>
        <dd>去购<br/>物车</dd>
    </dl>
</a>
    <a href="mygxin.jsp">
    <dl>
        <dt><img src="img/gt3.png"/></dt>
        <dd>个人<br/>中心</dd>
    </dl>
</a>
    </c:if><a href="#" class="toptop" style="display: none;">
    <dl>
        <dt><img src="img/gt4.png"/></dt>
        <dd>返回<br/>顶部</dd>
    </dl>
</a></div>
<div class="msk"></div><!--footer-->
<div class="footer">
    <div class="footer">
        <p class="dibu">哲铭书店&copy;2021-2022<br/>
            联系我们：400-800-66666</p>
    </div>
<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
<script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
<script src="js/cart.js" type="text/javascript" charset="utf-8"></script>
</div>
</body>
</html>