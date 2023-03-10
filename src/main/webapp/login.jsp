<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Login</title>
</head>
<style>
  h2{
    color: red;
  }
</style>
<body>
<form method="POST" action="/login.jsp" action="/profile.jsp">
  <%@ include file="navbar.jsp"%>
  <h1>Please Login</h1>
  <%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username != null && password != null && username.equals("admin") && password.equals("password")) {
      // Set the username and password as attributes in the request object
      request.setAttribute("username", username);
      request.setAttribute("password", password);
      // Redirect to the profile page
      response.sendRedirect(String.format("/profile.jsp?username=%s&&password=%s",username,password));
    } else if (username != null || password != null){
      out.println("<h2 style=\"color:red\">Wrong Username or Password. Please try again.</h2>");
    }
  %>
  <h1>Username</h1>
  <input type="text" name="username">
  <h1>Password</h1>
  <input type="password" name="password">
  <button>Submit</button>
</form>
</body>
</html>
