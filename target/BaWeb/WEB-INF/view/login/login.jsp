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
    <link rel="stylesheet" href="../../../resource/plugin/bootstrap-4.1.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../resource/icon/ali_icon/ali_common.css">
    <link rel="stylesheet" href="../../../resource/css/common.css">
    <link rel="stylesheet" href="../../../resource/css/login_style.css">

    <title>登陆</title>
</head>

<script src="../../../resource/icon/ali_icon/iconfont.js"></script>

<body>
<div id="particles">
    <div class="overlay"></div>
</div>
<div style="width:100%">
    <form action="/j_security_check" method="post" class ="login-form text-center" style="width:-webkit-fill-available">
        <p>
            <svg class="icon" aria-hidden="true" style="width:20px; height:20px">
                <use xlink:href="#icon-account"></use>
            </svg>
            <input type="text" name="j_username" />
        </p>
        <p>
            <svg class="icon" aria-hidden="true" style="width:20px; height:20px">
                <use xlink:href="#icon-password"></use>
            </svg>
            <input type="password" name="j_password" /></p>
        <input type="submit" value="登陆" class="login_button" style=""/>
    </form>
</div>
<button class="b-login" hidden>显示用户数据</button>
</body>
<script type="text/javascript" src="../../../resource/plugin/jQuery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="../../../resource/plugin/bootstrap-4.1.3-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../../resource/view/login/login.js"></script>
</html>
