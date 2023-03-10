<%--
  Created by IntelliJ IDEA.
  User: randychu
  Date: 3/9/23
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
String input = request.getParameter("input");
if (input != null) {
    if (input.equals("burgers")) {
        response.sendRedirect("/gross.jsp");
    }
}
    request.setAttribute("input", input);

%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello, Zenith!</h1>
<form method="POST" action="/First.jsp">
    <input type="text" name="input">
    <button>Submit</button>
</form>
<h1>Your food is: ${input}</h1>
</body>
</html>
