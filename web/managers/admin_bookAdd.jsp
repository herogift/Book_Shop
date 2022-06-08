<%--
  Created by IntelliJ IDEA.
  User: zjpp
  Date: 2022/2/21
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>书店后台管理</title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="admin_index.jsp" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="admin_index.jsp">首页</a></li>
                <li><a href="/Book_Shop_war_exploded/indexSelect" target="_blank">网站首页</a></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">管理员:</a></li>
                <li><a href="#">修改密码</a></li>
                <li><a href="/Book_Shop_war_exploded/managers/admin_logout">退出</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>常用操作</a>
                    <ul class="sub-menu">
                        <li><a href="/Book_Shop_war_exploded/managers/admin_douserselect"><i class="icon-font">&#xe008;</i>用户管理</a></li>
                        <li><a href="/Book_Shop_war_exploded/managers/cate_select"><i class="icon-font">&#xe005;</i>分类管理</a></li>
                        <li><a href="/Book_Shop_war_exploded/managers/admin_bookSelect"><i class="icon-font">&#xe006;</i>图书管理</a></li>
                        <li><a href="admin_index.jsp"><i class="icon-font">&#xe004;</i>订单管理</a></li>
                        <li><a href="admin_index.jsp"><i class="icon-font">&#xe012;</i>留言管理</a></li>
                        <li><a href="admin_index.jsp"><i class="icon-font">&#xe052;</i>新闻管理</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="icon-font">&#xe018;</i>系统管理</a>
                    <ul class="sub-menu">
                        <li><a href="#"><i class="icon-font">&#xe017;</i>系统设置</a></li>
                        <li><a href="#"><i class="icon-font">&#xe037;</i>清理缓存</a></li>
                        <li><a href="#"><i class="icon-font">&#xe046;</i>数据备份</a></li>
                        <li><a href="#"><i class="icon-font">&#xe045;</i>数据还原</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
<!--/sidebar-->
<div class="main-wrap">

    <div class="crumb-wrap">
        <div class="crumb-list"><i class="icon-font"></i><a href="admin_index.jsp">首页</a><span class="crumb-step">&gt;</span><a class="crumb-name" href="admin_bookSelect">图书管理</a><span class="crumb-step">&gt;</span><span>新增图书</span></div>
    </div>
    <div class="result-wrap">
        <div class="result-content">
            <form action="/Book_Shop_war_exploded/managers/admin_doBookAdd" method="post" enctype="multipart/form-data" id="myform" name="myform">
                <table class="insert-tab" width="100%">
                    <tbody>
                    <tr>
                        <th><i class="require-red">*</i>图书名称：</th>
                        <td>
                            <input class="common-text required" id="title" name="bookName" size="50" value="" type="text">
                        </td>
                    </tr>

                    <tr>
                        <th><i class="require-red">*</i>图书分类：</th>
                        <td>
                            <select class="common-text required"  name="PID">
                                <c:forEach var="f" items="${f_list }">
                                    <option value="${f.c_ID}" disabled="disabled">|-${f.c_Name}</option>
                                    <c:forEach var="c" items="${c_list}">
                                        <c:if test="${c.c_PID==f.c_ID}">
                                            <option value="${f.c_ID}-${c.c_ID}">&nbsp;&nbsp;&nbsp;|-${c.c_Name}</option>
                                        </c:if>
                                    </c:forEach>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>

                    <tr>
                        <th><i class="require-red">*</i>图书封面：</th>
                        <td>
                            <input class="common-text required" id="title" name="bookPhoto" size="50" value="" type="file">
                        </td>
                    </tr>

                    <tr>
                        <th><i class="require-red">*</i>图书价格：</th>
                        <td>
                            <input class="common-text required" id="title" name="bookPrice" size="50" value="" type="text">
                        </td>
                    </tr>

                    <tr>
                        <th><i class="require-red">*</i>图书介绍：</th>
                        <td>
                            <input class="common-text required" id="title" name="bookDesc" size="50" value="" type="text">
                        </td>
                    </tr>

                    <tr>
                        <th><i class="require-red">*</i>图书库存：</th>
                        <td>
                            <input class="common-text required" id="title" name="bookStock" size="50" value="" type="text">
                        </td>
                    </tr>


                    <tr>
                        <th></th>
                        <td>
                            <input class="btn btn-primary btn6 mr10" value="提交" type="submit">
                            <input class="btn btn6" onClick="history.go(-1)" value="返回" type="button">
                        </td>
                    </tr>
                    </tbody></table>
            </form>
        </div>
    </div>

</div>
<!--/main-->
</div>
</body>
</html>