<%--
  Created by IntelliJ IDEA.
  User: zjpp
  Date: 2022/2/8
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="head">
    <div class="wrapper clearfix">
        <div class="clearfix" id="top"><h1 class="fl"></h1>
            <div class="fr clearfix" id="top1"><p class="fl">
                <c:if test="${isLogin!=1}">
                <a href="login.jsp" id="login">登录</a><a href="reg.jsp" id="reg">注册</a>
                </c:if>

                <c:if test="${isLogin==1}">
                    你好：<a href="login.jsp" id="login">${user.nickname}</a>
                </c:if>

                <c:if test="${isAdminLogin==1}">
                    <a href="managers/admin_index.jsp" id="login">进入后台</a>
                </c:if>
            </p>
                <form action="#" method="get" class="fl"><input type="text" placeholder="热门搜索：生发小妙招"/><input
                        type="button"/></form>
                <div class="btn fl clearfix"><a href="mygxin.jsp"><img src="img/grzx.png"/></a><a href="#" class="er1"><img
                        src="img/ewm.png"/></a>
                    <c:if test="${isLogin==1}">
                        <a href="showCart"><img src="img/gwc.png"/></a>
                    </c:if>
                    </div>
            </div>
        </div>
        <ul class="clearfix" id="bott">
            <li><a href="indexSelect">首页</a></li>
            <c:forEach var="f" items="${f_list}">
                <li><a href="selectBook?fid=${f.c_ID}">${f.c_Name}</a>
                    <div class="sList2">
                        <div class="clearfix">
                            <c:forEach var="c" items="${c_list}">
                                <c:if test="${f.c_ID == c.c_PID}">
                                <a href="selectBook?cid=${c.c_ID}">${c.c_Name}</a>
                                </c:if>
                            </c:forEach>
                        </div>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>
