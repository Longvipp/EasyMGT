<%--
  Created by IntelliJ IDEA.
  User: zhongzhaolong
  Date: 2018/10/19
  Time: 23:48
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
    <link rel="stylesheet" href="resource/plugin/bootstrap-4.1.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="resource/plugin/DataTables/datatables.min.css"/>
    <title>首页</title>
</head>
<body>
    <div style="padding-left: 1%;padding-right: 1%;padding-top: 1%;">
        <div style="width: 100%;text-align: -webkit-center;">
            <p style="width: fit-content;text-align: center;font-size: 30px;">ediary 数据同步管理</p>
        </div>

        <button class="display_ediaryinfo" style="cursor:pointer;margin-bottom: 20px;">显示ediary历史数据</button>
        <div>
            <table id="ediary_his_table"></table>
        </div>
    </div>
</body>
<script type="text/javascript" src="../../../resource/plugin/jQuery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="../../../resource/plugin/bootstrap-4.1.3-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../../resource/plugin/DataTables/datatables.min.js"></script>
<script type="text/javascript" src="../../../resource/view/index/index.js"></script>
</html>


