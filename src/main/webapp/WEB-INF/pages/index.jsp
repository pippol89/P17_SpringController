<%--
  Created by IntelliJ IDEA.
  User: Андрей
  Date: 28.07.2022
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="<c:url value='/styles/main.css' context='/P17_SpringController_war/app'/>">
    <script src="<c:url value='/scripts/main.js' context='/P17_SpringController_war/app'/>"></script>
</head>
<body>
<h1>Hello from index page!</h1>
<br>
<button id="button1" onclick="sayHello()">Button</button>
</body>
</html>
