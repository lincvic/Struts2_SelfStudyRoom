<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/11/21
  Time: 下午4:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>这是一个详情页</title>
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
        <h1>下面为近期的自习室</h1>
        <p>登陆成功<br>空闲时间格式为 年/月/日/空闲的是第几大节</p>
        <s:fielderror/>
        <table id="tab">
            <tr>
                <td>空闲时间</td>
                <td>教室号码</td>
            </tr>
            <s:iterator value="roomList" var="room">
                <tr>
                    <td><s:property value="#room.blanktime"/></td>
                    <td><s:property value="#room.classno"/></td>
                </tr>

            </s:iterator>

        </table>
        <a href="index.jsp">点我前往登陆页面</a>
    </header>
</section>

<!-- Footer -->
<section id="footer">
    <footer>
        <ul class="copyright">
            <li>没有教室信息了，之后再来看看吧</li>
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

