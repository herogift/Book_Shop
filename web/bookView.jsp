<%--
  Created by IntelliJ IDEA.
  User: zjpp
  Date: 2022/2/26
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>详情页</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/proList.css"/>
</head>
<body><!------------------------------head------------------------------>
<%@ include file="header.jsp" %>
<!-----------------------Detail------------------------------>
<div class="detCon">
    <div class="proDet wrapper">
        <div class="proCon clearfix">
            <div class="proImg fl"><img class="det" src="img/book/${book.b_FileName}"/></div>
            <div class="fr intro">
                <div class="title"><h4>${book.b_Name}</h4>
                    <p>【破损补寄】【包邮】【${book.b_Desc}】</p><span>￥${book.b_Price}</span></div>
                <div class="proIntro"><p>选择商品</p>
                    <div class="smallImg clearfix categ"><p class="fl"><img src="img/book/${book.b_FileName}"
                                                                            alt="${book.b_Name}"
                                                                            data-src="img/book/${book.b_FileName}"></p>
                        </div>

                    <p>数量&nbsp;&nbsp;库存<span>${book.b_Stock}</span>本</p>
                    <div class="num clearfix"><img class="fl sub" src="img/temp/sub.jpg">
                        <span id="count" class="fl" contentEditable="true">1</span><img
                            class="fl add" src="img/temp/add.jpg">
                        <p class="please fl">请选择商品属性!</p></div>
                </div>
                <div class="btns clearfix">
                    <a href="javascript:shopAdd(${book.b_ID},'z')"><p class="buy fl">立即购买</p></a>
                    <a href="javascript:shopAdd(${book.b_ID},'s')"><p class="cart fr">加入购物车</p></a>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    function shopAdd(id, flag){
        var count = document.getElementById("count").innerHTML;
        location.href='cartAdd?id='+id+'&count='+count+'&flag='+flag;
    }
</script>


<div class="introMsg wrapper clearfix">
    <div class="msgL fl">
        <div class="msgTit clearfix"><a class="on">商品详情</a><a>所有评价</a></div>
    </div>
</div>
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
<script src="js/jquery.SuperSlide.2.1.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
<script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
<script src="js/cart.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">jQuery(".bottom").slide({
    titCell: ".hd ul",
    mainCell: ".bd .likeList",
    autoPage: true,
    autoPlay: false,
    effect: "leftLoop",
    autoPlay: true,
    vis: 1
});</script>
</body>
</html>
