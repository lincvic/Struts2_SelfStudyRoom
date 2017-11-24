<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/11/21
  Time: 下午7:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>这是一个管理员登陆页面</title>
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
        <h1>欢迎来到自习室查询系统管理员登陆页面</h1>
    </header>
    <div class="container">
        <s:fielderror fieldName="adminLoginError"/>
        <s:form action="adminLogin" method="post">
            <s:textfield label="管理员账号" name="username"/>
            <s:password label="管理员密码" name="password"/>
            <s:submit class="button special scrolly" value="点我进行登陆"/>
        </s:form>
        <a href='../index.jsp'>点我前往普通学生登陆页面</a>
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