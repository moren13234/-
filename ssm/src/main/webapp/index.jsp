<%--
  Created by IntelliJ IDEA.
  User: huchenlong
  Date: 2020/7/1
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <a href="account/findAll">测试查询</a>

        <h3>测试包</h3>
        <form action="account/save" method="post">
            姓名：<input type="text" name="name"/><br/>
            金额：<input type="text" name="money"/><br/>
            <input type="submit" value="保存"/><br/>
        </form>


        <h3>添加学生信息</h3>
        <form action="account/saveuser" method="post">
            学号：<input type="text" id="id" name="id"/><br/>
            姓名：<input type="text" name="name"/><br/>
            专业：<input type="text" name="career"/><br/>
            <input type="submit" value="保存"/><br/>
        </form>

        <h3>删除学生信息</h3>
        <form action="account/deleteuser" method="post">
            学号：<input type="text" name="id"/><br/>
            <input type="submit" value="删除"/><br/>
        </form>


        <a href="account/findAlluser">删除学生信息页面</a>

</body>
</html>
