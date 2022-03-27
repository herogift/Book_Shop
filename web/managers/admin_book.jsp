<%--
  Created by IntelliJ IDEA.
  User: zjpp
  Date: 2022/2/21
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>哲铭书店后台管理</title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
</head>
<body>

<%@ include file="menu.jsp" %>
<!--/sidebar-->
<div class="main-wrap">

    <div class="crumb-wrap">
        <div class="crumb-list"><i class="icon-font"></i><a href="admin_index.jsp">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">图书管理</span></div>
    </div>

    <div id="register" class="result-wrap">
        <form action="#" id="myform" method="post">
            <div class="result-title">
                <div class="result-list">
                    <a href="/Book_Shop_war_exploded/managers/admin_toBookAdd"><i class="icon-font"></i>新增图书</a>
                </div>
            </div>
            <div class="result-content">
                <table class="result-tab" width="60%">
                    <tr>

                        <th>ID</th>
                        <th>商品名称</th>
                        <th>操作</th>

                    </tr>

                    <c:forEach var="b" items="${book}">
                        <tr>
                            <td>${b.b_ID} </td>
                            <td><img src="../img/book/${b.b_FileName}" width="80" height="80">${b.b_Name}</td>
                            <td>
                                <a href="">修改</a>
                                <a href="">删除</a>
                            </td>
                        </tr>
                    </c:forEach>


                    <script>
                        function catedel(id) {
                            if(confirm("你确认要删除这个分类吗")) {
                                location.href="admin_docatedel?id="+id;

                            }
                        }
                    </script>

                </table>

            </div>
        </form>
    </div>
</div>
<!--/main-->
</div>
</body>
</html>

