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
        <h1>学生管理页面</h1>
        <p>下面为学生信息</p>
        <s:fielderror/>
        <table id="tab">
            <tr>
                <td>id</td>
                <td>学号</td>
                <td>姓名</td>
                <td>密码</td>
                <td>年级</td>
                <td>邮箱</td>
                <td>手机号</td>
                <td colspan="2">操作</td>

            </tr>
            <s:iterator value="stuList" var="stu">
                <tr>
                    <td><s:property value="#stu.id"/></td>
                    <td><s:property value="#stu.sno"/></td>
                    <td><s:property value="#stu.name"/></td>
                    <td><s:property value="#stu.password"/></td>
                    <td><s:property value="#stu.grade"/></td>
                    <td><s:property value="#stu.email"/></td>
                    <td><s:property value="#stu.phonenum"/></td>
                    <td><a href="modiStuJump.action?stuId=<s:property value='#stu.id'/>">修改学生信息</a></td>
                    <td><a href="delStu.action?stuId=<s:property value='#stu.id'/>">删除学生信息</a></td>
                </tr>

            </s:iterator>

        </table>
        <a href="adminPanelJump.action" class="button special">点我返回功能列表</a>
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
