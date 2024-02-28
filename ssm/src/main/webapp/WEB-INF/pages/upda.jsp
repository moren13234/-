<%--
  Created by IntelliJ IDEA.
  User: huchenlong
  Date: 2020/7/17
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>修改学生信息</h3>
<form action="updateuser" method="post">
    学号：<input type="text" name="id"/><br/>
    姓名：<input type="text" name="name"/><br/>
    专业：<input type="text" name="career"/><br/>
    <input type="submit" value="修改"/><br/>
</form>

</body>
</html>
