<%--
  Created by IntelliJ IDEA.
  User: randychu
  Date: 3/14/23
  Time: 9:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<form action="/product" method="post">
    <label for= "name" id = "name"> Name </label>
    <input name= "name" type="text">
    <label for= "price" id = "price"> Price </label>
    <input name = "price" type="text">
    <button>Submit</button>

    <h2>Here are all the products: </h2>
    <c:forEach var="product" items="${products}">
        <div>
            <h3>${product.name}</h3>
            <p>Price: $${product.price}</p>

        </div>
    </c:forEach>

</form>
</body>
</html>
