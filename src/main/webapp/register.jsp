<%--
  Created by IntelliJ IDEA.
  User: lichangjie
  Date: 01/12/2015
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
    <form method="post" action="/addUser">
        <input type="text" id="uname" name="username"/>
        <input type="password" id="upw" name="password"/>
        <input type="password" id="cpw" name="cpassword"/>
        <input type="submit" id="submit"/>
    </form>
</body>
</html>
