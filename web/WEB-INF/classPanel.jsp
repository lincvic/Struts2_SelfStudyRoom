<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/11/21
  Time: 下午8:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>这是一个学生管理员页面</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
    <link rel="stylesheet" href="assets/css/main.css" />
    <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
    <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
    <style>
        #tab{color: #e8f0f3;}
    </style>
</head>
<body>

<!-- Header -->
<section id="header">
    <header class="major">
        <h1>自习室管理页面</h1>
        <p>下面为自习室信息</p>

        <s:fielderror/>
        <table id="tab">
            <tr>
                <td>id</td>
                <td>空闲时间</td>
                <td>教室号码</td>
                <td colspan="2">操作</td>

            </tr>
            <s:iterator value="roomList" var="room">
                <tr>
                    <td><s:property value="#room.id"/></td>
                    <td><s:property value="#room.blanktime"/></td>
                    <td><s:property value="#room.classno"/></td>
                    <td><a href="modiRoomJump.action?roomId=<s:property value='#room.id'/>">修改教室信息</a></td>
                    <td><a href="delRoom.action?roomId=<s:property value='#room.id'/>">删除教室信息</a></td>
                </tr>

            </s:iterator>

        </table>
        <p>
            <a href="adminAddRoomJump.action" class="special button">点我添加新教室</a>
            <br><br><br>
            <a href="adminPanelJump.action" class="button special">点我返回功能列表</a>
        </p>
    </header>
    <div class="container">
    </div>
</section>
<!-- Footer -->
<section id="footer">
    <footer>
        <ul class="copyright">
            <li>&copy; Untitled</li><li>Design: </li>
        </ul>
    </footer>
</section>

<!-- Scripts -->
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/jquery.scrollex.min.js"></script>
<script src="assets/js/jquery.scrolly.min.js"></script>
<script src="assets/js/skel.min.js"></script>
<script src="assets/js/util.js"></script>
<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
<script src="assets/js/main.js"></script>

</body>
</html>
