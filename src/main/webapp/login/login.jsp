<%--
  Created by IntelliJ IDEA.
  User: zhongzhaolong
  Date: 2018/10/14
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getContextPath();
%>
<script type="text/javascript">
    var basePath="<%=basePath%>";
</script>
<html>
<head>
    <link rel="stylesheet" href="../resource/plugin/bootstrap-4.1.3-dist/css/bootstrap.min.css">
    <title>登陆</title>
</head>
<body>
<form action="<%=basePath%>/cuser/find" method="post">
    <p>First name: <input type="text" name="fname" /></p>
    <p>Last name: <input type="text" name="lname" /></p>
    <input type="submit" value="登陆" />
</form>
<button class="b-login">显示用户数据</button>
</body>
<script type="text/javascript" src="../resource/plugin/jQuery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="../resource/plugin/bootstrap-4.1.3-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="login.js"></script>
</html>
