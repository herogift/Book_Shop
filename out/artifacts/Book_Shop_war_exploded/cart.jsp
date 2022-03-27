<%--
  Created by IntelliJ IDEA.
  User: zjpp
  Date: 2022/3/13
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head lang="en">
  <meta charset="utf-8"/>
  <title>购物车</title>
  <link rel="stylesheet" type="text/css" href="css/public.css"/>
  <link rel="stylesheet" type="text/css" href="css/proList.css"/>
  <script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="cart mt"><!-----------------logo------------------->
  <!--<div class="logo"><h1 class="wrapper clearfix"><a href="index.html"><img class="fl" src="img/temp/logo.png"></a><img class="top" src="img/temp/cartTop01.png"></h1></div>-->
  <!-----------------site------------------->
  <div class="site"><p class=" wrapper clearfix"><span class="fl">购物车</span><img class="top"
                                                                                 src="img/temp/cartTop01.png"><a
          href="indexSelect" class="fr">继续购物&gt;</a></p></div><!-----------------table------------------->
  <div class="table wrapper">
    <div class="tr">
      <div>商品</div>
      <div>单价</div>
      <div>数量</div>
      <div>小计</div>
      <div>操作</div>
    </div>

    <c:forEach var="cart" items="${requestScope.cartList}">
      <div class="th">
        <div class="pro clearfix"><label class="fl"><input name="ck" type="checkbox" value="${cart.c_ID}"/>
          <span></span></label>
          <a class="fl" href="selectBookView?id=${cart.c_BID}">
          <dl class="clearfix">
            <dt class="fl"><img width="120" height="120" src="img/book/${cart.c_FileName}"></dt>
            <dd class="fl"><p>${cart.c_Name}</p>
              <p>商品详情:</p>
              <p>【暂无】</p></dd>
          </dl>
        </a></div>
        <div class="price">￥${cart.c_Price}</div>
        <div class="number"><p class="num clearfix">
          <img class="fl sub" src="img/temp/sub.jpg">
          <span datasrc="${cart.c_ID}" class="fl">${cart.c_Num}</span>
          <img class="fl add" src="img/temp/add.jpg"></p></div>
        <div class="price sAll">￥${cart.c_Price * cart.c_Num}</div>
        <div class="price"><a class="del" datasrc="${cart.c_ID}" href="#2">删除</a></div>
      </div>

    </c:forEach>

    <div class="goOn">空空如也~<a href="indexSelect">去逛逛</a></div>
    <div class="tr clearfix"><label class="fl"><input class="checkAll" type="checkbox"/><span></span></label>
      <p class="fl"><a href="#">全选</a><a href="#" class="del" datasrc="${cart.c_ID}">删除</a></p>
      <p class="fr"><span>共<small id="sl">0</small>件商品</span><span>合计:&nbsp;<small id="all">￥0.00</small></span><a
              href="javascript:toOrder()" class="count">结算</a></p></div>
  </div>
</div>

<script>
  function toOrder(){
    var str="";
    $("input[name='ck']:checked").each(function (index, item){
      if($("input[name='ck']:checked").length-1 == index){
        str += $(this).val();
      }else {
        str += $(this).val()+",";
      }
    });
    location.href="orderSelect?eids="+str;
  }
</script>
<div class="mask"></div>
<div class="tipDel"><p>确定要删除该商品吗？</p>
  <p class="clearfix"><a class="fl cer" href="#">确定</a><a class="fr cancel" href="#">取消</a></p></div>
<!--返回顶部-->
<div class="gotop">
  <c:if test="${isLogin==1}">
    <a href="showCart">
      <dl>
        <dt><img src="img/gt1.png"/></dt>
        <dd>去购<br/>物车</dd>
      </dl>
    </a> <a href="mygxin.jsp">
    <dl>
      <dt><img src="img/gt3.png"/></dt>
      <dd>个人<br/>中心</dd>
    </dl>
  </a>
  </c:if>
  <a href="#" class="toptop" style="display: none;">
    <dl>
      <dt><img src="img/gt4.png"/></dt>
      <dd>返回<br/>顶部</dd>
    </dl>
  </a>
  <p>400-800-8200</p></div>
<div class="msk"></div><!--footer-->
<div class="footer">
  <p class="dibu">哲铭书店&copy;2021-2022<br/>
    联系我们：400-800-66666</p></div>
<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
<script src="js/cart.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>