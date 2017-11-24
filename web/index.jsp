<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/11/21
  Time: 上午8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
<head>
  <title>这是一个首页</title>
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
    <h1>欢迎来到自习室查询系统</h1>
    <p>请先进行登陆</p>
  </header>
  <div class="container">
    <s:fielderror fieldName="loginError"/>
    <s:form action="login" method="post">
      <s:textfield label="学号" name="sno"/>
      <s:password label="密码" name="password"/>
      <s:submit class="button special scrolly" value="点我进行登陆"/>
    </s:form>
  </div>
</section>
<!-- One -->
<section id="one" class="main special">
  <div class="container">
    <span class="image fit primary"><img src="images/pic01.jpg" alt="" /></span>
    <div class="content">
      <header class="major">
        <h2>没有账号？</h2>
        <a href="register.jsp" class="button special">点我进行注册</a>
      </header>
    </div>
  </div>
</section>

<!-- Two -->
<section id="two" class="main special">
  <div class="container">
    <span class="image fit primary"><img src="images/pic01.jpg" alt="" /></span>
    <div class="content">
      <header class="major">
        <h2>是管理员？</h2>
        <a href="adminJump.action" class="button special">点我进入管理员登陆页面</a>
      </header>
    </div>
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
