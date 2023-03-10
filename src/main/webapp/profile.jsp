<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    request.setAttribute("username", username);
    request.setAttribute("password", password);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<style>
    li{
        list-style: none;
    }
    nav{
        display: flex;
    }
</style>
<body>
<%@ include file="partials/navbar.jsp"%>

<h1>Welcome, ${username}!</h1>
<p>Your password is: ${password}</p>
</body>
</html>


