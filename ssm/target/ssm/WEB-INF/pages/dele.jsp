<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: huchenlong
  Date: 2020/7/17
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table  class="cart_quality" border="1px">
    <tr>
        <th><input type="checkbox"></th>
        <th>用户id</th>
        <th>用户姓名</th>
        <th>职位</th>
        <th>操作</th>
    </tr>
<c:forEach items="${dele}" var="user">
    <tr style="text-align: center">
        <td><input type="checkbox"></td>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.career}</td>

        <td><a  href="upda">修改</a>&nbsp;
            <a  href="deleteuser?id=${user.id}">删除</a></td>
    </tr>
</c:forEach>

</table>


</body>
</html>
