<%--
  Created by IntelliJ IDEA.
  User: zjpp
  Date: 2022/2/9
  Time: 0:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <div class="crumb-wrap">
        <div class="crumb-list"><i class="icon-font"></i><a href="admin_index.jsp">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">分类管理</span></div>
    </div>

    <div id="register" class="result-wrap">
        <form action="#" id="myform" method="post">
            <div class="result-title">
                <div class="result-list">
                    <a href="#"><i class="icon-font"></i>新增分类</a>

                    <!--  a id="updateOrd" href="javascript:void(0)"><i class="icon-font"></i>更新排序</a -->
                </div>
            </div>
            <div class="result-content">
                <table class="result-tab" width="40%">
                    <tr>

                        <th>ID</th>
                        <th>分类名称</th>
                        <th>操作</th>

                    </tr>

                    <c:forEach var="cate" items="${cateList}">

                        <c:if test="${cate.c_PID==0 }">
                            <tr>
                                <td>${cate.c_ID}</td>
                                <td>|-${cate.c_Name}</td>
                                <td><a href="#?id=${cate.c_ID }">修改</a> <a href="javascript:catedel(${cate.c_ID })">删除</a></td>

                            </tr>
                            <c:forEach var="zcate" items="${cateList}">
                                <c:if test="${zcate.c_PID==cate.c_ID }">
                                    <tr>
                                        <td>${zcate.c_ID }</td>
                                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;｜-${zcate.c_Name }</td>
                                        <td><a href="#?id=${zcate.c_ID }">修改</a> <a href="javascript:catedel(${zcate.c_ID })">删除</a></td>

                                    </tr>
                                </c:if>
                            </c:forEach>
                        </c:if>
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
