<%--
  Created by IntelliJ IDEA.
  User: zjpp
  Date: 2022/1/27
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>书店后台管理</title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
</head>
<body>

<%@ include file="menu.jsp" %>

    <!--/sidebar-->
    <div class="main-wrap">
        <div class="result-wrap">
            <div class="result-title">
                <h1>快捷操作</h1>
            </div>
            <div class="result-content">
                <div class="short-wrap">
                    <a href="admin_useradd.jsp"><i class="icon-font">&#xe001;</i>新增用户</a>
                    <a href="/Book_Shop_war_exploded/managers/admin_bookSelect"><i class="icon-font">&#xe005;</i>新增图书</a>
                    <a href="#"><i class="icon-font">&#xe01e;</i>评论管理</a>
                </div>
            </div>
        </div>
        <div class="result-wrap">
            <div class="result-title">
                <h1>系统基本信息</h1>
            </div>
            <div class="result-content">
                <ul class="sys-info-list">
                    <li>
                        <label class="res-lab">操作系统</label><span class="res-info">Windows 10</span>
                    </li>
                    <li>
                        <label class="res-lab">运行环境</label><span class="res-info">IntelliJ IDEA 2021.1.1/jdk9/tomcat-9.0.55 </span>
                    </li>
                    <li>
                        <label class="res-lab">上传附件限制</label><span class="res-info">2M</span>
                    </li>
                    <li>
                        <label class="res-lab">北京时间</label><span class="res-info">2022年1月18日 21:08:24</span>
                    </li>
                    <li>
                        <label class="res-lab">服务器域名/IP</label><span class="res-info">localhost [ 10.254.150.24 ]</span>
                    </li>
                    <li>
                        <label class="res-lab">Host</label><span class="res-info">10.254.150.24</span>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>
