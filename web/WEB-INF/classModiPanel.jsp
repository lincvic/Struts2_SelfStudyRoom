<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/11/22
  Time: 下午5:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>这是一个修改页面</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
    <link rel="stylesheet" href="assets/css/main.css" />
    <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
    <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
</head>
<body>



<!-- Header -->
<section id="header">
    <header class="major">
        <h1>教室信息修改</h1>
        <p>在下面填写修改信息</p>
    </header>
</section>
<!-- One -->
<section id="one" class="main special">
    <div class="container">
        <span class="image fit primary"><img src="images/pic01.jpg" alt="" /></span>
        <div class="content">
            <header class="major">
                <h2>教室信息填写</h2>
            </header>
        </div>
        <s:fielderror fieldName="modiRoomError"/>
        <s:form action="modiRoom" method="POST">
            <s:textfield label="ID" name="id" value="%{#session.roomById.id}" readonly="true"/>
            <s:textfield label="空闲时间" name="blanktime" value="%{#session.roomById.blanktime}"/>
            <s:textfield label="教室号" name="classno" value="%{#session.roomById.classno}"/>
            <s:submit value="提交"/>
        </s:form>
        <a href="adminPanelJump.action">点我前往管理员功能页面</a>
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
