<%--
  Created by IntelliJ IDEA.
  User: zjpp
  Date: 2022/2/27
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
            <li><a href="admin_index.jsp"><i class="icon-font">&#xe012;</i>评论管理</a></li>
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